<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="oriweb.css">
    <script src="https://code.jquery.com/jquery-3.6.1.js" ></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <script src="https://unpkg.com/scrollreveal"></script>
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
</head>
<body>
    <nav>
        <div class="logo">
            <img src="images/logoblack.PNG">
        </div>
        <ul>
            <li><a href="/" class="active">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#services">Services</a></li>
          <!--    <li><a href="#">Portfolio</a></li>
            <li><a href="#">Team</a></li>
            <li><a href="#">Contact</a></li>-->
            <li><a href="loginpage" target="_blank">login</a></li>
        </ul>
    </nav>
    <section class="sec1">
    
        <h2 data-text="Vydhya...">Vydhya...</h2>
    </section>
    <section class="sec5" id="services">
        <section class="s1">
            <div class="container">
              <div class="content">
                <div class="image">
                  <img src="images/work-3.jpg" alt="">
                </div>
                <div class="text-box">
                  <h3>Appointment</h3>
                  <p>An appointment is a formal date or plan to meet at the appointed time. Whether you have a doctor’s appointment, a hair appointment, or a 1 o’clock lunch appointment, you need to be there — or you’ll have a broken appointment. It’s easier to remember your appointments if you write them down! With roots in the Old French apointier, meaning to “arrange, settle, or place," appointment can also mean the placing, or appointing of, someone into an unelected position.</p>
                </div>
              </div>
            </div>
          </section>
          <section class="s2">
            <div class="container">
              <div class="content">
                <div class="image">
                  <img src="images/work-4.jpg" alt="">
                </div>
                <div class="info">
                  <h4 class="info-title">Prescription</h4>
                  <p>Some medicines are only available from a pharmacist with a prescription from an authorised health practitioner. This ensures that your health practitioner can first assess your condition, determine which medicine you need and give you advice before you take it.</p>
                </div>
              </div>
            </div>
          </section>
          <section class="s1">
            <div class="container">
              <div class="content">
                <div class="image">
                  <img src="images/eork-7.jpg" alt="">
                </div>
                <div class="text-box">
                  <h3>Nutrition</h3>
                  <p>Body Mass Index (BMI) is a person's weight in kilograms (or pounds) divided by the square of height in meters (or feet). A high BMI can indicate high body fatness. BMI screens for weight categories that may lead to health problems, but it does not diagnose the body fatness or health of an individual.</p>
                </div>
              </div>
            </div>
          </section>
      
          <script>
            //common reveal options to create reveal animations
            ScrollReveal({
              //reset: true,
              distance: '60px',
              duration: 2500,
              delay: 400
            });
      
            //target elements, and specify options to create reveal animations
            ScrollReveal().reveal('.main-title, .section-title', { delay: 500, origin: 'left' });
            ScrollReveal().reveal('.s1 .image, .info', { delay: 600, origin: 'bottom' });
            ScrollReveal().reveal('.text-box', { delay: 700, origin: 'right' });
            ScrollReveal().reveal('.media-icons i', { delay: 500, origin: 'bottom', interval: 200 });
            ScrollReveal().reveal('.s2 .image, .s3 .image', { delay: 500, origin: 'top' });
            ScrollReveal().reveal('.media-info li', { delay: 500, origin: 'left', interval: 200 });
          </script>
    </section>
<section class="sec4" id="about">
  <ul class="honeycomb">
    <li class="honeycomb-cell">
        <img class="honeycomb-cell_img" src="images/work-1.png">
        <div class="honeycomb-cell_title">MEDICINE</div>
    </li>
    <li class="honeycomb-cell">
        <img class="honeycomb-cell_img" src="images/work-2.PNG">
        <div class="honeycomb-cell_title">HEALTH CARE</div>
    </li>
    <li class="honeycomb-cell">
        <img class="honeycomb-cell_img" src="images/work-3.jpg">
        <div class="honeycomb-cell_title">Appointment</div>
    </li>
    <li class="honeycomb-cell">
        <img class="honeycomb-cell_img" src="images/work-4.jpg">
        <div class="honeycomb-cell_title">Prescription</div>
    </li>
    <li class="honeycomb-cell">
        <img class="honeycomb-cell_img" src="images/work-5.jpg">
        <div class="honeycomb-cell_title">scanning reports</div>
    </li>
    <li class="honeycomb-cell">
        <img class="honeycomb-cell_img" src="images/work-6.jpg">
        <div class="honeycomb-cell_title">hospital<small>4D</small></div>
    </li>
    <li class="honeycomb-cell">
        <img class="honeycomb-cell_img" src="images/eork-7.jpg">
        <div class="honeycomb-cell_title">nutrition</div>
    </li>
    <li class="honeycomb-cell honeycomb_Hidden">
    </li>
</ul>

</section>
    <section class="sec3" id="footer">
        <footer>
            <div class="waves">
                <div class="wave" id="wave1"></div>
                <div class="wave" id="wave2"></div>
                <div class="wave" id="wave3"></div>
                <div class="wave" id="wave4"></div>
            </div>
            <ul class="social_icon">
                <li><a href="#"><ion-icon name="logo-facebook"></ion-icon></a></li>
                <li><a href="#"><ion-icon name="logo-twitter"></ion-icon></a></li>
                <li><a href="#"><ion-icon name="logo-linkedin"></ion-icon></a></li>
                <li><a href="#"><ion-icon name="logo-instagram"></ion-icon></a></li>
            </ul>
            <ul class="menu">
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Team</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
            <p>â¸Team C5-SDP3-S10-4 | All Rights Reserved</p>
        </footer>
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    </section>
    
</body>
</html>