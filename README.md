# Applications Structure

### Java - Question 1
#### Contains 4 class
* Main - Starting point of the command line system & responsible for standard input/output for the system.
* Engine - An Interface for Vehicle class emphasize methods implementation related to engine.
* Vehicle - A class to implement all feature - properties, methods for vehicle.
* Showroom - A class implements functionality of showroom - add/remove vehicle, visitors count, vehicles details.

#### Run the Application
``` bash
javac *.java

java Main
```

### PHP - Question 2
#### Contains 6 PHP file & 1 text document
* db1.0.txt - contains all query required to create database, table for the web project
* datbase-connect.php - contains code related to database connectivity for the project
* script.php - contains javascript external file linking code for bootstrap.
* login-control.php - contains code related database query functions.
* login-validate.php - contains code related to validate user sign-in form submission.
* login.php - contains code related sign-in page front-end.
* landing.php - contains code related to show sign-in status front-end

#### Run the Application
``` bash
Create the database using query form db1.0.txt document
run login.php file
```