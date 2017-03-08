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


$result = mysql_query("SELECT *FROM distance_traveled WHERE Status is null") or die(mysql_error());

// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["distance_traveled"] = array();
    
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $distance = array();
        $distance["distance_code"] = $row["distance_code"];
        $distance["distance_base"] = $row["distance_base"];
        $distance["distance_to"]= $row["distance_to"];
	$distance["via_from"] = $row["via_from"];
	$distance["via_to"] = $row["via_to"];
	$distance["Distance_value"] = $row["Distance_value"];
        $distance["Status"] = $row["Status"];
        
        array_push($response["distance_traveled"], $distance);
    }
    // success
    $response["success"] = 1;

    // echoing JSON response
    echo json_encode($response);
} else {
    // no products found
    $response["success"] = 0;
    $response["message"] = "No Cargo found";

    // echo no users JSON
    echo json_encode($response);
}
?>
