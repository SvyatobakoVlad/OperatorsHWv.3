CREATE SCHEMA `coolcompany_Vlad` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `coolcompany_Vlad`.`tour` (
  `tour_id` INT NOT NULL AUTO_INCREMENT,
  `Tour_name` VARCHAR(45) NOT NULL,
  `Country` VARCHAR(45) NOT NULL,
  `Price` DECIMAL(10,2) NOT NULL,
  `Hotel` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`tour_id`));
  
  CREATE TABLE `coolcompany_Vlad`.`turist` (
  `turist_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `seria_passport` INT NOT NULL,
  `number_passport` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `pasword` VARCHAR(45) NOT NULL,
  `Date_of_birth` INT NOT NULL,
  `phone` INT NOT NULL,
  PRIMARY KEY (`turist_id`));
  
  CREATE TABLE `coolcompany_Vlad`.`turoperator` (
  `turoperator_id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`turoperator_id`));


CREATE TABLE `coolcompany_Vlad`.`putevka` (
  `putevka_id` INT NOT NULL AUTO_INCREMENT,
  `Nomer` INT NOT NULL,
  `Departure_Date` DATE NOT NULL,
  `Return_Date` DATE NOT NULL,
  PRIMARY KEY (`putevka_id`));
  
  INSERT INTO `coolcompany_Vlad`.`tour` (`tour_id`, `Tour_name`, `Country`, `Price`, `Hotel`) VALUES ('1', 'Виллы в Греции', 'Греция', '400', 'Вилла');
  INSERT INTO `coolcompany_Vlad`.`tour` (`tour_id`, `Tour_name`, `Country`, `Price`, `Hotel`) VALUES ('2', 'VIP Виллы в Испании', 'Испания', '930', 'VIP Вилла');

INSERT INTO `coolcompany_Vlad`.`turoperator` (`turoperator_id`, `Name`) VALUES ('1', 'Join UP');
INSERT INTO `coolcompany_Vlad`.`turoperator` (`turoperator_id`, `Name`) VALUES ('2', 'Anex Tour');
INSERT INTO `coolcompany_Vlad`.`turoperator` (`turoperator_id`, `Name`) VALUES ('3', 'TEZ Tour');

INSERT INTO `coolcompany_Vlad`.`turist` (`turist_id`, `first_name`, `last_name`, `seria_passport`, `number_passport`, `email`, `pasword`, `Date_of_birth`, `phone`) VALUES ('1', 'Sveta', 'Baranova', '35484', '46554', 'Svetabar@gmail.com', 'root', '10111997', '3801');
INSERT INTO `coolcompany_Vlad`.`turist` (`turist_id`, `first_name`, `last_name`, `seria_passport`, `number_passport`, `email`, `pasword`, `Date_of_birth`, `phone`) VALUES ('2', 'Vlad', 'Svyatobatko', '48949', '56566', 'Svyatobatko199@gmail.com', 'root', '10091999', '3844');

INSERT INTO `coolcompany_vlad`.`putevka` (`putevka_id`, `Nomer`, `Departure_Date`, `Return_Date`, `tour_id`, `turist_id`, `turoperator`) VALUES ('1', '1', '10.11.2020', '17.11.2020', '1', '2', '2');
INSERT INTO `coolcompany_vlad`.`putevka` (`putevka_id`, `Nomer`, `Departure_Date`, `Return_Date`, `tour_id`, `turist_id`, `turoperator`) VALUES ('2', '2', '10.11.2020', '13.11.2020', '3', '1', '2');

ALTER TABLE `coolcompany_vlad`.`putevka` 
ADD COLUMN `tour_id` INT NOT NULL AFTER `Return_Date`,
ADD COLUMN `turist_id` INT NOT NULL AFTER `tour_id`,
ADD COLUMN `turoperator_id` INT NOT NULL AFTER `turist_id`;

CREATE TABLE `coolcompany_vlad`.`turist_putevka` (
  `id_turist` INT NOT NULL,
  `id_putevka` INT NOT NULL,
  `count` INT NULL,
  PRIMARY KEY (`id_turist`, `id_putevka`),
  INDEX `putevka_idx` (`id_putevka` ASC),
  CONSTRAINT `turist`
    FOREIGN KEY (`id_turist`)
    REFERENCES `coolcompany_vlad`.`turist` (`turist_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `putevka`
    FOREIGN KEY (`id_putevka`)
    REFERENCES `coolcompany_vlad`.`putevka` (`putevka_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


SELECT * FROM turist_putevka where count >= 2;


  
  