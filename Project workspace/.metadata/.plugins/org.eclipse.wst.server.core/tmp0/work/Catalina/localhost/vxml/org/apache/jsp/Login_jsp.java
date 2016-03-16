package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import com.test.util.ConnectionUtil;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<vxml version=\"2.1\">\r\n");
      out.write("<form>\r\n");
      out.write("<block>\r\n");

    String message = (String)request.getAttribute("message");
    if(message!=null){
    
      out.write("\r\n");
      out.write("        <prompt>");
      out.print(message);
      out.write("</prompt>\r\n");

    }else{
    
      out.write("\r\n");
      out.write("    <prompt>Welcome to Central Library </prompt>");
System.out.println("In login .jsp pase after prompt tag"); 
      out.write('\r');
      out.write('\n');

    } 
    
      out.write("\r\n");
      out.write("</block>\r\n");
      out.write("<field name=\"u_num\" type=\"digits\">\r\n");
      out.write("<log expr=\"'**********accnum field*************'\"/>\r\n");
      out.write("    <prompt>please enter your phone number</prompt>\r\n");
      out.write("    <noinput>\r\n");
      out.write("        <prompt>You did not enter your phone number</prompt>\r\n");
      out.write("    </noinput>    \r\n");
      out.write("    \r\n");
      out.write("</field>\r\n");
      out.write("\r\n");
      out.write("<field name=\"u_password\" type=\"digits\">\r\n");
      out.write("<log expr=\"'**********password field*************'\"/>\r\n");
      out.write("    <prompt>please enter password</prompt>\r\n");
      out.write("    <noinput>\r\n");
      out.write("        <prompt>You did not enter password</prompt>\r\n");
      out.write("    </noinput>\r\n");
      out.write("   \r\n");
      out.write("</field>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<block>\r\n");
      out.write("    <submit next=\"LogServlet?action=login\" method=\"post\"  />\r\n");
      out.write("</block>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</vxml>\r\n");
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
