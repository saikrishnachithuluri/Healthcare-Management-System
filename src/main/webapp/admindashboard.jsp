<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Admin Dashboard</title>
</head>
<body>
<div class="row">
        <div class="col-sm-3">
          <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
          <div class="card-body">
            <h4 class="card-title">Doctors</h4>
            <p class="card-text">${cou1}</p>
          </div>
        </div>
        </div>
        
        <div class="col-sm-3">
          <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
          <div class="card-body">
            <h4 class="card-title">Patients</h4>
            <p class="card-text">${cou2}</p>
          </div>
        </div>
        </div>
        
        <div class="col-sm-3">
          <div class="card text-white bg-primary mb-3" style="max-width: 20rem;">
          <div class="card-body">
            <h4 class="card-title">Receptionists</h4>
            <p class="card-text">${cou3}</p>
          </div>
        </div>
       </div>
</body>
</html>