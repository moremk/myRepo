<?php
include 'conf.php';
if(isset($_GET['deleteid']))
{
    $id=$_GET['deleteid'];
    $q="delete from magic where id=$id";
    $result=mysqli_query($con,$q);
    if($result)
    {
        echo "<script>alert('delete successful');</script>";
        header('Location: crud.php');
    }
    else
    {
        echo "delete error";
    }
}
?>