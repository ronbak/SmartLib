package com.lib;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Message {
	/*public static void main(String[] args) {
		sendPasswordAsSMS("9059984910","1234");
	}*/
	public  static void sendPasswordAsSMS(String to,String msg)
	{
		msg = msg;
		String url = "http://www.smsgatewaycenter.com/library/send_sms_2.php?UserName=ayushren&Password=idealabs&Type=Individual&To="+to+"&Mask=IDEA20&Message="+URLEncoder.encode(msg);
	
		try {
			URL url2 = new URL(url);
			try {
				URLConnection connection = url2.openConnection();
			InputStream inputStream =connection.getInputStream();
			int i;
			while ((i=inputStream.read())!= -1) {
				System.out.print((char)i);
				
			}
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
