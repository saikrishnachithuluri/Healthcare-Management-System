<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<!Doctype HTML>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href="admindashstyle.css" type="text/css"/>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>


<body>
	
	<div id="mySidenav" class="sidenav">
	<center><p class="logo"><span>V</span>ydhya</p></center>
  <a href="adminhome" class="icon-a"><i class="fa fa-dashboard icons"></i> &nbsp;&nbsp;Dashboard</a>
  <a href="adminpage" target="_blank" class="icon-a"><i class="fa fa-users icons" ></i> &nbsp;&nbsp;Admin</a>
  <a href="doctorreg" target="_blank" class="icon-a"><i class="fa fa-users icons"></i> &nbsp;&nbsp;Doctors</a>
  <a href="receptionistreg" target="_blank" class="icon-a"><i class="fa fa-users icons"></i> &nbsp;&nbsp;Receptionists</a>
  <a href="logout" class="icon-a"><i class="fa fa-dashboard icons"></i> &nbsp;&nbsp;Logout</a>
  

</div>
<div id="main">

	<div class="head">
		<div class="col-div-6">
<span style="font-size:30px;cursor:pointer; color: white;" class="nav"  >&#9776; Dashboard</span>
<span style="font-size:30px;cursor:pointer; color: white;" class="nav2"  >&#9776; Dashboard</span>
</div>
	
	<div class="col-div-6">
	<div class="profile">

		<img src="images/avatar.svg" class="pro-img" />
		<p><c:out value="${auname}"></c:out><span>ADMIN</span></p>
	</div>
</div>
	<div class="clearfix"></div>
</div>

	<div class="clearfix"></div>
	<br/>
	
	<div class="col-div-3">
		<div class="box">
			<p>${cou1}<br/><span>Doctors</span></p>
			<i class="fa fa-users box-icon"></i>
		</div>
	</div>
	<div class="col-div-3">
		<div class="box">
			<p>${cou2}<br/><span>Patients</span></p>
			<i class="fa fa-users box-icon"></i>
		</div>
	</div>
	<div class="col-div-3">
		<div class="box">
			<p>${cou3}<br/><span>Receptionists</span></p>
			<i class="fa fa-users box-icon"></i>
		</div>
	</div>
	
	
	<div class="clearfix"></div>
	<br/><br/>
	

	<div class="col-div-4">
		<div class="box-4">
		<div class="content-box">
			<center><p>Total Users</p></center>

			<div class="circle-wrap">
    <div class="circle">
      <div class="mask full">
        <div class="fill"></div>
      </div>
      <div class="mask half">
        <div class="fill"></div>
      </div>
      <div class="inside-circle"> ${sum} </div>
    </div>
  </div>
		</div>
	</div>
	</div>
	
		
	<div class="clearfix"></div>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>

  $(".nav").click(function(){
    $("#mySidenav").css('width','70px');
    $("#main").css('margin-left','70px');
    $(".logo").css('visibility', 'hidden');
    $(".logo span").css('visibility', 'visible');
     $(".logo span").css('margin-left', '-10px');
     $(".icon-a").css('visibility', 'hidden');
     $(".icons").css('visibility', 'visible');
     $(".icons").css('margin-left', '-8px');
      $(".nav").css('display','none');
      $(".nav2").css('display','block');
  });

$(".nav2").click(function(){
    $("#mySidenav").css('width','300px');
    $("#main").css('margin-left','300px');
    $(".logo").css('visibility', 'visible');
     $(".icon-a").css('visibility', 'visible');
     $(".icons").css('visibility', 'visible');
     $(".nav").css('display','block');
      $(".nav2").css('display','none');
 });

</script>

</body>


</html>
