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


$result = mysql_query("SELECT *FROM employee WHERE Status is null") or die(mysql_error());

// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["employee"] = array();
    
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $employee = array();
        $employee["Employee_ID"] = $row["Employee_ID"];
        $employee["Employee_FName"] = $row["Employee_FName"];
        $employee["Employee_Mname"] = $row["Employee_Mname"];
	$employee["Emp_Lname"] = $row["Emp_Lname"];
	$employee["Job_Description"] = $row["Job_Description"];
        $employee["Status"] = $row["Status"];
        
        
        array_push($response["employee"], $employee);
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
