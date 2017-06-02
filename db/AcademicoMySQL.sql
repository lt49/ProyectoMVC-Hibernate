-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema academico
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema academico
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `academico` DEFAULT CHARACTER SET utf8 ;
USE `academico` ;

-- -----------------------------------------------------
-- Table `academico`.`alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `academico`.`alumno` (
  `idalumno` INT(11) NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(25) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `codigo` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idalumno`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `academico`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `academico`.`usuario` (
  `idusuario` INT(11) NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(15) NULL DEFAULT NULL,
  `clave` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
