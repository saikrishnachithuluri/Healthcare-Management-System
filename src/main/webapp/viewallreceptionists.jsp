<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
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

<h1 align=center>RECEPTIONISTS LIST</h1>




<table align=center border=2>

<tr id="header">

<th>ID</th>
<th>Name</th>
<th>Username</th>
<th>Gender</th>
<th>Age</th>
<th>Year Of Join</th>
<th>Qualification</th>
<th>Contact Number</th>
<th>Email Id</th>
<th>Action</th>

</tr>

<c:forEach items="${reclist}" var="emp">

<tr>

<td> <c:out value="${emp.rid}"></c:out>   </td>
<td> <c:out value="${emp.name}"></c:out>   </td>
<td> <c:out value="${emp.username}"></c:out>   </td>
<td> <c:out value="${emp.gender}"></c:out>   </td>
<td> <c:out value="${emp.age}"></c:out>   </td>
<td> <c:out value="${emp.yearofjoin}"></c:out>   </td>
<td> <c:out value="${emp.qualification}"></c:out>   </td>
<td> <c:out value="${emp.contactno}"></c:out>   </td>
<td> <c:out value="${emp.emailid}"></c:out>   </td>

<td>

<img src="displayrecppic?rid=<c:out value='${emp.rid}' ></c:out>"/ width="100%" height="100%"> 

</td>

<td> 

<a href='<c:url value='deleterec?id=${emp.rid}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewreceptionistbyid?rid=${emp.rid}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
