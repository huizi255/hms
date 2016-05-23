/*
Navicat MySQL Data Transfer

Source Server         : hui
Source Server Version : 50140
Source Host           : 127.0.0.1:3306
Source Database       : vedio

Target Server Type    : MYSQL
Target Server Version : 50140
File Encoding         : 65001

Date: 2016-05-22 11:59:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `content` text,
  `publisureDate` datetime DEFAULT NULL,
  `clicksTimes` int(11) DEFAULT NULL,
  `c_id` bigint(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `t_article_ibfk_1` (`c_id`),
  CONSTRAINT `t_article_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `t_category` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_article
-- ----------------------------
INSERT INTO `t_article` VALUES ('1', '盛逗逼事件', '辉子', '盛逗逼又在逗逼了，这是没吃药吧，以确定啦', '2016-05-15 00:00:00', '2', '10');
INSERT INTO `t_article` VALUES ('2', '捷普招人事件', '小辉子', '这经理成天来洗脑，这不太好吧', '2016-05-20 00:00:00', '10', '10');

-- ----------------------------
-- Table structure for t_category
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_category
-- ----------------------------
INSERT INTO `t_category` VALUES ('1', '电视剧', '1001');
INSERT INTO `t_category` VALUES ('2', '电影', '1002');
INSERT INTO `t_category` VALUES ('3', '动漫', '1003');
INSERT INTO `t_category` VALUES ('4', '搞笑', '1004');
INSERT INTO `t_category` VALUES ('5', '综艺', '1005');
INSERT INTO `t_category` VALUES ('6', '体育', '1006');
INSERT INTO `t_category` VALUES ('7', 'IT', '1007');
INSERT INTO `t_category` VALUES ('9', 'VIP观看', '1009');
INSERT INTO `t_category` VALUES ('10', '文章', '1010');
INSERT INTO `t_category` VALUES ('11', '纪录片', '1008');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------

-- ----------------------------
-- Table structure for t_vedio
-- ----------------------------
DROP TABLE IF EXISTS `t_vedio`;
CREATE TABLE `t_vedio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `memory` bigint(20) DEFAULT NULL,
  `publisureDate` datetime DEFAULT NULL,
  `c_id` bigint(11) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`),
  KEY `t_vedio_ibfk_1` (`c_id`),
  CONSTRAINT `t_vedio_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `t_category` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_vedio
-- ----------------------------
INSERT INTO `t_vedio` VALUES ('3', '越狱', '890', '2016-05-15 00:00:00', '1', 'mp4', '这是一部讲从监狱逃跑的电视剧，真的很好看啊');
INSERT INTO `t_vedio` VALUES ('4', '天天向上', '164', '2016-05-15 00:00:00', '5', 'rmvb', '星期五播出的搞笑类的综艺节目');
INSERT INTO `t_vedio` VALUES ('6', '火影忍者', '201', '2016-05-21 00:00:00', '3', 'vmv', '讲一个人怎样变的很牛逼，富含重要的人生哲理啊');
INSERT INTO `t_vedio` VALUES ('7', '欢乐颂', '410', '2016-05-21 00:00:00', '1', 'avi', '讲五个女孩的城市艰辛生活之路');
INSERT INTO `t_vedio` VALUES ('8', '港囧', '456', '2016-05-21 00:00:00', '2', 'avi', '这是一部搞笑的由徐光头导演的电影，蛮好看的');
INSERT INTO `t_vedio` VALUES ('9', '寻龙诀', '950', '2016-05-21 00:00:00', '2', 'avi', '讲的是盗墓的电影，有anerbaby,杨坤主演');
