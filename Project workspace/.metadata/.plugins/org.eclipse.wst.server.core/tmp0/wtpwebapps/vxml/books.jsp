<?xml version="1.0" encoding="UTF-8"?>
<%@page import="java.sql.Connection"%>
<%@page import="com.test.util.ConnectionUtil"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%><vxml version="2.1">
<form>
<field name="books" >
<%String subcategory=request.getParameter("subcategory"); %>
<prompt>You have selected  <%=subcategory %> please select a book  <break time="small"/> </prompt>
 <%Connection con=ConnectionUtil.openConnection();
 Statement st=con.createStatement();
ArrayList<String> al=new ArrayList<String>();
 String query="select b.B_name from book_details b,sub_cat s where s.sub_name='"+subcategory+"' and b.sub_id=s.sub_id";
 System.out.println(query);
 ResultSet rs=st.executeQuery(query);
 while(rs.next())
 {
	 al.add(rs.getString(1));
 }
 for(String s:al)
 {
  %>
  <prompt><%=s %><break time="small"/></prompt>
 <%} %>
<grammar root="books">
<rule id="books">
<one-of>
 <%for(String s:al)
 {
  %>
  <item><%=s %></item>
 <%}
 ConnectionUtil.closeConnection(rs,st,con);
 %>
</one-of>
</rule>
</grammar>
</field>
<block>
<submit next="bookavailable.jsp"/>
</block>
</form>
</vxml>