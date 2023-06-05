<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
 <!DOCTYPE html>
 <html>
 <head>
     <title>Registration Form</title>
     <link rel="stylesheet" href="styles.css" type="text/css">
 </head>

 <body>

 <div class="main">
     <div class="register">
         <h2>Register Here</h2>
         <form id="register" action="updaterecppwd" method="post">
             <label>Old Password: </label>
             <br>
             <input name="ropwd" required="required" placeholder="Enter your Old Password">
             <br><br>
             <label>New Password: </label>
             <br>
             <input name="rnpwd" required="required" placeholder="Enter your New Password">
             <br><br>
             
             <input type="submit" value="Update" name="submit" id="submit">
         </form>
     </div>

 </div>

 </body>
 </html>