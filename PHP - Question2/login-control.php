<?php
    // Import executeNonQuery(), executeQuery() functions
    require 'database-connect.php';

    function login($email, $password){
        $query = "select email from users where email='$email' and password='$password';";
        print $query;
        return executeQuery($query);
    }
?>