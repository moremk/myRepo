<?php
SESSION_START();
$nm=$_GET['nm'];
$ps=$_GET['ps'];
$_SESSION['nm']=$nm;
$_SESSION['ps']=$ps;
?>
<html>
    <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"> 
   <script>
    var countDownDate = new Date("Jan 5, 2024 15:37:25").getTime();
   var x = setInterval(function() {
  var now = new Date().getTime();
  var distance = countDownDate - now;
  var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
  var seconds = Math.floor((distance % (1000 * 60)) / 1000);
  document.getElementById("demo").innerHTML = hours+"h:"+minutes+"m :"+seconds+"s";
  if (distance < 0) {
    clearInterval(x);
    document.getElementById("demo").innerHTML = mystopfunction();
  }
}, 1000);
const myTimeout = setTimeout(myGreeting, 20000)
function myGreeting() {
  alert("submit exam !!");
  document.test.submit();
}
function mystopfunction()
{
clearTimeout(myTimeout);
}
    </script>
  </head>
    <style>
      p{
        margin-left:253px;
        max-width:200px;
        max-height:50px;
        color:black;
        text-align:center;
        font-size:20px;
      }
        h1{
          max-width:500px;
          max-height:100px;
        }
        h2{
          max-width:500px;
          max-height:200px;
          margin-top:-10px;
          
        }
        input[type='radio']
        {
            margin-left:-20px;
            width:50px;
            height:30px;
        }
        input[type='submit']
        {
        max-width:100px;
        max-height:50px;
        border-radius:30px;
        }
        </style>
        <body div class="bg-dark p-3">
          <center>
        <p id="demo" div class="bg-success p-3">Start</p></center>
    <form action='result.php' form name="test" method='GET'>
    
    <center>
    <h1 div class="bg-primary p-3">EXAM START</h1>
    <h2 div class="bg-success p-3" class="form control">Q1) 5 + 3 = ?</br>
     <input type="radio" name="n" value="1">8<br>
     <input type="radio" name="n" value="0">3<br>
     <input type="radio" name="n" value="0">4<br>
     <input type="radio" name="n" value="0">7<br>
    </h2>
    <h2 div class="bg-success p-3">Q2) 7 - 6 = ?</br>
     <input type="radio" name="p" value="0">0<br>
     <input type="radio" name="p" value="1">1<br>
     <input type="radio" name="p" value="0">2<br>
     <input type="radio" name="p" value="0">3<br>
    </h2>
    <h2 div class="bg-success p-3">Q3) 9 * 9 = ?</br>
     <input type="radio" name="k" value="0">98<br>
     <input type="radio" name="k" value="0">30<br>
     <input type="radio" name="k" value="1">81<br>
     <input type="radio" name="k" value="0">76<br>
    </h2>
    <h2 div class="bg-success p-3">Q4) 81 % 9 = ?</br>
     <input type="radio" name="i" value="1">0<br>
     <input type="radio" name="i" value="0">1<br>
     <input type="radio" name="i" value="0">2<br>
     <input type="radio" name="i" value="0">3<br>
    </h2>
    <input type='submit' class="btn btn-primary"value='submit'>
    </center>
</form>
      </body>
</html>


