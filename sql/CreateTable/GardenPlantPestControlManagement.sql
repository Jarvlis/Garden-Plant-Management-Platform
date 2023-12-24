CREATE TABLE `GardenPlantPestControlManagement` (
  `PreventionId` int(11) NOT NULL AUTO_INCREMENT COMMENT '预防的Id主键',
  `PestName` varchar(255) DEFAULT NULL COMMENT '害虫名称',
  `ControlMethod` text COMMENT '预防的方法',
  `PesticideName` varchar(255) DEFAULT NULL COMMENT '药剂名称',
  `PesticideDosage` varchar(255) DEFAULT NULL COMMENT '药剂用量',
  `ValidityPeriod` varchar(255) DEFAULT NULL COMMENT '作用期限',
  `Creator` varchar(255) DEFAULT NULL COMMENT '创建人',
  `CreationTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `UpdateTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`PreventionId`),
  KEY `PreventionId` (`PreventionId`)
)