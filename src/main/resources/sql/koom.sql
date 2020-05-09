/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.5.50 : Database - koom
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`koom` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `koom`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(100) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `account` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '管理员账号',
  `password` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '管理员密码',
  `urlAvatar` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '管理员头像',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `upDate` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(1) NOT NULL COMMENT '状态',
  `ip` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT 'ip地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `admin` */

insert  into `admin`(`id`,`account`,`password`,`urlAvatar`,`createDate`,`upDate`,`status`,`ip`) values 
(1,'admin','123456',NULL,'2020-05-06 17:12:29','2020-05-06 17:12:32',1,NULL),
(2,'chebin','111111',NULL,'2020-05-08 14:06:12','2020-05-08 14:06:15',2,NULL),
(3,'test','123123',NULL,NULL,NULL,1,'59.53.183.187'),
(4,'test1','123456',NULL,NULL,NULL,2,'59.53.183.187'),
(5,'test2','111111',NULL,'2020-05-09 02:47:54',NULL,1,'59.53.183.187'),
(6,'ghy','123456',NULL,'2020-05-09 05:31:37',NULL,1,'59.53.183.187'),
(7,'cb','111111',NULL,'2020-05-09 05:34:01',NULL,2,'59.53.183.187');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
