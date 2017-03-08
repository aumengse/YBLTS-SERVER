<?php

/*
 * Following code will list all the products
 */

// array for JSON response
$response = array();


// include db connect class
require_once __DIR__ . '/db_connect.php';

// connecting to db
$db = new DB_CONNECT();

// get all products from products table
$result = mysql_query("SELECT *FROM ticket WHERE Status is not null") or die(mysql_error());

// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["ticket"] = array();
    
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $ticket = array();
        $ticket["Ticket_Num"] = $row["Ticket_Num"];
        $ticket["Date_issue"] = $row["Date_issue"];
        $ticket["Total_Amount"] = $row["Total_Amount"];
 	$ticket["Bus_Num"] = $row["Bus_Num"]; 
	$ticket["Fare_matrix_code"] = $row["Fare_matrix_code"]; 
	$ticket["Passenger_num"] = $row["Passenger_num"];
	$ticket["Distance_code"] = $row["Distance_code"]; 
	$ticket["Cargo_code"] = $row["Cargo_code"];
	$ticket["Cargo_weight"] = $row["Cargo_weight"]; 
	$ticket["Employee_ID"] = $row["Employee_ID"];
        $ticket["Status"] = $row["Status"];
        


        // push single product into final response array
        array_push($response["ticket"], $ticket);
    }
    // success
    $response["success"] = 1;

    // echoing JSON response
    echo json_encode($response);
} else {
    // no products found
    $response["success"] = 0;
    $response["message"] = "No ticket found";

    // echo no users JSON
    echo json_encode($response);
}
?>
