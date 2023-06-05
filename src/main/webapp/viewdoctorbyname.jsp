<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
    body {
        padding: 0px;
        margin: 0;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        background:#111;
    }
    
    table {
        position: absolute;
        left: 50%;
        top: 50%;
        transform: translate(-50%, -50%);
        border-collapse: collapse;
        width: 800px;
        height: 200px;
        border: 1px solid #f9ca24;
        box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.2), -1px -1px 8px rgba(0, 0, 0, 0.2);
        color:black;
    }
    
    tr {
        transition: all .2s ease-in;
        cursor: pointer;
        background:#333;
        color:white;
    }
    
    th,
    td {
        padding: 12px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    
    #header {
        background-color: #16a085;
        color: black;
    }
    
    h1 {
        font-weight: 600;
        text-align: center;
        background-color: #f9ca24;
        color: black;
        padding: 10px 0px;
    }
    
    tr:hover {
        background-color: #f9ca24;
        transform: scale(1.02);
        box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.2), -1px -1px 8px rgba(0, 0, 0, 0.2);
        color:black;
    }
    
    @media only screen and (max-width: 768px) {
        table {
            width: 90%;
        }
    }
</style>
</head>
<body>

<h1 align=center>DOCTOR DETAILS</h1>


<center>
<h3 align=right>Welcome&nbsp;<c:out value="${duname}"></c:out></h3>
</center>
<br>

<table align=center>
<tr><th>Profile Image:</th><td><img src="displaydocpic?did=<c:out value='${doc.did}' ></c:out>"/ width="30" height="20%"> </td></tr>
<tr><th>ID:</th>&nbsp;<td>${doc.did}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${doc.name}</td></tr>
<tr><th>Username:</th>&nbsp;<td>${doc.username}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${doc.gender}</td></tr>
<tr><th>Age:</th>&nbsp;<td>${doc.age}</td></tr>
<tr><th>Qualification:</th>&nbsp;<td>${doc.qualification}</td></tr>
<tr><th>YearOfJoin:</th>&nbsp;<td>${doc.yearofjoin}</td></tr>
<tr><th>Status:</th>&nbsp;<td>${doc.status}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${doc.contactno}</td></tr>
<tr><th>Email Id:</th>&nbsp;<td>${doc.emailid}</td></tr>




</table>



</body>
</html>

 
