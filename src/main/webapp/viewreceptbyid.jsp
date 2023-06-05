<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!recTYPE html>
<html>
<head>
<style>
    body {
        padding: 0px;
        margin: 0;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
    }
    
    table {
        position: absolute;
        left: 50%;
        top: 50%;
        transform: translate(-50%, -50%);
        border-collapse: collapse;
        width: 800px;
        height: 200px;
        border: 1px solid #bdc3c7;
        box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.2), -1px -1px 8px rgba(0, 0, 0, 0.2);
    }
    
    tr {
        transition: all .2s ease-in;
        cursor: pointer;
    }
    
    th,
    td {
        padding: 12px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }
    
    #header {
        background-color: #16a085;
        color: #fff;
    }
    
    h1 {
        font-weight: 600;
        text-align: center;
        background-color: #16a085;
        color: #fff;
        padding: 10px 0px;
    }
    
    tr:hover {
        background-color: #f5f5f5;
        transform: scale(1.02);
        box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.2), -1px -1px 8px rgba(0, 0, 0, 0.2);
    }
    
    @media only screen and (max-width: 768px) {
        table {
            width: 90%;
        }
    }
</style>
</head>
<body>

<h1 align=center>recTOR DETAILS</h1>



<br>

<table align=center>

<tr><th>ID:</th>&nbsp;<td>${rec.rid}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${rec.name}</td></tr>
<tr><th>Username:</th>&nbsp;<td>${rec.username}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${rec.gender}</td></tr>
<tr><th>Age:</th>&nbsp;<td>${rec.age}</td></tr>
<tr><th>Qualification:</th>&nbsp;<td>${rec.qualification}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${rec.contactno}</td></tr>
<tr><th>EmailId:</th>&nbsp;<td>${rec.emailid}</td></tr>
<tr><th>Profile Image:</th>&nbsp;<td><img src="displayrecppic?rid=<c:out value='${rec.rid}' ></c:out>"/ width="20%" height="10%"></td></tr>


</table>



</body>
</html>

 
