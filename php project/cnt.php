<!DOCTYPE HTML>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
p {
margin-top:-30px;     
width:250px;
height:40px;
text-align: center;
font-size: 30px;
margin-top: 0px;
}
</style>
</head>
<body>
<p id="demo" div class="bg-success p-3">Start</p>
</div>
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
const myTimeout = setTimeout(myGreeting, 5000)
function myGreeting() {
alert("Stop");
  document.getElementById("demo").innerHTML ="Stop" ;
}
function mystopfunction()
{
clearTimeout(myTimeout);
}
</script>
</body>
</html>