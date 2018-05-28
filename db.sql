
Create database `jobportal`;

CREATE TABLE `jobportal`.`users` (
  `userId` INT NOT NULL COMMENT '',
  `username` VARCHAR(45) NULL COMMENT '',
  `password` VARCHAR(45) NULL COMMENT '',
  `email` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`userId`)  COMMENT '');
  
  
INSERT INTO `jobportal`.`users` (`userId`, `username`, `password`, `email`) VALUES ('1', 'saurabh', 'demo123', 'saurabh.find@gmail.com');
INSERT INTO `jobportal`.`users` (`userId`, `username`, `password`, `email`) VALUES ('2', 'kamlesh', 'demo124', 'kamlesh@gmail.com');


ALTER TABLE `jobportal`.`users` 
CHANGE COLUMN `userId` `userId` INT(11) NOT NULL AUTO_INCREMENT COMMENT '' ;
