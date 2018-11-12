<%-- 
    Document   : regjsp
    Created on : 12 Nov, 2018, 2:00:50 PM
    Author     : RAJAN
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>insert page in test1</title>
    </head>
    <body>
        <% 
            String uname=request.getParameter("txtFName");
            String pass=request.getParameter("txtpassword");
            String name=(String)session.getAttribute("txtFName");
            String email=(String)session.getAttribute("txtEmail");
            String password=(String)session.getAttribute("txtpassword");
            String  mn=(String)session.getAttribute("num");
            int mnumber=Integer.parseInt("mn");
           
             try
           {   
            String url="jdbc:mysql://localhost:3306/yollo";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,"root","");
            String query="insert into userdetail values('"+name+"',"+email+",'"+password+"',"+mnumber+"')";
            out.println(query);
            Statement st=conn.createStatement();
            int q=st.executeUpdate(query);
            if(q>0)
            {
                out.println("row inserted");
            }
            else
            {
               out.println("row has not been inserted");
            }
            st.close();
            
        }
        
        catch(Exception e)
        {
            out.println("got an exception");
            out.println(e.getMessage());
        }
        %>
    </body>
</html>