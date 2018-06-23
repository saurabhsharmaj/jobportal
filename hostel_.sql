-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: jobportal
-- ------------------------------------------------------
-- Server version	5.5.46

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (1,'saurabh','1234567890','saurabh.find@gmail.com','male','cs','PERMANENT','2018-06-12',NULL,'saurabh','1'),(3,'yogesh','','','Male','Computer Science','HOD','2018-06-18',NULL,NULL,NULL);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `SId` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(45) DEFAULT NULL,
  `LastName` varchar(45) DEFAULT NULL,
  `SBranch` varchar(45) DEFAULT NULL,
  `SMobile` varchar(45) DEFAULT NULL,
  `SGender` varchar(45) DEFAULT NULL,
  `SRollNo` varchar(45) DEFAULT NULL,
  `SEmail` varchar(45) DEFAULT NULL,
  `SAddressP` varchar(100) DEFAULT NULL,
  `SAddressC` varchar(100) DEFAULT NULL,
  `SCity` varchar(45) DEFAULT NULL,
  `SState` varchar(45) DEFAULT NULL,
  `SDOB` date DEFAULT NULL,
  `S10Th` varchar(45) DEFAULT NULL,
  `S12Th` varchar(45) DEFAULT NULL,
  `SDeploma` varchar(45) DEFAULT NULL,
  `SPercent` varchar(45) DEFAULT NULL,
  `SJee` varchar(45) DEFAULT NULL,
  `SDirect` varchar(45) DEFAULT NULL,
  `FatherName` varchar(45) DEFAULT NULL,
  `MotherName` varchar(45) DEFAULT NULL,
  `FatherContact` varchar(45) DEFAULT NULL,
  `MotherContact` varchar(45) DEFAULT NULL,
  `SYear` varchar(45) DEFAULT NULL,
  `SEnum` varchar(45) DEFAULT NULL,
  `UpdatedOn` datetime DEFAULT NULL,
  `UpdatedBy` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SId`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Akki','kumawat','CSE','8824555555','male','15089','akashkumawatakkey@gmail.com','','','','','2018-06-12','75','85','','','','','','','',NULL,'','','2018-06-12 00:00:00',''),(2,'Dev','shah ','CSE','2153451355','male','54654664','dev.shah@gmail.com','','','','','2018-06-12','','','','','','','','','',NULL,'','','2018-06-12 00:00:00',''),(3,'kamlesh','kumar','CSE','9166054777','male','12365888','kamleshsevadad777@gmail.com','','','jaipur','raj','2018-06-12','77','70','','','','','kailash chand','mali devi','9982943927',NULL,'','','2018-06-12 00:00:00',''),(4,'PARO','kumawat','EC','2562655316','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'jyoti','yadav','CSE','2215646853','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'deepti','sharma','EC','65896658','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'sunil','kumawat','EE','2346546','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'pawan','jangid','EE','356869831','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'nihu','sharma','CIVIL','326881653','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'mamta','tomar','EE','526889165','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'kamini','choudhary','EE','659603551654','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'vivek','singh','CSE','53489653165','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'surya','sharma','CSE','6568651654','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'atul','kumar','EE','536846531','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'amit','verma','CIVIL','3548421654','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'vinod','yadav','MECHANICAL','534684656','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,'kiran','devanda','CSE','53468465156','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,'shalu','gora','EE','3546162121','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(19,'rajni','verma','CSE','32165451654','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(20,'yami','goutam','EE','5168453464','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(68,'jagdish','kumawat',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(69,'saurabh','sharma',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(70,'kk','soni',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `imgpath` varchar(100) DEFAULT NULL,
  `role` varchar(45) DEFAULT 'STUDENT',
  `status` int(11) DEFAULT '1',
  `lastlogin` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (3,'student','demo','pawan@gmail.com',NULL,'STUDENT',1,NULL),(7,'staff','demo','saurabh@gmail.com',NULL,'STAFF',1,NULL),(26,'yogesh','demo','sharma@gmail.com',NULL,'STUDENT',1,NULL),(27,'hod','demo','jagdish@gmail.com',NULL,'STAFF_HOD',1,NULL),(28,'admin','demo','admin@gmail.com',NULL,'ADMIN',1,NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendors`
--

DROP TABLE IF EXISTS `vendors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendors` (
  `Vendorid` int(11) NOT NULL AUTO_INCREMENT,
  `Vendorname` varchar(45) DEFAULT NULL,
  `Purpose` varchar(45) DEFAULT NULL,
  `imagepath` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Vendorid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendors`
--

LOCK TABLES `vendors` WRITE;
/*!40000 ALTER TABLE `vendors` DISABLE KEYS */;
INSERT INTO `vendors` VALUES (1,'saurabh','CA','c:/image/a.jpg');
/*!40000 ALTER TABLE `vendors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'jobportal'
--

--
-- Dumping routines for database 'jobportal'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-23  1:48:37

INSERT INTO `jobportal`.`applyleave` (`userid`, `purpose`, `remark`, `intime`, `outime`, `approved_by`, `confirm`, `updatedby`, `updatedon`) VALUES ('3', 'personal', 'abc reason', '2018-06-02 13:30:25', '2018-06-04 13:30:25', '27', 'NO', 'student', '2018-06-23 13:30:25');
INSERT INTO `jobportal`.`applyleave` (`userid`, `purpose`, `remark`, `intime`, `outime`, `approved_by`, `confirm`, `updatedby`, `updatedon`) VALUES ('26', 'official', 'xyz reason', '2018-06-04 13:30:25', '2018-06-10 13:30:25', '27', 'NO', 'yogesh', '2018-06-23 13:30:25');
INSERT INTO `jobportal`.`applyleave` (`userid`, `purpose`, `remark`, `intime`, `outime`, `approved_by`, `confirm`, `updatedby`, `updatedon`) VALUES ('3', 'personal', 'pqr reason', '2018-06-11 13:30:25', '2018-06-15 13:30:25', '27', 'NO', 'student', '2018-06-23 13:30:25');
INSERT INTO `jobportal`.`applyleave` (`userid`, `purpose`, `remark`, `intime`, `outime`, `approved_by`, `confirm`, `updatedby`, `updatedon`) VALUES ('3', 'personal', 'lmp reason', '2018-06-16 13:30:25', '2018-06-20 13:30:25', '27', 'NO', 'student', '2018-06-23 13:30:25');
INSERT INTO `jobportal`.`applyleave` (`userid`, `purpose`, `remark`, `intime`, `outime`, `approved_by`, `confirm`, `updatedby`, `updatedon`) VALUES ('26', 'official', 'asd reason', '2018-06-21 13:30:25', '2018-06-23 13:30:25', '27', 'NO', 'yogesh', '2018-06-23 13:30:25');
