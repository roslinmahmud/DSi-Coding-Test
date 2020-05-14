<!doctype html>
<html lang="en">

  <head>
    <meta charset="utf-8">
    <title>Lading - App</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  </head>

  <body>
  </body>

</html>
<?php

    if($_SERVER['REQUEST_METHOD'] == 'GET'){
        if($_REQUEST['status'] == "valid"){
            print '<div class="container alert alert-info" role="alert">Login successful </div>';
        }
        else{
            print '<div class="container alert alert-danger" role="alert">Invalid email/password </div>';
        }
    }
?>