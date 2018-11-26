<%-- 
    Document   : newindexpagejsp
    Created on : 21 Nov, 2018, 11:36:57 AM
    Author     : RAJAN
--%>

<%-- 
    Document   : indexpage
    Created on : 20 Nov, 2018, 12:26:43 PM
    Author     : RAJAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title></title>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script> 
  <script type="text/javascript" src="jquery.cycle.all.js"></script>
        <link rel="stylesheet" type="text/css" media="all" href="StyleSheet.css"></link>
    </head>
    <body>
    	<style>
            
*{
    
    margin:0px; padding:0px; font-family:Helvetica, Arial, sans-serif;}
.parallax {
    
    background-image:url("back2.gif");
    min-height: 500px; 
    background-attachment: fixed,fixed;
    background-position: center;
    background-repeat: no-repeat,no-repeat;
    background-size: cover,cover;
}

input[type=text], input[type=password] {
    width: 90%;
    padding: 12px 20px;
    margin: 8px 26px;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
	font-size:16px;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 26px;
    border: none;
    cursor: pointer;
    width: 90%;
	font-size:20px;
}
button:hover {
    opacity: 0.8;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    position: relative;
}
.avatar {
    width: 200px;
	height:200px;
    border-radius: 50%;
}
.slider{ 
 
 width: 340px; 
 height: 345px; 
 
 border: 0px solid #000000; 
 border-radius:15px; 
 box-shadow: 2px 2px 4px #333333; 
 
}


.modal {
	display:none;
    position: fixed;
    z-index: 1;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    overflow: auto;
    background-color: rgba(0,0,0,0.4);
}


.modal-content {
    background-color: #fefefe;
    margin: 4% auto 15% auto;
    border: 1px solid #888;
    width: 40%; 
	padding-bottom: 30px;
}

.close {
    position: absolute;
    right: 25px;
    top: 0;
    color: #000;
    font-size: 35px;
    font-weight: bold;
}
.close:hover,.close:focus {
    color: red;
    cursor: pointer;
}


.animate {
    animation: zoom 0.6s
}
@keyframes zoom {
    from {transform: scale(0)} 
    to {transform: scale(1)}
}
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}


.active {
    display: block;
    color: white;
    text-align: center;
    padding: 19px 18px;
    text-decoration: none;
    font-size: 22px;
    font-weight: bold;
}
td:hover{
     -ms-transform: scale(1.5);
    -webkit-transform: scale(1.5); 
    transform: scale(1.5); 
    opacity: 1.0;
     background-color: orange;
    color:white;
}
.img21{
    float: left;
    height: 200px;
    width: 300px;
}


</style>
<div class="parallax"></div>

<h1 style="text-align:center; font-size:50px; color:#fff">Find the best restaurants, cafés and bars in India</h1>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


<div id="modal-wrapper" class="modal">
  
  <form class="modal-content animate" action="loginjsp.jsp">
        
    <div class="imgcontainer">
      <span onclick="document.getElementById('modal-wrapper').style.display='none'" class="close" title="Close PopUp">&times;</span>
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNLzZszQbQf6jkknIGI8A3rj-0BoEngyi9156njfrCjPED9_b2vw" alt="Avatar" class="avatar">
      <h1 style="text-align:center">Sign up or log in</h1>
    </div>

    <div class="container">
    <form  action="loginjsp.jsp" >
      <input type="text" placeholder="Enter Username" name="uname">
      <input type="password" placeholder="Enter Password" name="psw">        
<input type="submit" id="search" value="login" >
 <input type="checkbox" style="margin:26px 30px;"> Remember me
      <a href="register.html" style="text-decoration:none; float:right; margin-right:34px; margin-top:26px;">Already have an account</a>
    </div>
  </form>
        
  
</div>

 <script language="javascript"> 

var modal = document.getElementById('modal-wrapper');
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}

 $(document).ready(function(){       $('#slider1') .cycle({ 
          fx: 'fade', 
          speed:  'slow', 
             timeout: 2000 
      });
  });
</script>

        <img src="Heading_Image.gif" alt="Not available"></img><br><br>
        <br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
        
        <ul>
          <li><a href="newindexpagejsp.jsp">Home</a></li>
  <li><a href="menupageph.jsp">Menu</a></li>
  <li><a  href="admincheck.jsp">Admin login</a></li>
  <li><a  href="AboutUs.html">About Us</a></li>
  <li><a href="profilejsp.jsp"><% String name=(String)session.getAttribute("uname"); out.println(name); %></a></li>
    <li><a  href="logout.jsp">LOG OUT</a></li>
</ul>
         
           <br>
           <br>
            <br>
           <br>
            <br>
           <br>
            <br>
            <br>
           <br>
<div class="slider"> 
<ul id="slider1">
    <li><img border="0" style="border-radius:30px"; src="slider1.jpg" width="1350" height="500" alt="img1" title="img1" /></li> 
    <li><img border="0" style="border-radius:30px;" src="https://0bba85283010b328c484-f139c7401b3658260f434c192b129add.ssl.cf3.rackcdn.com/alisstafford.com/manage/manage_uploads/upload/php7uKTGp.png" width="1350" height="500" alt="img2" title="img2" /></li> 
    <li><img border="0" style="border-radius:30px;" src="https://www.zinmobi.com/wp-content/uploads/2015/05/online-ordering.jpg" width="1350" height="500" alt="img3" title="img3" /></li> 
    <li><img border="0" style="border-radius:15px;" src="http://1.bp.blogspot.com/-yuc_xhPgqls/VTZyTReBC9I/AAAAAAAADRQ/ORufVCaIEeU/s1600/1.jpg" width="1350" height="500" alt="img4" title="img4" /></li> 
</ul> 
</div> 
       
       
             <div class="parallax"></div>
            
             
             <h1 style="text-align:center; font-size:50px; color:#fff">restaurants, cafés and bars </h1>
        <div>
            <table align="center" cellspacing="35px" style="padding-left: 250px;">
                <tr>
                    <td><img src="slide03.jpg" class="img21"><br>Gobind Sweets<a href="menupage.jsp"></a></td>
                    <td><img src="data:image/jpeg;base64,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" class="img21"><br>Pizza Hut<a href="menupageph.jsp"></a></td>
                </tr>
                <tr>
                    <td><img src="page-1_img06.jpg" class="img21"><br>Chandigarh Rasoi</td>
                      <td><img src="slide02.jpg" class="img21"><br>Reboot Life</td>
                </tr>
            </table>
        </div>

           <div class="parallax"></div>
            <footer>
                <div id="home_div">
                   
       <a href="refer.html"><img src="2icon.jpg" alt=""></a>
         <a href="refer.html"><img src="" alt=""></a>
       <a href=""><img src="swiggyclonepic2.JPG" alt=""></a>
        
                </div>
       
    </footer>
              <div class="parallax"></div>
      </body>
</html>

