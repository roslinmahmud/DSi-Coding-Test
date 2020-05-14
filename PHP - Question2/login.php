<!doctype html>
<html lang="en">

  <head>
    <meta charset="utf-8">
    <title>Login - App</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  </head>

  <body>
    <!-- Loads the Header-->
    <?php require 'login-validate.php'?>

    <div class="container" >
      
      <div class="container border border-light" style="width: 500px; margin-top: 10px;">
            <h3>Sign in</h3>
            <hr>
        <form method="post">
              <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control text-lowercase <?php print $emailValidity;?>" value="<?php print $email?>" name="email" id="email" placeholder="email" aria-describedby="emailText" required>
                <small id="emailText" class="invalid-feedback"><?php print $emailErr;?></small>
              </div>
              <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control <?php print $passwordValidity;?>" value="<?php print $password?>" name="password" id="password" placeholder="********" aria-describedby="passwordText" required>
                <small id="nameText" class="invalid-feedback"><?php print $passwordErr;?></small>
              </div>
              <div class="form-group">
                <button type="submit" class="btn btn-primary">Login</button>
              </div>
            </div>
        </form>
        
        </div>

    <!-- Loads the Footer-->
    <?php include 'script.php'?>
  </body>

</html>
