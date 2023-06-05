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
         <form:form id="register" action="addappointment" method="post" modelAttribute="app">
             <label>Doctor ID : </label>
             <br>
             <form:input path="dname" required="required" value="${dname}"></form:input>
             <br><br>
             <label>Patient ID : </label>
             <br>
             <form:input path="pname" required="required" value="${euname}" ></form:input>
             <br><br>
             <label>Problem : </label>
             <br>
             <form:input path="problem" required="required" ></form:input>
             <br><br>
             <label>Symptoms : </label>
             <br>
             <form:input path="symptoms" required="required" ></form:input>
             <br><br>
             <label>Appoinment Date : </label>
             <br>
             <form:input path="appdate" required="required" ></form:input>
             <br><br>
             <label>Appoinment Time : </label>
             <br>
             <form:input path="apptime" required="required" ></form:input>
             <br><br>
             <input type="submit" value="Book Appointment" name="submit" id="submit">
         </form:form>
     </div>

 </div>

 </body>
 </html>