<?php
include 'conf.php';
$id=$_GET['updateid'];
if(isset($_POST['update']))
{   
    $id=$_GET['updateid'];
    $nm=$_POST['name'];
    $ph=$_POST['phone'];
    $q="UPDATE magic SET id='$id',name='$nm',phone='$ph' WHERE id='$id'";
    $result=mysqli_query($con,$q);
    if($result)
    {
        echo "Update Successfully";
        header("Location:crud.php");
    }
    else
    {
        echo "update not successful";
    }
    
}
if (isset($_GET['updateid'])) {
    $q="SELECT id, name, phone FROM magic WHERE id='$id'";
    $result=mysqli_query($con,$q);
    while($row=mysqli_fetch_row($result))
    {
    $nm=$row[1];
    $ph=$row[2];
    }
}
?>

<!DOCTYPE html>
<head>
    <title>
        Crud PHP
    </title>
    <link rel="stylesheet" href="crud.css">
</head>
<body>
    <form action="" method="post">
      <div class="demo">
      <header>Crud Form</header><br>
      <label>Name :</label><br>
      <input type="text" value="<?php echo $nm; ?>" name="name"><br>

      <label>Phone :</label><br>
      <input type="text" value="<?php echo $ph; ?>" name="phone"><br><br><br>
     
      <input type="submit" value="submit" name="update"><br>
    </div>
    </form>
</body>
</html>
