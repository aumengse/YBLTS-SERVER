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


$result = mysql_query("SELECT Username, Emp_Type, pw, Status FROM account WHERE Emp_Type = 'Conductor' or  Emp_Type = 'Inspector' and Status is null") or die(mysql_error());

// check for empty result
if (mysql_num_rows($result) > 0) {
    // looping through all results
    // products node
    $response["account"] = array();
    
    while ($row = mysql_fetch_array($result)) {
        // temp user array
        $account = array();
        $account["Username"] = $row["Username"];
        $account["pw"] = $row["pw"];
        $account["Emp_Type"] = $row["Emp_Type"];
        $account["Status"] = $row["Status"];
        
        
        array_push($response["account"], $account);
    }
    // success
    $response["success"] = 1;

    // echoing JSON response
    echo json_encode($response);
} else {
    // no products found
    $response["success"] = 0;
    $response["message"] = "No account found";

    // echo no users JSON
    echo json_encode($response);
}
?>
