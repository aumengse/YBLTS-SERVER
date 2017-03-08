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


$result = mysql_query("SELECT *FROM cargo WHERE Status is null") or die(mysql_error());

// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["cargo"] = array();
    
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $cargo = array();
        $cargo["cargo_code"] = $row["cargo_code"];
        $cargo["cargo_cost"] = $row["cargo_cost"];
        $cargo["cargo_type"] = $row["cargo_type"];
        $cargo["Status"] = $row["Status"];
        
        
        array_push($response["cargo"], $cargo);
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
