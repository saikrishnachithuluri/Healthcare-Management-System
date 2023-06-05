<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
 <!DOCTYPE html>
 <html>
 <head>
     <title>Registration Form</title>
     <link rel="stylesheet" href="styles.css" type="text/css">
     <style>
     *
{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}
body
{
    color: black;
    display: flex;
    height: 100vh;
    justify-content: center;
    align-items: center;
    /*background: linear-gradient(135deg, #05073a,#dc0606ca);*/
    background: url(images/6.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
    padding: 10px;
}
.container
{
    max-width: 700px;
    width: 100%;
    padding: 25px 30px;
    border-radius: 25px;
    background: linear-gradient(135deg, skyblue,white);
}
.container .heading
{
    font-size: 25px;
    font-weight: 500;
    position: relative;
    text-align: center;
    padding: 0 0 20px 0;
}
.container .heading::before
{
    content: '';
    position: absolute;
    height: 3px;
    left: 0;
    bottom: 0;
    width: 100%;
    background: linear-gradient(135deg,black,blue);
}
.container form .card-details
{
    margin-top: 25px;
    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
}
form .card-details .card-box
{
    width: calc(100% / 2 - 20px);
    margin-bottom: 15px;
}
.card-details .card-box .details
{
    display: block;
    font-weight: 500;
    margin-bottom: 5px;
}
.card-details .card-box label
{
    display: block;
    font-weight: 500;
    margin-bottom: 5px;
}
.card-details .card-box input
{
    height: 45px;
    width: 100%;
    outline: none;
    border-radius: 5px;
    border: 1px solid #ccc;
    padding-left: 15px;
    font-size: 16px;
    border-bottom-width: 2px;
    transition: all 0.3s ease;
}
.card-details .card-box option
{
    height: 45px;
    width: 100%;
    outline: none;
    border-radius: 5px;
    border: 1px solid #ccc;
    padding-left: 15px;
    font-size: 16px;
    border-bottom-width: 2px;
    transition: all 0.3s ease;
}
.card-details .card-box input:focus,
.card-details .card-box input:valid{
    border-color: #9b59b6;
}
form .circal-form .circal-title
{
    font-size: 20px;
    font-weight: 500;
    border-bottom: 2px solid;
}
form .circal-form .category
{
    margin-top: 10px;
    margin-bottom: 10px;
}
form .button
{
    text-align: center;
}
form .button input
{
    padding: 10px 0;
    margin-top: 10px;
    height: 100%;
    width: 50%;
    outline: none;
    color: #fff;
    border: none;
    font-size: 18px;
    font-weight: 500;
    border-radius: 10px;
    letter-spacing: 1px;
    background: linear-gradient(135deg, skyblue,blue);
}
form .button input:hover
{
    background: linear-gradient(135deg,blue,skyblue
    );

}


@media (max-width:584px)
{
    .container{
        max-width: 100%;
    }
    form .card-details .card-box{
        margin-bottom: 15px;
        width: 100%;
    }
    form .circal-form .category{
        width: 100%;
    }
    .container form .card-details{
        max-height: 300px;
        overflow: scroll;
    }
    .card-details::-webkit-scrollbar{
        width: 0;
    }
}
     </style>
 </head>

 <body>

 <div class="container">
     <div class="heading">Receptionist Registration Form </div>
         <form id="register" action="addreceptionist" method="post" enctype="multipart/form-data">
         <div class="card-details">
         <div class="card-box">
             <span class="details">FullName</span>
             <input type="text" name="name" required="required" placeholder="Enter Your Name"></input>
             </div>
             <div class="card-box">
             <span class="details">Username</span>
             <input type="text" name="username" required="required" placeholder="Username"></input>
             </div>
             <div class="card-box">
             <span class="details">Password</span>
             <input type="password" name="password" required="required" placeholder="Password"></input>
             </div>
             <div class="card-box">
             <label for="gender" style="display:block;font-weight: 500;margin-bottom: 5px;">Gender</label>
             <select name="gender" id="gender" style="height: 45px;width: 100%;outline: none;border-radius: 5px;border: 1px solid #ccc;padding-left: 15px;font-size: 16px;border-bottom-width: 2px;transition: all 0.3s ease;">
             <option value="" disabled selected>Select gender</option>
             <option value="MALE">Male</option>
             <option value="FEMALE">Female</option>
             </select>
             </div>
             <div class="card-box">
             <span class="details">Age</span>
             <input type="text" name="age" required="required" id="name" placeholder="How old are you?"></input>
             </div>
             <div class="card-box">
             <span class="details">Qualification</span>
             <input type="text" name="qualification" required="required" placeholder="Enter your Qualification"></input>
             </div>
             <div class="card-box">
             <span class="details">Joining</span>
             <input type="datetime-local" name="yearofjoin" required="required" placeholder="YYYY"></input>
             </div>
             <div class="card-box">
             <span class="details">Contact Number</span>
             <input type="text" name="contactno" required="required" placeholder="Enter your Contact Number"></input>
             </div>
             <div class="card-box">
             <span class="details">Email ID</span>
             <input type="text" name="emailid" required="required" placeholder="Enter your Email ID"></input>
             </div>
             <div class="card-box">
             <span class="details">Profile Image : </span>
             <input type="file" name="recppic" required="required"/>
             </div>
             </div>
             <div class="button">
             <input type="submit" value="Register" name="submit" id="submit">
             </div>
         </form>
     </div>

 </div>

 </body>
 </html>