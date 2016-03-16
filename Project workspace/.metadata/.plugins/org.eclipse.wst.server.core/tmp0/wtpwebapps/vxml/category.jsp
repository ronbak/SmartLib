<?xml version="1.0" encoding="UTF-8"?>

<%@page import="java.sql.Connection"%>
<%@page import="com.test.util.ConnectionUtil"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%><vxml version="2.1">
<form>
<field name="category" >
<prompt>Please select the category from the following <break time="small"/>
 </prompt>
 <%Connection con=ConnectionUtil.openConnection();
 Statement st=con.createStatement();
ArrayList<String> al=new ArrayList<String>();
 String query="select CAT_NAME from CATEGORY ";
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
<grammar root="category">
<rule id="category">
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
<submit next="subcategory.jsp"/>
</block>
</form>
</vxml>