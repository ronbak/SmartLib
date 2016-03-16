package com.lib;

import java.io.PrintWriter;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.security.auth.callback.PasswordCallback;
import javax.swing.JOptionPane;
import javax.xml.ws.Response;

import sun.security.util.Password;

public class Dbcon {
	private static String email;
	private static String msg;
	private static String to;


	public static Connection getConnection() throws Exception
	{
		
			
			ResourceBundle b=ResourceBundle.getBundle("jdbc");
			String driver=b.getString("driver");
			String url=b.getString("url");
			String username=b.getString("username");
			String password=b.getString("password");
			Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,username,password);
		return con;

		
	}


	public static ArrayList getLocation() throws Exception
	{
		// TODO Auto-generated method stub
	ArrayList al=new ArrayList();
	Connection con=Dbcon.getConnection();
	Statement stmt=con.createStatement();
	ResultSet rs=null;
	String query="select * from location ";
	rs=stmt.executeQuery(query);
	while(rs.next())
	{
		al.add(rs.getString(2));
	}
	
		return al;
	}

	
	public static int checkExistence(String mobile) throws Exception
	{
		int result=0;
		Connection con=Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
		String query="select * from USER_DETAILS where u_num="+mobile+""; 
		rs=stmt.executeQuery(query);
		if(rs.next())
		result=1;
		else
			result=0;
		
		return result;
	}
	
	
	
	
	
	public void toDatabase(String num, String name, String emailid, String dob,
			String address, String dateofreg, String gender, int password,
			String location)  throws Exception{
		// TODO Auto-generated method stub
		Connection con=Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null; 
		
		
		String locationquery="select LOC_ID from location where LOC_NAME='"+location+"'";
		rs=stmt.executeQuery(locationquery);
		if(rs.next())
		{
			int id=rs.getInt(1);
		String query="insert into user_details values('"+name+"',"+num+",'"+emailid+"','"+dob+"','"+address+"','"+dateofreg+"','"+gender+"',"+password+","+id+")";
		System.out.println(query);
		int i=stmt.executeUpdate(query);
		if(i>0)
		{
			JOptionPane.showMessageDialog(null, "Registration Successfull");
			
			
			String mess="Your login credentils are "+password+""; 
			
			

		 	Mail.sendPassword(emailid,password); 
		 	Message.sendPasswordAsSMS(num,mess); 
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Registration Unsuccessfull, Try again");
		}
		
		}
	}
		
	
	
	


	public static ArrayList getCategory() throws Exception
	{
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		Connection con=Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
		String query="select * from category ";
		rs=stmt.executeQuery(query);
		while(rs.next())
		{
			a1.add(rs.getString(2));
		}
		
			return a1;
		}
	public static ArrayList getsubCat(String bookcat) throws Exception
	{
		// TODO Auto-generated method stub
		ArrayList a2=new ArrayList();
		Connection con=Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;

		String query="select cat_id from category where cat_name='"+bookcat+"'";  
		System.out.println(query);
		rs=stmt.executeQuery(query);
		while(rs.next())
		{
		int id=rs.getInt(1);
		String query2="select * from sub_cat where cat_id='"+id+"'";
		System.out.println(query2);
		rs=stmt.executeQuery(query2);
		while(rs.next())
		{
			a2.add(rs.getString(2));
		}
		}
			return a2;
		}


	public static ArrayList getPublisher() throws Exception {
		// TODO Auto-generated method stub
		ArrayList a3=new ArrayList();
		Connection con=Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
		String query="select * from publisher ";
		rs=stmt.executeQuery(query);
		while(rs.next())
		{
			a3.add(rs.getString(2));
		}
		
			return a3;
	}


	public void btodb(String bookid, String bookname, String string,
			String isbn, String string2, String subc,
			String string5, String author) throws Exception {
		// TODO Auto-generated method stub
		Connection con=Dbcon.getConnection();
		Statement stmt=con.createStatement();
		Statement stmt1=con.createStatement();
		ResultSet rs1=null;
			ResultSet rs=null;
		String subcatquery="select sub_ID from sub_cat where sub_NAME='"+subc+"'";
		System.out.println(subcatquery);
		rs=stmt.executeQuery(subcatquery);
		
		int bid = 0;
		int bid1=0;
		while(rs.next())
		{    
			//if(rs.next())
			{ bid=rs.getInt(1);
			// bid1=rs1.getInt(1);
			System.out.println(bid);}
		
		}
		String bquery="insert into book_details values("+bookid+",'"+bookname+"','"+string+"','"+isbn+"','"+string2+"','"+bid+"',0,'"+author+"','available',"+0+")";
		System.out.println(bquery);
		String pubquery="select pub_ID from publisher where pub_NAME='"+string5+"'";
		rs1=stmt1.executeQuery(pubquery);
		System.out.println(pubquery);
		while(rs1.next())
		{ bid1=rs1.getInt(1);
		// bid1=rs1.getInt(1);
		System.out.println(bid1);}
		String b1query="update book_details set PUB_ID="+bid1+" where B_NAME='"+bookname+"'";
		System.out.println(b1query);
		int i=stmt.executeUpdate(bquery);
		stmt.executeUpdate(b1query);
		if(i>0)
		{
			
			JOptionPane.showMessageDialog(null, "Registration Successfull");//
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Registration Unsuccessfull, Try again");
		}
		

		

	}


	public static void retrievePassword(String name, String num, String emailid) throws Exception
	{
		
		Connection con=Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
	
		
		//PrintWriter pw= Response.getWrite()
		String query="select u_password from USER_DETAILS where u_name='"+name+"' and u_emailid='"+emailid+"' and u_num="+num+"";
	  System.out.println(query);
		rs=stmt.executeQuery(query);
	
	if(rs.next())
	{
		int pwd=rs.getInt(1); 
		//SendMailSSL.sendMail(emailid, pwd); 
		
		
		String mess="Your login credentils are "+pwd+""; 
		
		

	 	//Mail.sendPassword(emailid,pwd); 
		Regmail.sendPassword(emailid,pwd); 
	Message.sendPasswordAsSMS(num,mess); 
		
	}
	else
	{
		JOptionPane.showMessageDialog(null, "invalid user");
	}
		
	}

