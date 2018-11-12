<%-- 
    Document   : loginjsp
    Created on : 12 Nov, 2018, 8:05:28 AM
    Author     : RAJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
            String user=request.getParameter("uname");
            String pass=request.getParameter("psw");
            String url="jdbc:mysql://localhost:3306/yollo";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,"root","");
            String query="select * from userdetail";
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
            
      String username=rs.getString("username");
      String passs=rs.getString("password");
      if(pass.equals(passs))
      {
          if(username.equals(user))
          {
         out.println("login successfull");
          }
          else 
          {
              out.println("please try again with valid credentials");
      }
    
        %>
    </body>
</html>