package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.util.*;
import java.sql.*;
import java.util.ArrayList;
import classes.Item;

public final class getdata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Shopping Cart - Check out</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("       \n");
      out.write("            .container {\n");
      out.write("                height: 700px;\n");
      out.write("                width: 900px;\n");
      out.write("                margin:auto;\n");
      out.write("            }\n");
      out.write("            .headbanner {\n");
      out.write("                float: left;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 900px;\n");
      out.write("                vertical-align:middle;\n");
      out.write("                background-color:#FFCC00;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .container .headbanner h1 {\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                color: #CC3300;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .mycontent {\n");
      out.write("                float: left;\n");
      out.write("                height: 500px;\n");
      out.write("                width: 900px;\n");
      out.write("            }\n");
      out.write("            .myfooter {\n");
      out.write("                float: left;\n");
      out.write("                height: 100px;\n");
      out.write("                width: 900px;\n");
      out.write("                border-top-width:3px;\n");
      out.write("                border-top-style:solid;\n");
      out.write("                border-top-color:#FFCC00;\n");
      out.write("            }\n");
      out.write("            .container .myfooter h3 {\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                font-size: 12px;\n");
      out.write("                color:#CC3300;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                font-family:Verdana, Geneva, sans-serif;\n");
      out.write("                font-weight:normal;\n");
      out.write("                font-size:14px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("     \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"margin:0; padding:0\">\n");
      out.write("        <form action=\"success.jsp\">   \n");
      out.write("            ");

                 PrintWriter pw=response.getWriter();
           double sum=0;
           String url="jdbc:mysql://localhost:3306/restraunt";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();   
       ResultSet rs;
            String[] str;
           str=request.getParameterValues("chk1");

            
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"headbanner\">\n");
      out.write("                    <h1 style=\"display:inline\"><center>\n");
      out.write("                            <img src=\"shopping.png\" />[My Shopping Cart]\n");
      out.write("                        </center></h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mycontent\">\n");
      out.write("                    <a style=\"color:#CC3300; font-family:Verdana, Geneva, sans-serif; font-size:20px; font-weight:bold\">Checkout My Cart</a><br/>\n");
      out.write("                    <table width=\"500px\">\n");
      out.write("                        ");

                           float count=0;
           if(str!=null){
               for(int i=0;i<str.length;i++){
                   st.executeQuery("select * from chandigarhrasoi,`pizza hut` where id="+str[i]+"");
                   rs=st.getResultSet();
                   while(rs.next()){
                       String nameVal=rs.getString("name");
                       int c=rs.getInt("price");
           
               sum+=c;
               System.out.print(sum);
               int q=1;
               count++;
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
out.print( rs.getString("name"));
      out.write("</td> \n");
      out.write("                            <td>");
out.print(rs.getInt("price"));
      out.write("</td> \n");
      out.write("                        </tr>\n");
      out.write("                        ");
}}
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"font-weight:bold\">My Total</td><td style=\"font-weight:bold\">$[");
      out.print( sum);
      out.write("]</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"Purchase\" /></td>\n");
      out.write("                        </tr>\t\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img src=\"paywith.png\" width=\"210\" height=\"80\" /></td></tr>\n");
      out.write("                        ");

           } session.setAttribute("psum",sum);
       
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
