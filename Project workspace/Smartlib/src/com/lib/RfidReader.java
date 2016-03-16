package com.lib;
import java.io.IOException;
import java.io.InputStream;

import javax.comm.CommPortIdentifier;
import javax.comm.SerialPort;
import javax.comm.SerialPortEvent;
import javax.comm.SerialPortEventListener;

	public class RfidReader implements SerialPortEventListener
	{

	       InputStream is=null;
	       SerialPort sPort=null;
	       CommPortIdentifier portId=null;
	       String response=null;

	       public String enableRFIDReader()
	       {
	               try {
	            	   
	                       portId = CommPortIdentifier.getPortIdentifier("COM12");
	                       sPort = (SerialPort) portId.open("IdeaLabs", 1);
	                       sPort.setSerialPortParams(9600, 8, 1, 0);
	                       is = sPort.getInputStream();

	                       sPort.notifyOnDataAvailable(true);
	                       sPort.addEventListener(this);

	                       while (response==null) {
                               Thread.sleep(500);
                               System.out.println("Searching for product....");
                       }
               }
               catch (Exception e)
               {
            	   try {
           			//Process p = Runtime.getRuntime().exec(".\\docs\\javaw.bat");
           			    } catch(Exception e1) {
           			      e1.printStackTrace();
           			    }
            	   
	                      
	               System.out.println("before returning:"+response);
	               
               }
				return response;
	       }

	       public void serialEvent(SerialPortEvent spe)
	       {
	               response=null;
	               StringBuffer sb = new StringBuffer();
	               System.out.println("Event raised for data reading");
	               try {
	                               int n = 0;
	                               while((n=is.read())!=-1)
                               {
                            	   System.out.print((char)n);
	                               }
	                            	   
	                               
	                               for(int i=0; i<12; i++)
	                               {
	                                       n = is.read();
	                                      
	                                       System.out.print(sb.append((char)n));
	                                       
	                               }
	                       }
	                       catch (Exception e) {
	                               e.printStackTrace();
	                       }finally{
	                       try {
							is.close();
		                       sPort.notifyOnDataAvailable(false);

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                       }
	                       response=sb.substring(1,11).toString();
	                       System.out.println("total id: "+response);
	                       
	       }

	       public void closeConnection() {
	               if (sPort != null) {
	                       try {
	                               is.close();
	                       } catch (IOException ioe) {
	                               System.err.println("Error in Closing Streams : "
	                                               + ioe.getMessage());
	                       }
	                       try {
	                               sPort.close();
	                       } catch (Exception e) {
	                               System.err.println("Error in Closing Serial Post: "
	                                               + e.getMessage());
	                       }
	                       response=null;
	               }
	               System.out.println("closed serial port com1");
	       }
	    public  static void main(String args[])
	    {
	    	RfidReader rr=new RfidReader();
	    	String rfidtagno=rr.enableRFIDReader();
	    	
	    	System.out.println("the rfid tag no is::::::::::"+rfidtagno);
	    	rr.closeConnection();
	    }
	}




