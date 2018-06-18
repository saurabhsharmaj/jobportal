CREATE DATABASE  IF NOT EXISTS `jobportal`
USE `jobportal`;

DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staffid` int(11) NOT NULL AUTO_INCREMENT,
  `staffname` varchar(45) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `department` varchar(45) DEFAULT NULL,
  `stafftype` varchar(45) DEFAULT NULL,
  `dateofbirth` date DEFAULT NULL,
  `updatedon` datetime DEFAULT NULL,
  `updatedby` varchar(45) DEFAULT NULL,
  `statusenum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`staffid`)
);

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `sId` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `sBranch` varchar(45) DEFAULT NULL,
  `sMobile` varchar(45) DEFAULT NULL,
  `sGender` varchar(45) DEFAULT NULL,
  `sRollNo` varchar(45) DEFAULT NULL,
  `sEmail` varchar(45) DEFAULT NULL,
  `sAddressP` varchar(100) DEFAULT NULL,
  `sAddressC` varchar(100) DEFAULT NULL,
  `sCity` varchar(45) DEFAULT NULL,
  `sState` varchar(45) DEFAULT NULL,
  `sDOB` date DEFAULT NULL,
  `s10Th` varchar(45) DEFAULT NULL,
  `s12Th` varchar(45) DEFAULT NULL,
  `sDeploma` varchar(45) DEFAULT NULL,
  `sPercent` varchar(45) DEFAULT NULL,
  `sJee` varchar(45) DEFAULT NULL,
  `sDirect` varchar(45) DEFAULT NULL,
  `satherName` varchar(45) DEFAULT NULL,
  `sotherName` varchar(45) DEFAULT NULL,
  `satherContact` varchar(45) DEFAULT NULL,
  `sotherContact` varchar(45) DEFAULT NULL,
  `sYear` varchar(45) DEFAULT NULL,
  `sEnum` varchar(45) DEFAULT NULL,
  `spdatedOn` datetime DEFAULT NULL,
  `spdatedBy` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SId`)
) ;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `imgpath` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`userId`)
);

--
-- Table structure for table `vendors`
--

DROP TABLE IF EXISTS `vendors`;

CREATE TABLE `vendors` (
  `Vendorid` int(11) NOT NULL AUTO_INCREMENT,
  `Vendorname` varchar(45) DEFAULT NULL,
  `Purpose` varchar(45) DEFAULT NULL,
  `imagepath` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Vendorid`)
) ;
