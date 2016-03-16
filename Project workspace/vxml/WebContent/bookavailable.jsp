<?xml version="1.0" encoding="UTF-8"?>
<%@page import="java.sql.Connection"%>
<%@page import="com.test.util.ConnectionUtil"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%><vxml version="2.1">
<form>
<block >
<%String books=request.getParameter("books");
  String Rby=(String)session.getAttribute("u_num");
%>
<prompt>You have selected  <%=books %>  <break time="small"/> </prompt>
 <%Connection con=ConnectionUtil.openConnection();
 Statement st=con.createStatement();
ArrayList<String> al=new ArrayList<String>();
 String query="select * from book_details where b_name='"+books+"'and status='available'";
 System.out.println(query);
 String bookid=null;
 ResultSet rs=st.executeQuery(query);
 if(rs.next())
 {
	bookid=rs.getString(1);
		 %>
		 <prompt>Your book is reserved please come and collect it as soon as possible </prompt> 
	 <% String query1="UPDATE Book_details SET status='unavailable',reserved_by="+Rby+" WHERE B_id='"+bookid+"'";
	 System.out.println(query1);
int i=st.executeUpdate(query1);
if(i>0)
{
	String query3="insert into temp values(sysdate,'"+bookid+"','"+Rby+"')";
	System.out.println(query3);
int n=st.executeUpdate(query3);
}
%>
<% 
}
else{%>
<prompt>Sorry your book is not reserved </prompt>
<% }%> 
 
    
 <% ConnectionUtil.closeConnection(rs,st,con);%>

</block>
</form>
</vxml>