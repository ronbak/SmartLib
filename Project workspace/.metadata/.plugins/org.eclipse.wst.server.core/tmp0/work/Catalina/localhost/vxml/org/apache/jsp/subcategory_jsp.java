package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import com.test.util.ConnectionUtil;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public final class subcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<vxml version=\"2.1\">\r\n");
      out.write("<form>\r\n");
      out.write("<field name=\"subcategory\" >\r\n");
String category=request.getParameter("category"); 
      out.write("\r\n");
      out.write("<prompt>You have selected  ");
      out.print(category );
      out.write(" please select sub category from following <break time=\"small\"/> </prompt>\r\n");
      out.write(" ");
Connection con=ConnectionUtil.openConnection();
 Statement st=con.createStatement();
ArrayList<String> al=new ArrayList<String>();
 String query="SELECT S.SUB_NAME FROM SUB_CAT S,CATEGORY C WHERE C.CAT_NAME='"+category+"' AND C.CAT_ID=S.CAT_ID ";
 ResultSet rs=st.executeQuery(query);
 while(rs.next())
 {
	 al.add(rs.getString(1));
 }
 for(String s:al)
 {
  
      out.write("\r\n");
      out.write("  <prompt>");
      out.print(s );
      out.write("<break time=\"small\"/></prompt>\r\n");
      out.write(" ");
} 
      out.write("\r\n");
      out.write("<grammar root=\"subcategory\">\r\n");
      out.write("<rule id=\"subcategory\">\r\n");
      out.write("<one-of>\r\n");
      out.write(" ");
for(String s:al)
 {
  
      out.write("\r\n");
      out.write("  <item>");
      out.print(s );
      out.write("</item>\r\n");
      out.write(" ");
}
 ConnectionUtil.closeConnection(rs,st,con);
 
      out.write("\r\n");
      out.write("</one-of>\r\n");
      out.write("</rule>\r\n");
      out.write("</grammar>\r\n");
      out.write("</field>\r\n");
      out.write("<block>\r\n");
      out.write("<submit next=\"books.jsp\"/>\r\n");
      out.write("</block>\r\n");
      out.write("</form>\r\n");
      out.write("</vxml>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