public static int getId(String query)

{ 
	int id=0;
	Connection con;
	try {
		con = Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
		rs=stmt.executeQuery(query);
		if(rs.next())
		{
			id=rs.getInt(1);
		}
		else
			JOptionPane.showMessageDialog(null, "Check the table ");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return id+1;

	
}
	
	
	public static void issueBook(String tag, String name, String num,
			String emailid) throws  Exception {
		// TODO Auto-generated method stub
		Connection con=Dbcon.getConnection();
		Statement stmt=con.createStatement();
		int result=0;
		int id=Dbcon.getId("select count(*) from BISSUEDETAILS");
		String query="insert into BISSUEDETAILS(ISSUE_ID,B_ID,U_NUM,EXPECTED_DATE,ISSUE_DATE) values("+id+","+tag+","+num+",sysdate+15,sysdate)";
	  System.out.println(query);
		result=stmt.executeUpdate(query);
		if(result>0)
		{
			
			JOptionPane.showMessageDialog(null, "Book Issued Successfully  ");
			String query2="update BOOK_DETAILS set status='issued',RESERVED_BY="+num+" where B_ID="+tag+"  ";
			  System.out.println(query2);
				result=stmt.executeUpdate(query2);
		}
		
		else
			JOptionPane.showMessageDialog(null, "Issue failed, try issuing it again");		
	}


	public static int fine(String bookid)
	{
		Connection con;
		int diff=0;
		int fine=0;
		try {
			con = Dbcon.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rs=null;
			int result=0;
			int id=Dbcon.getId("select ISSUE_ID	from BISSUEDETAILS where B_ID="+bookid+"");
			if(id>0)
			{				
			String query="select EXPECTED_DATE from BISSUEDETAILS where b_id="+bookid+"";
			System.out.println(query);
			rs=stmt.executeQuery(query);
			if(rs.next())
			{
				Date d=rs.getDate(1);
			
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy");
			JOptionPane.showMessageDialog(null,sdf.format(d));
			String query2="select trunc(sysdate-to_date('"+sdf.format(d)+"','dd-mon-yy')) from dual";
			System.out.println(query2);
			rs=stmt.executeQuery(query2);
			while(rs.next())
			{
			diff=rs.getInt(1);
			 fine=diff*5;
			}
			String query3="update BISSUEDETAILS set RETURN_DATE=sysdate,FINE="+fine+" where B_ID="+bookid+"";
			  System.out.println(query3);
				result=stmt.executeUpdate(query3);
			}
			
			}
			else
				JOptionPane.showMessageDialog(null, "Such book is not issued ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fine;
	}


	public static int checkfortheft(String tag) throws Exception {
		// TODO Auto-generated method stub
		Connection con;
		con = Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
		int result=0;
		String query="select * from bissuedetails where b_id="+tag+"";
		rs=stmt.executeQuery(query);
		if(rs.next())
		{
			result=1;
		}
		else
		{
			result=0;
		}
		
		return result;
	}


	public static int clearbooks() throws Exception {
		// TODO Auto-generated method stub
		Connection con;
		con = Dbcon.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
		int result=0;
		String query="select * from temp";
		rs=stmt.executeQuery(query);
		int u=0;
		ArrayList<String> al=new ArrayList<String>();
		while(rs.next())
		{
		String bookid=rs.getString(2);
		al.add(bookid);
		}
		for(String s:al){
		String query2="update BOOK_DETAILS set status='available',RESERVED_BY=0 where B_ID="+s+" and status='unavailable'";
		System.out.println(query2);
		u=stmt.executeUpdate(query2);
		}
		if(u>0)
		{
		String query3="delete from temp";
		int i=stmt.executeUpdate(query3);
	if(i>0)
	{
		result=1;	
	}
		}
		
		return result;
	}


	public static void bookReturn(String tag, int fine) throws Exception {
		// TODO Auto-generated method stub
		Connection con;
		con = Dbcon.getConnection();
		Statement stmt=con.createStatement();
		int rs;
		int result=0;
		String query="update BOOK_DETAILS set status='available' where b_id="+tag+" ";
		rs=stmt.executeUpdate(query);
		String query1="update BISSUEDETAILS  set RETURN_DATE=sysdate, fine="+fine+" where b_id="+tag+" ";
		rs=stmt.executeUpdate(query);
		
	}


	public static void checkreserve(String uno) throws Exception {
		// TODO Auto-generated method stub
		Connection con;
		con = Dbcon.getConnection();
		Statement stmt=con.createStatement();
		
	}


	
}


	
