package com.lib;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

	public static void main(String[] args) {
		sendPassword("srithika.26@gmail.com",1234);
	}

	public static void sendPassword(String emailid,int password)
	{
		System.out.println("Email sending started"); 

		Properties emailProperties;
		Session mailSession;
		MimeMessage emailMessage;
		
		String emailPort = "587";//gmail's smtp port

		emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.port", emailPort);
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.starttls.enable", "true");
		
		String toEmail= emailid ;
		String emailSubject = "Regarding Forget Password";
		String emailBody = "Your password is:::"+password;

		mailSession = Session.getDefaultInstance(emailProperties, null);
		emailMessage = new MimeMessage(mailSession);

			try {
				emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
				emailMessage.setSubject(emailSubject);
				emailMessage.setContent(emailBody, "text/html");//for a html email
				
				String emailHost = "smtp.gmail.com";
				String fromUser = "smartlibrary41@gmail.com";//just the id alone without @gmail.com
				String fromUserEmailPassword = "144117144117";

				javax.mail.Transport transport;
				try {
					transport = mailSession.getTransport("smtp");
					transport.connect(emailHost, fromUser, fromUserEmailPassword);
					transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
					transport.close();
					System.out.println("Email sent successfully.");
				} catch (NoSuchProviderException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
}
