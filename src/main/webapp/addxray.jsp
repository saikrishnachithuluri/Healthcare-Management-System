<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
 <!DOCTYPE html>
 <html>
 <head>
     <title></title>
     <link rel="stylesheet" href="styles.css" type="text/css">
 </head>

 <body>

 <div class="main">
     <div class="register">
         <h2>Book Appointment</h2>
         <form:form id="register" action="addxray" method="post" modelAttribute="xray">
             <br><br>
             <label>Patient Username : </label>
             <br>
             <form:input path="pname" required="required" value="${pname}" ></form:input>
             <br><br>
             <label>Type : </label>
             <br>
             <form:input path="scantype" required="required" ></form:input>
             <br><br>
             <label>Appoinment Time : </label>
             <br>
             <form:input path="time" required="required" type="datetime-local"></form:input>
             <br><br>
             <label>Description : </label>
             <br>
             <form:input path="description" required="required" ></form:input>
             <br><br>
             <input type="submit" value="Book Appointment" name="submit" id="submit">
         </form:form>
     </div>

 </div>

 </body>
 </html>