<?php

$im=$_GET['im'];
$id=0;
while($id<10)
{
    $id++;
}
$con=new mysqli('localhost','root','','webcam');
if($con)
{
    echo "connection successfully";
}
$q="insert into web(Id,Image)values('$id','$im')";
$r=mysqli_query($con,$q);
if($r)
{
    echo "record insert successfully";
}
$q="SELECT DISTINCT * FROM web";
$t=mysqli_query($con,$q);
echo "<table border=1>";
echo "<th>Id</th>";
echo "<th>Image</th>";

while($row=mysqli_fetch_row($t))
{
    echo "<tr><td>".$row[0]."</td>";
    echo "<td>".$row[1]."</td>";
   
}
echo "</center>";
echo "</table>";
?>