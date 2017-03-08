CREATE DATABASE `yellowbusdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

CREATE TABLE `account` (
  `Username` varchar(10) NOT NULL,
  `Password` varchar(200) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Emp_Type` varchar(45) NOT NULL,
  PRIMARY KEY (`Username`),
  UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `bus` (
  `Bus_Number` varchar(15) NOT NULL,
  `Bus_Class` varchar(100) NOT NULL,
  `Succeeding_fare` decimal(10,2) NOT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Bus_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `cargo` (
  `cargo_code` int(11) NOT NULL AUTO_INCREMENT,
  `cargo_weight` decimal(10,2) DEFAULT NULL,
  `cargo_type` varchar(100) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cargo_code`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `dependents` (
  `Dependent_ID` varchar(45) NOT NULL,
  `Dep_fname` varchar(45) NOT NULL,
  `Dep_mname` varchar(45) NOT NULL,
  `Dep_lname` varchar(45) NOT NULL,
  `Rel_to_emp` varchar(45) NOT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Employee_ID` varchar(45) NOT NULL,
  PRIMARY KEY (`Dependent_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `distance_traveled` (
  `distance_code` int(11) NOT NULL AUTO_INCREMENT,
  `distance_base` varchar(100) NOT NULL,
  `distance_to` varchar(100) NOT NULL,
  `via_from` varchar(100) DEFAULT NULL,
  `via_to` varchar(100) DEFAULT NULL,
  `Distance_value` decimal(10,2) NOT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `route` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`distance_code`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `employee` (
  `Employee_ID` int(11) NOT NULL,
  `Employee_FName` varchar(100) NOT NULL,
  `Employee_Mname` varchar(100) NOT NULL,
  `Emp_Lname` varchar(45) NOT NULL,
  `Job_Description` varchar(45) NOT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Employee_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `fare_matrix` (
  `Fare_matrix_code` int(11) NOT NULL AUTO_INCREMENT,
  `First_5km` decimal(10,2) NOT NULL,
  `Effectivity` datetime NOT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Fare_matrix_code`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

CREATE TABLE `passenger` (
  `Passenger_Num` int(11) NOT NULL AUTO_INCREMENT,
  `Passenger_Type` varchar(100) DEFAULT NULL,
  `Discount` varchar(10) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Passenger_Num`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `ticket` (
  `Ticket_Num` varchar(45) NOT NULL,
  `Date_issue` datetime DEFAULT NULL,
  `Bus_Num` varchar(45) DEFAULT NULL,
  `Fare_matrix_code` int(11) DEFAULT NULL,
  `Passenger_num` int(11) DEFAULT NULL,
  `Distance_code` int(11) DEFAULT NULL,
  `Cargo_code` int(11) DEFAULT NULL,
  `Total_amount` decimal(10,2) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Ticket_Num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

