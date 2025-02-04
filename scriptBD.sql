-- MySQL Script generated by MySQL Workbench
-- Tue Nov 28 15:58:57 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema erpremuneraciones
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema erpremuneraciones
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `erpremuneraciones` DEFAULT CHARACTER SET latin1 ;
USE `erpremuneraciones` ;

-- -----------------------------------------------------
-- Table `erpremuneraciones`.`REM_Afp`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `erpremuneraciones`.`REM_Afp` (
  `codigoAfp` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `tasaAfp` DECIMAL(11,2) NOT NULL,
  `tasaSis` DECIMAL(11,2) NOT NULL,
  PRIMARY KEY (`codigoAfp`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `erpremuneraciones`.`REM_Ciudad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `erpremuneraciones`.`REM_Ciudad` (
  `idCiudad` INT(11) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCiudad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `erpremuneraciones`.`REM_Personal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `erpremuneraciones`.`REM_Personal` (
  `rut` INT(11) NOT NULL,
  `dv` INT(11) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidoP` VARCHAR(45) NOT NULL,
  `apellidoM` VARCHAR(45) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  `direccion` VARCHAR(140) NOT NULL,
  `inicioContrato` DATE NOT NULL,
  `sueldoBase` INT(11) NOT NULL,
  `bonoColacion` INT(11) NOT NULL,
  `bonoMovilizacion` INT(11) NOT NULL,
  `activo` TINYINT(1) NOT NULL DEFAULT '1',
  `codigoAfp` INT(11) NOT NULL,
  `idCiudad` INT(11) NOT NULL,
  PRIMARY KEY (`rut`),
  INDEX `fk_REM_Personal_REM_Afp_idx` (`codigoAfp` ASC),
  INDEX `fk_REM_Personal_REM_Ciudad1_idx` (`idCiudad` ASC),
  CONSTRAINT `fk_REM_Personal_REM_Afp`
    FOREIGN KEY (`codigoAfp`)
    REFERENCES `erpremuneraciones`.`REM_Afp` (`codigoAfp`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_REM_Personal_REM_Ciudad1`
    FOREIGN KEY (`idCiudad`)
    REFERENCES `erpremuneraciones`.`REM_Ciudad` (`idCiudad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `erpremuneraciones`.`REM_Cargas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `erpremuneraciones`.`REM_Cargas` (
  `idCargas` INT(11) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  `personalRut` INT(11) NOT NULL,
  PRIMARY KEY (`idCargas`),
  INDEX `fk_REM_Cargas_REM_Personal1_idx` (`personalRut` ASC),
  CONSTRAINT `fk_REM_Cargas_REM_Personal1`
    FOREIGN KEY (`personalRut`)
    REFERENCES `erpremuneraciones`.`REM_Personal` (`rut`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `erpremuneraciones`.`REM_Remuneracion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `erpremuneraciones`.`REM_Remuneracion` (
  `idRemuneracion` INT(11) NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `montoBruto` VARCHAR(45) NOT NULL,
  `montoLiquido` VARCHAR(45) NOT NULL,
  `seguroCesantia` INT(11) NOT NULL,
  `descuentoAfp` INT(11) NOT NULL,
  `descuentoRenta` INT(11) NOT NULL,
  `comisiones` INT(11) NOT NULL,
  `PersonalRut` INT(11) NOT NULL,
  PRIMARY KEY (`idRemuneracion`),
  INDEX `fk_REM_Remuneracion_REM_Personal1_idx` (`PersonalRut` ASC),
  CONSTRAINT `fk_REM_Remuneracion_REM_Personal1`
    FOREIGN KEY (`PersonalRut`)
    REFERENCES `erpremuneraciones`.`REM_Personal` (`rut`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 25
DEFAULT CHARACTER SET = latin1;

USE `erpremuneraciones`;

DELIMITER $$
USE `erpremuneraciones`$$
CREATE
DEFINER=`erpremuneraciones`@`%`
TRIGGER `erpremuneraciones`.`REM_Personal_BEFORE_INSERT`
BEFORE INSERT ON `erpremuneraciones`.`REM_Personal`
FOR EACH ROW
BEGIN
	SET NEW.inicioContrato = NOW();
END$$

USE `erpremuneraciones`$$
CREATE
DEFINER=`erpremuneraciones`@`%`
TRIGGER `erpremuneraciones`.`REM_Personal_BEFORE_UPDATE`
BEFORE UPDATE ON `erpremuneraciones`.`REM_Personal`
FOR EACH ROW
BEGIN
	SET NEW.inicioContrato = NOW();
END$$


DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
