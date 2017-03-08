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
$result = mysql_query("SELECT *FROM bus WHERE Status is null") or die(mysql_error());

// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["bus"] = array();
    
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $bus = array();
        $bus["Bus_Number"] = $row["Bus_Number"];
        $bus["Bus_Class"] = $row["Bus_Class"];
        $bus["Succeeding_fare"] = $row["Succeeding_fare"];
        $bus["Status"] = $row["Status"];
        


        // push single product into final response array
        array_push($response["bus"], $bus);
    }
    // success
    $response["success"] = 1;

    // echoing JSON response
    echo json_encode($response);
} else {
    // no products found
    $response["success"] = 0;
    $response["message"] = "No bus found";

    // echo no users JSON
    echo json_encode($response);
}
?>
