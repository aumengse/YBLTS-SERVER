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


$result = mysql_query("SELECT *FROM dependents WHERE Status is null") or die(mysql_error());

// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["dependents"] = array();
    
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $dep = array();
        $dep["Dependent_ID"] = $row["Dependent_ID"];
        $dep["Dep_fname"] = $row["Dep_fname"];
        $dep["Dep_mname"] = $row["Dep_mname"];
	$dep["Dep_lname"] = $row["Dep_lname"];
	$dep["Rel_to_emp"] = $row["Rel_to_emp"];
	$dep["Employee_ID"] = $row["Employee_ID"];
        $dep["Status"] = $row["Status"];
        
        
        array_push($response["dependents"], $dep);
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
