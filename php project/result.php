<html>
    <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
    <style>
    body{
        background-color:black;
    }
    </style>
<?php
SESSION_START();
$q1=$_GET['n'];
$q2=$_GET['p'];
$q3=$_GET['k'];
$q4=$_GET['i'];
$cnt=0;
$flage=1;
if($flage==1)
{
    $cnt=$q1+$q2+$q3+$q4;
}
else{
    echo "check your score".$cnt;
}
$con=new mysqli('localhost','root','','exam');
if($con)
{
    echo "connection successfully";
}
$q="insert into sample(Name,Password,Result)values('$_SESSION[nm]','$_SESSION[ps]','$cnt')";
$r=mysqli_query($con,$q);
if($r)
{
    echo "record insert successfully";
}
$q="SELECT DISTINCT * FROM sample";
$t=mysqli_query($con,$q);

echo "";
echo "<center>";
echo "<table border='1'  style=color:white;background-color:blue;text-align:center;max-width:2000px;>";
echo "<th div class=p-3 mb-2 bg-primary text-white>Name</th>";
echo "<th div class=p-3 mb-2 bg-primary text-white>Password</th>";
echo "<th div class=p-3 mb-2 bg-primary text-white>Result</th></tr>";

while($row=mysqli_fetch_row($t))
{
    echo "<tr><td div class=p-3 mb-2 bg-primary text-white>".$row[0]."</td>";
    echo "<td div class=p-3 mb-2 bg-primary text-white>".$row[1]."</td>";
    echo "<td div class=p-3 mb-2 bg-primary text-white>".$row[2]."</td></tr>";
}
echo "</center>";
echo "</table>";
?>
<body>
</body>
</html>