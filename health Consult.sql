/*
SQLyog Ultimate v8.82 
MySQL - 5.1.50-community : Database - onappointment
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`onappointment` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `onappointment`;

/*Table structure for table `adddoc` */

DROP TABLE IF EXISTS `adddoc`;

CREATE TABLE `adddoc` (
  `dname` varchar(50) NOT NULL,
  `pass` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `specialization` varchar(20) DEFAULT NULL,
  `ms` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `fee` varchar(20) DEFAULT NULL,
  `time` time DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `adddoc` */

insert  into `adddoc`(`dname`,`pass`,`email`,`specialization`,`ms`,`address`,`fee`,`time`,`date`) values ('DR.Ajay','765','drajay@gmail.com','Dentist','MSMS','AGRA','300','00:53:17','2015-10-12'),('Dr.Akanksha','986','drakan@gmail.com','Neurologist','MD','PUNE','987','01:09:56','2015-10-12'),('Dr.Amit','789','dramit@gmail.com','Dentist','MD','AGRA','800','00:54:16','2015-10-12'),('Dr.Apoorwa','877','drapp@gmail.com','Neurologist','MS','PUNE','900','01:09:06','2015-10-12'),('Dr.Arati','567','drart@gmail.com','Pathologist','MD','PUNE','432','01:19:22','2015-10-12'),('Dr.Atul','567','dratul@gmail.com','Dentist','MS','NOIDA','300','00:55:46','2015-10-12'),('Dr.Garima','754','drgarima@gmail.com','Neurologist','MD','AGRA','789','01:05:44','2015-10-12'),('Dr.Harshita','765','drhar@gmail.com','Neurologist','MD','NOIDA','890','01:08:20','2015-10-12'),('Dr.JaiShree','4587','drjai@gmail.com','Pathologist','MS','NOIDA','3453','01:16:00','2015-10-12'),('DR.KAJAL','987','drkajal@gmail.com','Dentist','MD','NOIDA','500','00:57:45','2015-10-12'),('Dr.kamal','456','drkamal@gmail.com','Dentist','MD','PUNE','400','00:59:39','2015-10-12'),('Dr.KiranMishra','3434','drkiran@gmail.com','Dentist','MD','DELHI','400','00:52:14','2015-10-12'),('Dr.Kunal','567','drkun@gmail.com','Pathologist','MD','DELHI','456','01:13:32','2015-10-12'),('Dr.NehaSinghania','3456','drneha@gmail.com','Dentist','MS','LUCKNOW','200','00:50:22','2015-10-12'),('Dr.Niharika','890','drnih@gmail.com','Neurologist','MS','NOIDA','654','01:07:21','2015-10-12'),('Dr.Nitu','3425','drnitu@gmail.com','Pathologist','MD','AGRA','897','01:15:13','2015-10-12'),('Dr.PankajSingh','dr123','drpan@gmail.com','Dentist','MD','LUCKNOW','200','00:18:27','2015-10-12'),('Dr.Parth','567','drparth@gmail.com','Neurologist','MS','LUCKNOW','498','01:01:25','2015-10-12'),('DR.Poonam','5678','drpoonam@gmail.com','Neurologist','MD','LUCKNOW','768','01:02:30','2015-10-12'),('Dr.PraveenAgarwal','1234','drprav@gmail.com','Dentist','MS','DELHI','1000','00:45:50','2015-10-12'),('Dr.Prince','9443','drprin@gmail.com','Pathologist','MD','LUCKNOW','987','01:11:50','2015-10-12'),('Dr.Priyanka','5678','drpriyanka@gmail.com','Neurologist','MD','DELHI','789','01:03:59','2015-10-12'),('Dr.Pramod','453','drprm@gmail.com','Pathologist',NULL,'NOIDA','89','01:16:59','2015-10-12'),('Dr.Salabh','5647','drsal@gmail.com','Pathologist','MS','PUNE','100','01:18:27','2015-10-12'),('Dr.Suneeti','4654','drsuneeti@gmail.com','Neurologist','MS','DELHI','765','01:03:14','2015-10-12'),('Dr.Supriya','456','drsup@gmail.com','Pathologist','MS','DELHI','789','01:12:50','2015-10-12'),('Dr.Trapti','654','drtrapti@gmail.com','Neurologist','MS','AGRA','764','01:05:01','2015-10-12'),('Dr.Vipin','789','drvipin@gmail.com','Dentist','MS','PUNE','600','00:58:33','2015-10-12'),('Dr.Vivek','764','drviv@gmail.com','Pathologist','MS','LUCKNOW','900','01:11:03','2015-10-12'),('Dr.Rizwan','4ye5','rizvi@gmail.com','Pathologist','MS','AGRA','567','01:14:36','2015-10-12');

/*Table structure for table `available` */

DROP TABLE IF EXISTS `available`;

CREATE TABLE `available` (
  `user` varchar(50) NOT NULL,
  `datee` date DEFAULT NULL,
  `stone` varchar(30) DEFAULT NULL,
  `dateee` date DEFAULT NULL,
  `sttwo` varchar(30) DEFAULT NULL,
  `dateeee` date DEFAULT NULL,
  `stthree` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `available` */

insert  into `available`(`user`,`datee`,`stone`,`dateee`,`sttwo`,`dateeee`,`stthree`) values ('drajay@gmail.com','2015-10-14','av','2015-10-18','av','2015-10-20','av'),('drakan@gmail.com','2015-12-19','av','2015-12-23','av','2015-12-29','av'),('dramit@gmail.com','2015-10-19',NULL,'2015-10-21',NULL,'2015-10-23',NULL),('drneha@gmail.com','2015-10-11','av','2015-10-14','av','2015-10-18','av'),('drnih@gmail.com','2015-10-17','av','2015-10-18','av','2015-10-19','av'),('drpan@gmail.com','2015-10-12','av','2015-10-13','av','2015-10-14','av');

/*Table structure for table `login_mstr` */

DROP TABLE IF EXISTS `login_mstr`;

CREATE TABLE `login_mstr` (
  `type` varchar(20) DEFAULT NULL,
  `user` varchar(20) NOT NULL,
  `pass` varchar(20) DEFAULT NULL,
  `status` int(1) DEFAULT '1',
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login_mstr` */

insert  into `login_mstr`(`type`,`user`,`pass`,`status`) values ('Doctor','','',1),('Patient','aa@gmail.com','12345',1),('Admin','abc','1234',1),('Doctor','drajay@gmail.com','765',1),('Doctor','drakan@gmail.com','987',1),('Doctor','dramit@gmail.com','789',1),('Doctor','drapp@gmail.com','877',1),('Doctor','drart@gmail.com','567',1),('Doctor','dratul@gmail.com','567',1),('Doctor','drgarima@gmail.com','754',1),('Doctor','drhar@gmail.com','765',1),('Doctor','drjai@gmail.com','4587',1),('Doctor','drkajal@gmail.com','987',1),('Doctor','drkamal@gmail.com','456',1),('Doctor','drkiran@gmail.com','3434',1),('Doctor','drkun@gmail.com','567',1),('Doctor','drneha@gmail.com','3456',1),('Doctor','drnih@gmail.com','890',1),('Doctor','drnitu@gmail.com','3425',1),('Doctor','drpan@gmail.com','123',1),('Doctor','drparth@gmail.com','567',1),('Doctor','drpoonam@gmail.com','5678',1),('Doctor','drprav@gmail.com','1234',1),('Doctor','drprin@gmail.com','9443',1),('Doctor','drpriyanka@gmail.com','5678',1),('Doctor','drprm@gmail.com','453',1),('Doctor','drsal@gmail.com','5647',1),('Doctor','drshiv@gmail.com','1234567',1),('Doctor','drsuneeti@gmail.com','4654',1),('Doctor','drsup@gmail.com','456',1),('Doctor','drtrapti@gmail.com','654',1),('Doctor','drvipin@gmail.com','789',1),('Doctor','drviv@gmail.com','764',1),('Patient','lucky@gmail.com','nehamishra',1),('Patient','pp@gmail.com','12345',1),('Patient','pr@gmail.com','54321',1),('Patient','prrr@gmail.com','iloveyou',1),('Doctor','rizvi@gmail.com','4ye5',1);

/*Table structure for table `patientlist` */

DROP TABLE IF EXISTS `patientlist`;

CREATE TABLE `patientlist` (
  `dname` varchar(20) DEFAULT NULL,
  `demail` varchar(20) DEFAULT NULL,
  `specialization` varchar(20) DEFAULT NULL,
  `pname` varchar(20) DEFAULT NULL,
  `pemail` varchar(20) DEFAULT NULL,
  `paddress` varchar(50) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  `fee` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `patientlist` */

insert  into `patientlist`(`dname`,`demail`,`specialization`,`pname`,`pemail`,`paddress`,`date`,`fee`) values ('Dr.Apoorwa','drapp@gmail.com','Neurologist','trapti','aa@gmail.com','lko',NULL,NULL),('Dr.Atul','dratul@gmail.com','Dentist','pinku','pr@gmail.com','Lko','2015-11-06',NULL),('Dr.NehaSinghania','drneha@gmail.com','Dentist','trapti','aa@gmail.com','lko','2015-11-07',NULL),('Dr.NehaSinghania','drneha@gmail.com','Dentist','neha','lucky@gmail.com','jdj','2015-11-06',NULL),('Dr.Vipin','drvipin@gmail.com','Dentist','pinku','pr@gmail.com','Lko','2015-11-06',NULL),('DR.Ajay','drajay@gmail.com','Dentist','pinku','pr@gmail.com','Lko','2015-10-18','Dentist'),(NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `pregis` */

DROP TABLE IF EXISTS `pregis`;

CREATE TABLE `pregis` (
  `pname` varchar(50) DEFAULT NULL,
  `pfname` varchar(50) DEFAULT NULL,
  `pemail` varchar(50) NOT NULL,
  `ppass` varchar(50) DEFAULT NULL,
  `pmobile` decimal(10,0) DEFAULT NULL,
  `padd` varchar(50) DEFAULT NULL,
  `pcity` varchar(50) DEFAULT NULL,
  `ppin` varchar(10) DEFAULT NULL,
  `pstate` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pemail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pregis` */

insert  into `pregis`(`pname`,`pfname`,`pemail`,`ppass`,`pmobile`,`padd`,`pcity`,`ppin`,`pstate`) values ('trapti ','r.p.agarwal','aa@gmail.com','12345','676743785','lko','LUCKNOW','5657','UP'),('neha mishra','c s mishra','lucky@gmail.com','nehamishra','1234567898','jdj ki gali ki ld','LUCKNOW','226021','UP'),('neha mishra','c s mishra','luckyneha242gmail.com','nehamishra','1234567898','jdj ki gali ki ld','LUCKNOW','226021','UP'),('Priyanka','aaa','pp@gmail.com','12345','1020304050','alliganj','LUCKNOW','2003','UP'),('pinku','p.s.mishra','pr@gmail.com','12345','87587465','Lko','LUCKNOW','754','MP'),('neha mishra','c s mishra','prrr@gmail.com','iloveyou','1236547895','sdddsfdijvid','LUCKNOW','222133','UP');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
