package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import java.util.ArrayList;
import classes.Item;

public final class menupageph_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>k\n");
      out.write("<style>\n");
      out.write("    .context-dark, .bg-gray-dark, .bg-primary {\n");
      out.write("    color: rgba(255, 255, 255, 0.8);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer-classic a, .footer-classic a:focus, .footer-classic a:active {\n");
      out.write("    color: #ffffff;\n");
      out.write("}\n");
      out.write(".nav-list li {\n");
      out.write("    padding-top: 5px;\n");
      out.write("    padding-bottom: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-list li a:hover:before {\n");
      out.write("    margin-left: 0;\n");
      out.write("    opacity: 1;\n");
      out.write("    visibility: visible;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul, ol {\n");
      out.write("    list-style: none;\n");
      out.write("    padding: 0;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-inner {\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 23px;\n");
      out.write("    font: 900 13px/1 \"Lato\", -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    color: rgba(255, 255, 255, 0.5);\n");
      out.write("}\n");
      out.write(".social-container .col {\n");
      out.write("    border: 1px solid rgba(255, 255, 255, 0.1);\n");
      out.write("}\n");
      out.write(".nav-list li a:before {\n");
      out.write("    content: \"\\f14f\";\n");
      out.write("    font: 400 21px/1 \"Material Design Icons\";\n");
      out.write("    color: #4d6de6;\n");
      out.write("    display: inline-block;\n");
      out.write("    vertical-align: baseline;\n");
      out.write("    margin-left: -28px;\n");
      out.write("    margin-right: 7px;\n");
      out.write("    opacity: 0;\n");
      out.write("    visibility: hidden;\n");
      out.write("    transition: .22s ease;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    .topnav {\n");
      out.write("    background-color: #333;\n");
      out.write("    overflow: hidden;\n");
      out.write("    position: fixed;\n");
      out.write("      top: 0; /* Position the navbar at the top of the page */\n");
      out.write("    width: 100%; /* Full width */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the links inside the navigation bar */\n");
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
      out.write("  .content {\n");
      out.write("  padding: 16px;\n");
      out.write("  color:#ff0000;\n");
      out.write("}  \n");
      out.write("    \n");
      out.write("     #imgs{\n");
      out.write("\t        position:relative;\n");
      out.write("\t        height: 50px;\n");
      out.write("\t        display:block;\n");
      out.write("\t        \n");
      out.write("            background-color: black;\n");
      out.write("            padding-top: 8px;\n");
      out.write("           \n");
      out.write("           text-align: center;\n");
      out.write("    \n");
      out.write("\t}\n");
      out.write("    \n");
      out.write("    body{\n");
      out.write("    background: -webkit-linear-gradient(left, #ff1212, #309dbd);\n");
      out.write("}\n");
      out.write("    .img12\n");
      out.write("{\n");
      out.write("    height: 12vw;\n");
      out.write("    width: 15vw;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" .container {\n");
      out.write("                \n");
      out.write("                margin:center;\n");
      out.write("            }\n");
      out.write("            .headbanner {\n");
      out.write("                float: left;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 900px;\n");
      out.write("                vertical-align:middle;\n");
      out.write("                background-color:#FFCC00;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            \n");
      out.write("            .mycontent {\n");
      out.write("                float: left;\n");
      out.write("                height: 650px;\n");
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
      out.write("        \n");
      out.write("            .cartcontent {\n");
      out.write("                float: left;\n");
      out.write("                height: 200px;\n");
      out.write("                width: 900px;\n");
      out.write("                background-color:#FFFFC2;\n");
      out.write("                border-width:1px;\n");
      out.write("                border-style:solid;\n");
      out.write("                border-color:#FFCC00;\n");
      out.write("            }\n");
      out.write("            .prod1 {\n");
      out.write("                float: left;\n");
      out.write("                height: 100px;\n");
      out.write("                width: 900px;\n");
      out.write("                border-bottom-width:1px;\n");
      out.write("                border-bottom-style:solid;\n");
      out.write("                border-bottom-color:#FFCC00;\n");
      out.write("            }\n");
      out.write("             .total {\n");
      out.write("                float: left;\n");
      out.write("                height: 180px;\n");
      out.write("                width: 285px;\n");
      out.write("                font-family: Verdana, Geneva, sans-serif;\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding-top:20px;\n");
      out.write("                padding-left:10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            wish\n");
      out.write("            {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("             .myitems {\n");
      out.write("                float: left;\n");
      out.write("                height: 200px;\n");
      out.write("                width: 600px;\n");
      out.write("                border-right-width:1px;\n");
      out.write("                border-right-style:solid;\n");
      out.write("                border-right-color:#FFCC00;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .items {\n");
      out.write("                float: left;\n");
      out.write("                height: auto;\n");
      out.write("                width: 900px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    var b=0;   \n");
      out.write("\t function update_value(chk_bx){\n");
      out.write("\t\t      if(chk_bx.checked)\n");
      out.write("\t\t         {\n");
      out.write("\t\t             var a=\"checked\";\n");
      out.write("\t\t \t   b+=1;\n");
      out.write("\t\t }\n");
      out.write("\t\t         else{\n");
      out.write("\t\t             var a=\"not checked\";\n");
      out.write("\t\t \t\tif(b>0){\n");
      out.write("\t\t \t\t\tb-=1;\n");
      out.write("\t\t \t\t}else if(b==0){\n");
      out.write("\t\t \t\t\tb=0;\n");
      out.write("\t\t \t\t}\n");
      out.write("\t\t         }\n");
      out.write("\t\t      if (b==0)\n");
      out.write("\t\t    \t  {\n");
      out.write("\t\t\t         document.getElementById('wish').innerHTML ='Cart : Empty';\n");
      out.write("\n");
      out.write("\t\t    \t  }else{\n");
      out.write("\t\t         document.getElementById('wish').innerHTML ='Cart : '+b+'';\n");
      out.write("\t\t    \t  }\n");
      out.write("\t\t     }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("          <div class=\"topnav\">\n");
      out.write("            <a href=\"newindexpagejsp.jsp\">Home</a> \n");
      out.write("            <a href=\"menupageph.jsp\">Menu</a>\n");
      out.write("            <a href=\"\">Updates</a>\n");
      out.write("            <a href=\"AboutUs.html\">About Us</a>\n");
      out.write("                         <a href=\"profilejsp.jsp\">");
 String name=(String)session.getAttribute("uname"); out.println(name); 
      out.write("</a>\n");
      out.write("            <li><a  style=\"color:whitesmoke;\"><div id=\"wish\" >Cart: Empty</div></a></li>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("    ");

        int a=5;
          String url="jdbc:mysql://localhost:3306/restraunt";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,"root","");
             HttpSession s=request.getSession();
               String pid=(String)session.getAttribute("id");
            if(pid==null)
            {
                pid="10";
            }
            out.println(pid);
              String query="select name,price from `pizza hut` where id="+pid+"";
        PreparedStatement ps=(PreparedStatement)conn.prepareStatement("SELECT * from `pizza hut` ");
       ResultSet r=ps.executeQuery();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(query);
   r.next();
rs.next();

      
      out.write("\n");
      out.write("      \n");
      out.write("     \n");
      out.write("        <form action=\"getdata1.jsp\" method=\"post\">  \n");
      out.write("     \n");
      out.write("   <div style=\"margin-left: 30vw;margin-top: 3vw;\">\n");
      out.write("\n");
      out.write("      <table cellspacing=\"30vw;\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<td><img src=\"paneer.JPG\" class=\"img12\"><br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;\">Paneer Soya Supreme</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 0.9vw;\">pizza</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 545<button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-left: 7vw;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"1\" onchange=\"update_value(this);\"></div></td>\n");
      out.write("\n");
      out.write("<td><img src=\"veg.JPG\" class=\"img12\"><br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;\"></div>Veg Exotica<div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 0.9vw;\">pizza</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 545 <button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-left: 7vw;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"2\" onchange=\"update_value(this);\"></div></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td><img src=\"vegitalino.JPG\" class=\"img12\"><br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;\">Veggie Italiano</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 0.9vw;\">pizza</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 545 <button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-left: 7vw;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"3\" onchange=\"update_value(this);\"></div></td>\n");
      out.write("\n");
      out.write("<td><img src=\"vegsupreme.JPG\" class=\"img12\"><br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;\">Veggie Supreme</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 0.9vw;\">pizza</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 545 <button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-left: 7vw;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"4\" onchange=\"update_value(this);\"></div></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td><img src=\"chikenexotica.JPG\" class=\"img12\"><br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;\">Chicken Exotica</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 0.9vw;\">pizza</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 625 <button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-left: 7vw;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"5\" onchange=\"update_value(this);\"></div></td>\n");
      out.write("\n");
      out.write("<td><img src=\"chikenitalino.JPG\" class=\"img12\"><br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;\">Chicken Italiano</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 0.9vw;\">pizza</div><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 625 <button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-left: 7vw;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"6\" onchange=\"update_value(this);\"></div></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<hr style=\"margin-left: 18vw;margin-right: 18vw;\">\n");
      out.write("\n");
      out.write("<div><h1 style=\"margin-left:30vw;\">PIZZA</h1></div>\n");
      out.write("\n");
      out.write("<div style=\"margin-left:30vw;\">\n");
      out.write("\n");
      out.write("<div style=\"margin-top: 0.2vw;font-size: 1.2vw;\">Chicken Supreme<button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-right:33vw; float: right;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"7\" onchange=\"update_value(this);\" style=\"display:inline-block;margin-right:31vw; float: right;\">\n");
      out.write("\n");
      out.write("<br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 625</div></div></div>\n");
      out.write("\n");
      out.write("<hr style=\"margin-left: 28vw;margin-right: 28vw;\">\n");
      out.write("\n");
      out.write("<div style=\"margin-left:30vw;\">\n");
      out.write("\n");
      out.write("<div style=\"margin-top: 0.2vw;font-size: 1.2vw;\">Triple Chicken Feast<button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-right:33vw; float: right;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"8\" onchange=\"update_value(this);\"style=\"display:inline-block;margin-right:31vw; float: right\";>\n");
      out.write("\n");
      out.write("<br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 625</div></div></div>\n");
      out.write("\n");
      out.write("<hr style=\"margin-left: 28vw;margin-right: 28vw;\">\n");
      out.write("\n");
      out.write("<div style=\"margin-left:30vw;\">\n");
      out.write("\n");
      out.write("<div style=\"margin-top: 0.2vw;font-size: 1.2vw;\">Country Feast<button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-right:33vw; float: right;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"9\" onchange=\"update_value(this);\"style=\"display:inline-block;margin-right:31vw; float: right\";>\n");
      out.write("\n");
      out.write("<br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 515</div></div></div>\n");
      out.write("\n");
      out.write("<hr style=\"margin-left: 28vw;margin-right: 28vw;\">\n");
      out.write("\n");
      out.write("<div style=\"margin-left:30vw;\">\n");
      out.write("\n");
      out.write("<div style=\"margin-top: 0.2vw;font-size: 1.2vw;\">Farmers Pick<button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-right:33vw; float: right;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"10\" onchange=\"update_value(this);\"style=\"display:inline-block;margin-right:31vw; float: right\";>\n");
      out.write("\n");
      out.write("<br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:w;font-size: 1.0vw;\">Rs. 515</div></div></div>\n");
      out.write("\n");
      out.write("<hr style=\"margin-left: 28vw;margin-right: 28vw;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"margin-left:30vw;\">\n");
      out.write("<div style=\"margin-top: 0.2vw;font-size: 1.2vw;\">");
out.println(rs.getString("name"));
      out.write("<button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-right:33vw; float: right;\">ADD</button><input type=\"checkbox\" name=\"chk1\" value=\"12\" onchange=\"update_value(this);\"style=\"display:inline-block;margin-right:31vw; float: right\";>\n");
      out.write("\n");
      out.write("<br><div style=\"margin-left:0.3vw;margin-top: 0.2vw;color:whitesmoke;font-size: 1.0vw;\">");
out.println(rs.getString("price"));
      out.write("</div></div></div>\n");
      out.write("<button type=\"submit\" style=\"display:inline-block;background: transparent;border:1px solid;border-color: orange;color: orange;margin-right:33vw; float: right;\">GO TO CART</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"section footer-classic context-dark bg-image\" style=\"background: #2d3246;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row row-30\">\n");
      out.write("            <div class=\"col-md-4 col-xl-5\">\n");
      out.write("              <div class=\"pr-xl-4\"><a class=\"brand\" href=\"index.html\"><img class=\"brand-logo-light\" src=\"images/agency/logo-inverse-140x37.png\" alt=\"\" width=\"140\" height=\"37\" srcset=\"images/agency/logo-retina-inverse-280x74.png 2x\"></a>\n");
      out.write("                <p>Being on a hectic schedule, people may not get enough time to go out for food. They may be quite busy with their personal or office work.\n");
      out.write("\n");
      out.write("In this scenario users can directly open your restaurant’s or food delivering company’s online food ordering system, irrespective of the place and can order food within no time. <br>As soon as the user places an online order you will be notified about the new order, and you have to prepare & deliver food to the user as per the delivery time mentioned while placing the order..</p>\n");
      out.write("                <!-- Rights-->\n");
      out.write("                <p class=\"rights\"><span>©  </span><span class=\"copyright-year\">2018</span><span> </span><span>Waves</span><span>. </span><span>All Rights Reserved.</span></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("              <h5>Contacts</h5>\n");
      out.write("              <dl class=\"contact-list\">\n");
      out.write("                <dt>Address:</dt>\n");
      out.write("                <dd>798 South Park Avenue, Jaipur, Raj</dd>\n");
      out.write("              </dl>\n");
      out.write("              <dl class=\"contact-list\">\n");
      out.write("                <dt>email:</dt>\n");
      out.write("                <dd><a href=\"mailto:#\">dkstudioin@gmail.com</a></dd>\n");
      out.write("              </dl>\n");
      out.write("              <dl class=\"contact-list\">\n");
      out.write("                <dt>phones:</dt>\n");
      out.write("                <dd><a href=\"tel:#\">+91 7568543012</a> <span>or</span> <a href=\"tel:#\">+91 9571195353</a>\n");
      out.write("                </dd>\n");
      out.write("              </dl>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 col-xl-3\">\n");
      out.write("              <h5>Links</h5>\n");
      out.write("              <ul class=\"nav-list\">\n");
      out.write("                <li><a href=\"#\">About</a></li>\n");
      out.write("                <li><a href=\"#\">Projects</a></li>\n");
      out.write("                <li><a href=\"#\">Blog</a></li>\n");
      out.write("                <li><a href=\"#\">Contacts</a></li>\n");
      out.write("                <li><a href=\"#\">Pricing</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row no-gutters social-container\">\n");
      out.write("          <div class=\"col\"><a class=\"social-inner\" href=\"#\"><span class=\"icon mdi mdi-facebook\"></span><span>Facebook</span></a></div>\n");
      out.write("          <div class=\"col\"><a class=\"social-inner\" href=\"#\"><span class=\"icon mdi mdi-instagram\"></span><span>instagram</span></a></div>\n");
      out.write("          <div class=\"col\"><a class=\"social-inner\" href=\"#\"><span class=\"icon mdi mdi-twitter\"></span><span>twitter</span></a></div>\n");
      out.write("          <div class=\"col\"><a class=\"social-inner\" href=\"#\"><span class=\"icon mdi mdi-youtube-play\"></span><span>google</span></a></div>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
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
