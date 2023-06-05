<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
<script src="script1.js" defer></script>
<style>
   *{
 margin: 0px;
 padding: 0px;
}
body{
 font-family: arial;
 background:black;
}
.main{
 margin: 2%;
}
@keyframes animate{
   0%{
     opacity: 0;
   }
   50%{
     opacity: 0.7;
   }
   100%{
     opacity: 0;
   }
 }
.card{
     width: 20%;
     display: inline-block;
     box-shadow: 2px 2px 20px grey;
     border-radius: 5px; 
     margin: 2%;
     background:grey;
     color:white;
    }

.image img{
  width: 100%;
  border-top-right-radius: 5px;
  border-top-left-radius: 5px;
  

 
 }

.title{
 
  text-align: center;
  padding: 10px;
  
 }

h1{
  font-size: 20px;
 }

.des{
  padding: 3px;
  text-align: center;
 
  padding-top: 10px;
        border-bottom-right-radius: 5px;
  border-bottom-left-radius: 5px;
}
button{
  margin-top: 40px;
  margin-bottom: 10px;
  background-color: white;
  border: 1px solid black;
  border-radius: 5px;
  padding:10px;
}
button:hover{
  background-color: black;
  color: white;
  transition: .5s;
  cursor: pointer;
}
</style>
</head>
<body>
<div class="main">
<button ><a href="adminpage">Back</a></button>
<h1 style="text-align: center;padding: auto;font-family: sans-serif;font-size: 3rem;animation: animate 2.5s linear infinite;color:white;">Patients List</h1>
 
<c:forEach items="${patlist}" var="emp">
<div class="card">
<div class="image">
<img src="displaypatpic?id=<c:out value='${emp.id}' ></c:out>">
</div>
<div class="title">
<h1><c:out value="${emp.fullname}"></c:out></h1>
</div>
<div class="des">
<p>Gender: <c:out value="${emp.gender}"></c:out></p>
<p>Blood Group: <c:out value="${emp.bloodgroup}"></c:out></p>
<p>Age: <c:out value="${emp.age}"></c:out></p>
<p>Registered Date: <c:out value="${emp.registerdate}"></c:out></p>
<p>Location: <c:out value="${emp.location}"></c:out></p>
<p>Contact Number: <c:out value="${emp.contactno}"></c:out></p>
<p>Username: <c:out value="${emp.username}"></c:out></p>

<button> <a href='<c:url value='deletepat?id=${emp.id}'></c:url>'>DELETE</a></button>
<button><a href='<c:url value='viewempbyid?id=${emp.id}'></c:url>' class="cart">VIEW</a></button>
</div>
</div>
</c:forEach>
</div>

</body>
</html>

 
