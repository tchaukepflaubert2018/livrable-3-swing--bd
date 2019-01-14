/*
SQLyog Ultimate v11.5 (64 bit)
MySQL - 5.6.25 : Database - bdgestion
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bdgestion` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bdgestion`;

/*Table structure for table `patient` */

DROP TABLE IF EXISTS `patient`;

CREATE TABLE `patient` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `quartier` varchar(20) DEFAULT NULL,
  `fonction` varchar(20) DEFAULT NULL,
  `age` int(6) DEFAULT NULL,
  `sexe` varchar(20) DEFAULT NULL,
  `matricule` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `patient` */

insert  into `patient`(`id`,`nom`,`prenom`,`quartier`,`fonction`,`age`,`sexe`,`matricule`) values (1,'DJOMO','MARTINE','CRADAT','ETUDIANTE',22,'F',1058),(2,'tchaukep','flaubert','cradat','etudiant',30,'masculin',102458),(3,'djomo','martine','ngoa','etudiante',22,'feminin',14789),(4,'test','second','bastos','el',21,'m',105);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
