package com.lib;
import javax.comm.*;
import java.io.*;

public class  PortConnection extends Thread implements SerialPortEventListener
{
	private CommPortIdentifier portId;
    private SerialPort sPort;

    private OutputStream os;
    private InputStream is;
    
	private String portName;
	private int baudRate;
	private int flowControlIn;
	private int flowControlOut;
	private int dataBits;
	private int stopBits;
	private int parity;

	private String response;
	private int requestcode;

	public PortConnection()
	{
		portName="COM12";
		baudRate=9600;
		flowControlIn=0;
		flowControlOut=0;
		dataBits=8;
		stopBits=1;
		parity=0;

		portId=null;
		sPort=null;

		response=null;
		requestcode=0;
	}

	public String openConnection(String data)
	{
		response=null;

		try
		{
			//identifying the COM1 port which thows NoSuchPortException
			portId=CommPortIdentifier.getPortIdentifier(portName);

			//connectiong to port COM1 which throws PortInUseException
			sPort = (SerialPort)portId.open("Smart lib", 1);

			//setting the parameters to the serial port as 9600, 8, 1, 0
			sPort.setSerialPortParams(baudRate, dataBits, stopBits, parity);

			//creating output stream used to pass request of reading, writing, status.....etc. throws IOException
			os=sPort.getOutputStream();

			//creating input stream used to read the response from the port for a given request throws IOException
			is=sPort.getInputStream();

			//setting interest in receiving notification when input data is available.
			sPort.notifyOnDataAvailable(true);

			//setting interest in receiving notification when the output buffer is empty.
			sPort.notifyOnOutputEmpty(false);

			//adding the Listener to the port which throws TooManyListenersException
			sPort.addEventListener(this);

			//sending the data to the port
			os.write(data.getBytes());

			//setting enability of receive timeout, if this feature is supported by the driver
			sPort.enableReceiveTimeout(300);

			//making it to wait till the response from the serial port
			while(response==null)
			{
				this.sleep(25);
			}
		}
		catch(Exception e)
		{
			//printing the exception message and closing the port connection
			response=e.getMessage();
			if(sPort!=null)
				sPort.close();
		}

		//returning the response of the serial port to the requested client
		return response;
	}


	public void closeConnection()
    {
        if(sPort != null)
        {
            try
            {
				//closing the streams created on serial port com1
                os.close();
                is.close();
            }
            catch(IOException ioe)
            {
                System.err.println("Error in Closing Streams : "+ioe.getMessage());
            }
			try
			{
				//closing the serial port com1
	            sPort.close();
			}
			catch(Exception e)
			{
                System.err.println("Error in Closing Serial Post: "+e.getMessage());
			}
		}
    }

	public void serialEvent(SerialPortEvent spe)
    {
		//String buffer to hold the response from port
		StringBuffer sb=new StringBuffer();
		int i=0;

		try
		{
			while((i=is.read())!=-1)
			{
				//appending char by char to string buffer
				sb.append((char)i);
				if(sb.indexOf("ERROR")>0 || sb.indexOf("OK")>0)
					break;
			}
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
		//storing all the string in response object
		response=sb.toString();
	}
}