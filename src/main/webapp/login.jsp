<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.1.js" ></script>
    <script type="text/javascript">
        $(window).on('scroll',function(){
            if($(window).scrollTop()){
                $('nav').addClass('black');
            }
            else
            {
                $('nav').removeClass('black');
            }
        })

    </script>
<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=Roboto:700');
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@700&display=swap');
*
{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
}
body
{
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    background: url(images/loginimg.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
nav
{
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100px;
    padding: 10px 100px;
    box-sizing: border-box;
    transition: .5s;
    background: black;
}
nav.black
{
    background: rgba(0, 0, 0, .8);
    height: 80px;
    padding: 10px 50px;
}
nav .logo
{
    float: left;
}
nav .logo img
{
    height: 80px;
    transition: .5s;
    border-radius: 100%;
}
nav.black .logo img
{
    height: 60px;
    border-radius: 50%;
}
nav ul
{
    float: right;
    margin: 0;
    padding: 0;
    display: flex;
}
nav ul li
{
    list-style: none;
}
nav ul li a
{
    line-height: 80px;
    color: white;
    padding: 5px 20px;
    font-family: 'Roboto', sans-serif;
    text-decoration: none;
    text-transform: uppercase;
    transition: .5s;
}
nav.black ul li a
{
    color: #fff;
    line-height: 60px;
}
nav ul li a.active,
nav ul li a:hover
{
    color: white;
    background: #f00;
}
section.sec1{
  font-family: 'Lato', sans-serif;
  background: url(images/loginimg.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

section.sec1 .wrapper{
  position: fixed;
  top: 45%;
  left: 50%;
  transform: translate(-50%, -50%);
}

section.sec1 .link_wrapper{
  position: relative;
}

section.sec1 a{
  display: block;
  width: 250px;
  height: 50px;
  line-height: 50px;
  font-weight: bold;
  text-decoration: none;
  background: #333;
  text-align: center;
  color: #fff;
  text-transform: uppercase;
  letter-spacing: 1px;
  border: 3px solid #333;
  transition: all .35s;
}

section.sec1 .icon{
  width: 50px;
  height: 50px;
  border: 3px solid transparent;
  position: absolute;
  transform: rotate(45deg);
  right: 0;
  top: 0;
  z-index: -1;
  transition: all .35s;
}

section.sec1 .icon svg{
  width: 30px;
  position: absolute;
  top: calc(50% - 15px);
  left: calc(50% - 15px);
  transform: rotate(-45deg);
  fill: black;
  transition: all .35s;
}

section.sec1 a:hover{
  width: 200px;
  border: 3px solid black;
  background: transparent;
  color: black;
}

section.sec1 a:hover + .icon{
  border: 3px solid black;
  right: -25%;
 } 
section.sec1 .wrapper1{
  position: fixed;
  top: 25%;
  left: 50%;
  transform: translate(-50%, -50%);
}

section.sec1 .link_wrapper1{
  position: relative;
}
section.sec1 .wrapper2{
  position: fixed;
  top: 65%;
  left: 50%;
  transform: translate(-50%, -50%);
}

section.sec1 .link_wrapper2{
  position: relative;
}
section.sec1 .wrapper3{
  position: fixed;
  top: 85%;
  left: 50%;
  transform: translate(-50%, -50%);
}

section.sec1 .link_wrapper3{
  position: relative;
}
</style>
</head>
<body >
<nav>
        <div class="logo">
            <img src="images/logoblack.PNG">
        </div>
        <ul>
            <li><a href="/">Home</a></li>
           <!--   <li><a href="#footer">About</a></li>
            <li><a href="#">Services</a></li>
            <li><a href="#">Portfolio</a></li>
            <li><a href="#">Team</a></li>
            <li><a href="#">Contact</a></li>-->
            <li><a href="loginpage" class="active">login</a></li>
        </ul>
    </nav>
    <section class="sec1">
<div class="wrapper">
  <div class="link_wrapper">
    <a href="employeelogin" target="_blank">PATIENT</a>
    <div class="icon">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 268.832 268.832">
        <path d="M265.17 125.577l-80-80c-4.88-4.88-12.796-4.88-17.677 0-4.882 4.882-4.882 12.796 0 17.678l58.66 58.66H12.5c-6.903 0-12.5 5.598-12.5 12.5 0 6.903 5.597 12.5 12.5 12.5h213.654l-58.66 58.662c-4.88 4.882-4.88 12.796 0 17.678 2.44 2.44 5.64 3.66 8.84 3.66s6.398-1.22 8.84-3.66l79.997-80c4.883-4.882 4.883-12.796 0-17.678z"/>
      </svg>
    </div>
  </div>
  
</div>
<div class="wrapper1">
  <div class="link_wrapper1">
    <a href="adminlogin" target="_blank">ADMIN</a>
    <div class="icon">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 268.832 268.832">
        <path d="M265.17 125.577l-80-80c-4.88-4.88-12.796-4.88-17.677 0-4.882 4.882-4.882 12.796 0 17.678l58.66 58.66H12.5c-6.903 0-12.5 5.598-12.5 12.5 0 6.903 5.597 12.5 12.5 12.5h213.654l-58.66 58.662c-4.88 4.882-4.88 12.796 0 17.678 2.44 2.44 5.64 3.66 8.84 3.66s6.398-1.22 8.84-3.66l79.997-80c4.883-4.882 4.883-12.796 0-17.678z"/>
      </svg>
    </div>
  </div>
</div>
<div class="wrapper2">
  <div class="link_wrapper2">
    <a href="receptionistlogin" target="_blank">RECEPTIONIST</a>
    <div class="icon">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 268.832 268.832">
        <path d="M265.17 125.577l-80-80c-4.88-4.88-12.796-4.88-17.677 0-4.882 4.882-4.882 12.796 0 17.678l58.66 58.66H12.5c-6.903 0-12.5 5.598-12.5 12.5 0 6.903 5.597 12.5 12.5 12.5h213.654l-58.66 58.662c-4.88 4.882-4.88 12.796 0 17.678 2.44 2.44 5.64 3.66 8.84 3.66s6.398-1.22 8.84-3.66l79.997-80c4.883-4.882 4.883-12.796 0-17.678z"/>
      </svg>
    </div>
  </div>
</div>
<div class="wrapper3">
  <div class="link_wrapper3">
    <a href="doctorlogin" target="_blank">DOCTOR</a>
    <div class="icon">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 268.832 268.832">
        <path d="M265.17 125.577l-80-80c-4.88-4.88-12.796-4.88-17.677 0-4.882 4.882-4.882 12.796 0 17.678l58.66 58.66H12.5c-6.903 0-12.5 5.598-12.5 12.5 0 6.903 5.597 12.5 12.5 12.5h213.654l-58.66 58.662c-4.88 4.882-4.88 12.796 0 17.678 2.44 2.44 5.64 3.66 8.84 3.66s6.398-1.22 8.84-3.66l79.997-80c4.883-4.882 4.883-12.796 0-17.678z"/>
      </svg>
    </div>
  </div>
</div>
</section>
</body>
</html>