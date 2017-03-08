<?php

/*
 * Following code will create a new product row
 * All product details are read from HTTP Post Request
 */

// array for JSON response
$response = array();

// check for required fields
if (isset($_POST['Ticket_Num']) && isset($_POST['Date_issue']) && isset($_POST['Total_Amount']) 
 && isset($_POST['Bus_Num'])&& isset($_POST['Fare_matrix_code'])&& isset($_POST['Passenger_num'])
 && isset($_POST['Distance_code']) && isset($_POST['Cargo_code']) && isset($_POST['Cargo_weight']) && isset($_POST['Employee_ID']) 
 && isset($_POST['Status'])){
    
    $tnum =     $_POST['Ticket_Num'];
    $tdate =    $_POST['Date_issue'];
    $ttotal =   $_POST['Total_Amount'];
    $tbnum =    $_POST['Bus_Num'];
    $tfare =    $_POST['Fare_matrix_code'];
    $tpass =    $_POST['Passenger_num'];
    $tdis =     $_POST['Distance_code'];
    $tcargo =   $_POST['Cargo_code'];
    $tcargow =  $_POST['Cargo_weight'];
    $tempid =   $_POST['Employee_ID'];
    $tstat =    $_POST['Status'];

    // include db connect class
    require_once __DIR__ . '/db_connect.php';

    // connecting to db
    $db = new DB_CONNECT();

    // mysql inserting a new row
    $result = mysql_query
("INSERT INTO ticket
(Ticket_Num, Date_issue, Total_Amount, Bus_Num, Fare_matrix_code, Passenger_num, Distance_code, Cargo_code,Cargo_weight,Employee_ID, Status) 
VALUES('$tnum', '$tdate', '$ttotal', '$tbnum', '$tfare','$tpass', '$tdis', '$tcargo', '$tcargow','$tempid', '$tstat')");

    // check if row inserted or not
    if ($result) {
        // successfully inserted into database
        $response["success"] = 1;
        $response["message"] = "Ticket successfully created.";

        // echoing JSON response
        echo json_encode($response);
    } else {
        // failed to insert row
        $response["success"] = 0;
        $response["message"] = "Oops! An error occurred.";
        
        // echoing JSON response
        echo json_encode($response);
    }
} else {
    // required field is missing
    $response["success"] = 0;
    $response["message"] = "Required field(s) is missing";

    // echoing JSON response
    echo json_encode($response);
}
?>