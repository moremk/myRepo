<?php
include 'conf.php';
if(isset($_POST['submit']))
{
$nm=$_POST['nm'];
$ph=$_POST['ph'];
$q="insert into magic(name,phone)values('$nm','$ph')";
$result=mysqli_query($con,$q);
if($result)
{
    echo "<script>alert('insert Sucessfully')</script>";
    header("Location:crud.php");
}
else
{
    echo "insert not successful";
}
}
echo "<br><br>";
echo "<a href='data.php'style='margin-left:500px; font-size:20px;text-decoration:none;'>Add Data</a><br><br>";
echo "<table border=1 style='margin-left:500px; font-size:20px;'>
<tr>
<th>Id</th>
<th>Name</th>
<th>Phone</th>
<th>Update</th>
<th>Delete</th>
</tr>";
$q="select * from magic";
$result=mysqli_query($con,$q);
while($row=mysqli_fetch_row($result))
{
    $id=$row[0];
    echo "</tr>
    <td>$id</td>
    <td>$row[1]</td>
    <td>$row[2]</td>
    <td><a href='update.php? updateid=$id'style='text-decoration:none;color:green;'>update</a></td>
    <td><a href='delete.php? deleteid=$id'style='text-decoration:none;color:green;'>delete</a></td>
    </tr>";
}
echo "</table>";
?>

