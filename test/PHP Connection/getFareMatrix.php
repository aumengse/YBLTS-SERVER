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


$result = mysql_query("SELECT *FROM fare_matrix WHERE Status is null HAVING MAX(Fare_matrix_code)") or die(mysql_error());

// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["fare_matrix"] = array();
    
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $fare_matrix = array();
        $fare_matrix["Fare_matrix_code"] = $row["Fare_matrix_code"];
        $fare_matrix["First_5km"] = $row["First_5km"];
        $fare_matrix["Effectivity"] = $row["Effectivity"];
        $fare_matrix["Status"] = $row["Status"];
        
        
        array_push($response["fare_matrix"], $fare_matrix);
    }
    // success
    $response["success"] = 1;

    // echoing JSON response
    echo json_encode($response);
} else {
    // no products found
    $response["success"] = 0;
    $response["message"] = "No fare matrix found";

    // echo no users JSON
    echo json_encode($response);
}
?>
