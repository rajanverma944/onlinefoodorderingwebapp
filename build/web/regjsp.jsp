
<%@page contentType="text/html"%>
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
            String uname=request.getParameter("uname");
            String pass=request.getParameter("psw");
            String name=(String)session.getAttribute("txtFName");
            String email=(String)session.getAttribute("txtEmail");
            String password=(String)session.getAttribute("txtpassword");
            String  mnumber=(String)session.getAttribute("num");
           
           
            String url="jdbc:mysql://localhost:3306/yollo";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,"root","");
            String query="insert into userdetail values('"+uname+"','"+email+"','"+password+"',"+mnumber+")";
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
        
        %>
    </body>
</html>