package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>carts</title>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("       \n");
      out.write("    .topnav {\n");
      out.write("    background-color: #333;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("    body{\n");
      out.write("    background: -webkit-linear-gradient(left, #ff1212, #309dbd);\n");
      out.write("}\n");
      out.write(".topnav a {\n");
      out.write("    float: left;\n");
      out.write("    color: #f2f2f2;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change the color of links on hover */\n");
      out.write(".topnav a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add a color to the active/current link */\n");
      out.write(".topnav a.active {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("    input[type=text], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("input[type=password], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("input[type=email], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write(" <body>\n");
      out.write("      <div class=\"topnav\">\n");
      out.write("            <a href=\"newindexpage.jsp\">Home</a> \n");
      out.write("            <a href=\"menupage.jsp\">Menu</a>\n");
      out.write("            <a href=\"\">Updates</a>\n");
      out.write("            <a href=\"AboutUs.html\">About Us</a>\n");
      out.write("             <li><a href=\"profilejsp.jsp\">");
 String name=(String)session.getAttribute("uname"); out.println(name); 
      out.write("</a></li>\n");
      out.write("            <a href=\"logout.jsp\">Log Out</a>\n");
      out.write("       </div> \n");
      out.write("     <table><center>\n");
      out.write("<font size = 5 color=\"black\">\n");
      out.write("<div class=\"parent\">\n");
      out.write("<form  action=\"adminupdate.jsp\" enctype=\"multipart/form-data\" accept=\"image/*\">\n");
      out.write("<br>\n");
      out.write("Please enter item to add or remove:\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("Add Item:\n");
      out.write("Id:<input type=\"text\" id=\"n\" name=\"id\" size=\"39\" >\n");
      out.write("<br>\n");
      out.write("Name:<input type=\"text\" id=\"n\" name=\"name\" size=\"39\" >\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("price:<input type=\"txt\" id=\"e\" name=\"price\" size=\"39\">\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("image:<input type=\"file\" id=\"\" name=\"photo\" size=\"39\">\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("category: <br>\n");
      out.write("<SELECT name=\"cat\">\n");
      out.write("<OPTION>beverages\n");
      out.write("<OPTION>deserts\n");
      out.write("<OPTION>indian\n");
      out.write("<OPTION>chinesse\n");
      out.write("<OPTION>italian\n");
      out.write("<OPTION>sea food\n");
      out.write("\n");
      out.write("</SELECT>\n");
      out.write("\n");
      out.write("\n");
      out.write("<br> <br>\n");
      out.write("<input type=\"submit\" name=\"submit\" value=\"add\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</form></center>\n");
      out.write("       </table>\n");
      out.write("</FONT>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
