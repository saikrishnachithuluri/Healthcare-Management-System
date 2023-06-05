<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>responsive personal portfolio website design tutorail</title>

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">

    <!-- custom css file link  -->
    <link rel="stylesheet" href="style.css">

</head>
<body>
    
<!-- header section starts  -->

<header>

    <div class="user">
        <img src="images/avatar.svg" alt="">
        <h3 class="name"><c:out value="${euname}"></c:out></h3>
        <h3 class="name">PATIENT</h3>
    </div>

    <nav class="navbar">
        <ul>
            <li><a href="#home">home</a></li>
            <li><a href="viewemp" target="_blank">about</a></li>
            <li><a href="makeapp" target="_blank">Make An Appointment</a></li>
            <li><a href="viewpre" target="_blank">View Prescription</a></li>
            <li><a href="viewscans" target="_blank">View Scan Appointments</a></li>
            <li><a href="echangepwd" target="_blank">Update Password</a></li>
            <li><a href="loginpage">Logout</a></li>
        </ul>
    </nav>

</header>

<!-- header section ends -->

<div id="menu" class="fas fa-bars"></div>

<!-- home section starts  -->

<section class="home" id="home">

    <h3>HI THERE !</h3>
    <h1>I'M <span><c:out value="${euname}"></c:out></span></h1>

</section>







<!-- jquery cdn link  -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<!-- custom js file link  -->
<script src="script.js"></script>


</body>
</html>