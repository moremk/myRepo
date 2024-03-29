<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
     body{
            background: linear-gradient(rgba(0,0,0,0.1),rgba(0,0,0,0.1)),url("exam.jpeg");
            background-size:cover;
        }
        h2{
            margin-top:-50px;
            margin-left:-7px;
            padding:4px;
            text-align:center;
            color:white;
            max-width:1370px;
            height: 60px;
            background-color:blue;
        }
        h1
        {
            margin-top:-65px;
            border-radius:5px;
        }
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
.top{
   margin-top:150px;
   margin-left:30px;
   font-size:20px; 
   color:black;
   font-family:Light Italic;
}
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px -2px;
  border: none;
  cursor: pointer;
  width: 100px;
}

button:hover {
  opacity: 0.8;
}
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}
   
img.avatar {
  width: 10%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}
.modal {
  display: none;
  position: fixed; 
  z-index: 1;
  left: 0;
  top: 0;
  width: 100%; 
  height: 100%; 
  overflow: auto; 
  background-color: rgb(0,0,0); 
  background-color: rgba(0,0,0,0.4); 
  padding-top: 60px;
}
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto;
  border: 1px solid #888;
  width: 80%; 
}
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}
.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
    
  }
}
</style>
</head>
<body>

<img src="examlogo.jpeg" style="margin-top:-1px;border-radius:50px;max-width:100px;height:50px;">
<h2>Welcome To Online Exam</h2>
<h1><button onclick="document.getElementById('id01').style.display='block'" style="max-width:100px;margin-left:1230px;margin-top:-5px;border-radius:5px;font-size:20px;">Login</button>
</h1>
<div class="top">
<m style="font-family:bold;font-size:30px;color:red;">Some instructions Before Start Exam *</m><br><br>
1)Math knowledge is compulsory<br>
2)Click on login button to fill the details<br>
3)You have click the submit button directly enter into exam section<br>
4)In exam  10 question each question 1 marks no negative system<br>
5)Timer is set in exam section If you did not attend all questions before exam time the exam <br>
  &nbsp;&nbsp;&nbsp;will atomatic submit</br>
6)Submit the exam and see your result</br>
7)Best of Luck</br>
</div>
<div id="id01" class="modal">
  
  <form class="modal-content animate" action="exam.php" method="GET">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="user.jpeg" alt="Avatar" class="avatar">
    
    </div>

    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="nm" class="form-control" required>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="ps" required>
        
      <button type="submit">Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form>
</div>

<script>
var modal = document.getElementById('id01');
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>

</body>
</html>
