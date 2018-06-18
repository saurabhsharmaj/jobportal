-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: jobportal
-- ------------------------------------------------------
-- Server version	5.5.60

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
-- Table structure for table `allocation_table`
--

DROP TABLE IF EXISTS `allocation_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `allocation_table` (
  `Al_id` int(11) NOT NULL,
  `St_id` int(11) DEFAULT NULL,
  `Sec_id` int(11) DEFAULT NULL,
  `St_name` varchar(45) DEFAULT NULL,
  `St_branch` varchar(45) DEFAULT NULL,
  `Updated_on` varchar(45) DEFAULT NULL,
  `Udated_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Al_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `allocation_table`
--

LOCK TABLES `allocation_table` WRITE;
/*!40000 ALTER TABLE `allocation_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `allocation_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `section_table`
--

DROP TABLE IF EXISTS `section_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `section_table` (
  `Sec_id` int(11) NOT NULL,
  `Sec_name` varchar(45) DEFAULT NULL,
  `Sec_branch` varchar(45) DEFAULT NULL,
  `Sec_no of student` int(11) DEFAULT NULL,
  PRIMARY KEY (`Sec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `section_table`
--

LOCK TABLES `section_table` WRITE;
/*!40000 ALTER TABLE `section_table` DISABLE KEYS */;
INSERT INTO `section_table` VALUES (1,'Spartan','mechanical',60),(2,'Chellengers','electrical',60),(3,'Yodhha','civil',57),(4,'Hackers','computer science',59),(5,'Superstars','electronics',51);
/*!40000 ALTER TABLE `section_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students` (
  `SId` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` text,
  `LastName` text,
  `SBranch` text,
  `SMobile` text,
  `SGender` text,
  `SRollNo` text,
  `SEmail` text,
  `SAddressP` text,
  `SAddressC` text,
  `SCity` text,
  `SState` text,
  `SDOB` text,
  `S10Th` text,
  `S12Th` text,
  `SDeploma` text,
  `SPercent` text,
  `SJee` text,
  `SDirect` text,
  `FatherName` text,
  `MotherName` text,
  `FatherContact` text,
  `MotherContact` text,
  `SYear` text,
  `SEnum` text,
  `UpdatedOn` text,
  `UpdatedBy` text,
  PRIMARY KEY (`SId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Akki','kumawat','CSE','8824555555','male','15089','akashkumawatakkey@gmail.com','','','','','2018-06-12','75','85','','','','','','','',NULL,'','','2018-06-12',''),(2,'Dev','shah ','CSE','2153451355','male','54654664','dev.shah@gmail.com','','','','','2018-06-12','','','','','','','','','',NULL,'','','2018-06-12',''),(3,'kamlesh','kumar','CSE','9166054777','male','12365888','kamleshsevadad777@gmail.com','','','jaipur','raj','2018-06-12','77','70','','','','','kailash chand','mali devi','9982943927',NULL,'','','2018-06-12',''),(4,'PARO','kumawat','EC','2562655316','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'jyoti','yadav','CSE','2215646853','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'deepti','sharma','EC','65896658','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'sunil','kumawat','EE','2346546','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'pawan','jangid','EE','356869831','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'nihu','sharma','CIVIL','326881653','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'mamta','tomar','EE','526889165','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'kamini','choudhary','EE','659603551654','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'vivek','singh','CSE','53489653165','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'surya','sharma','CSE','6568651654','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'atul','kumar','EE','536846531','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'amit','verma','CIVIL','3548421654','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'vinod','yadav','MECHANICAL','534684656','male',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,'kiran','devanda','CSE','53468465156','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(18,'shalu','gora','EE','3546162121','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(19,'rajni','verma','CSE','32165451654','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(20,'yami','goutam','EE','5168453464','female',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
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
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (20,'aa','as','saurabh.find@gmail.com',NULL),(21,'kamlesh','1234','kamleshsevada777@gmail.com',NULL),(22,'Nishu','5678','nishu111@gmail.com',NULL),(23,'pawan','1236','pawan@gmail.com',NULL),(24,'','','',NULL),(25,'kamlesh','demo','kamlesh@gmail.com',NULL),(26,'de','r','dd@gmail.com',NULL);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-13 18:27:11
