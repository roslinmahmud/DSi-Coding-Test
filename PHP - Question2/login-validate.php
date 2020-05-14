<?php
    // Import login() function
    require("login-control.php");

    $email = $password = "";
    $emailErr = $passwordErr = "";
    $emailValidity = $passwordValidity = "";
    $valid = true;

    if($_SERVER['REQUEST_METHOD'] == 'POST'){
        // Validating Email
        if(isset($_REQUEST['email'])){
            $email = $_REQUEST['email'];
            if(ctype_space($email)){
                $emailValidity = 'is-invalid';
                $emailErr = 'Email is required!';
                $valid = false;
            }
            else{
                $emailValidity = 'is-valid';
            }
        }
        else{
            $email = $_REQUEST['email'];
            $emailValidity = 'is-invalid';
            $valid = false;
        }
        // Validating Password
        if(isset($_REQUEST['password'])){
            $password = $_REQUEST['password'];
            if(ctype_space($password)){
                $passwordValidity = 'is-invalid';
                $passwordErr = "Password is required!";
                $valid = false;
            }
            else{
                $passwordValidity = 'is-valid';
            }
        }
        else{
            $password = $_REQUEST['password'];
            $valid = false;
        }
    }
    else{
        $valid = false;
    }

    if($valid){
        $result = login($email, $password);
        if ($result->num_rows > 0) {
            header("Location: landing.php?status=valid");
        }
        else{
            header("Location: landing.php?status=invalid");
        }
    }
?>