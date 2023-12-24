CREATE TABLE `PlantIndicator` (
  `PlantInicatorId` int(11) NOT NULL AUTO_INCREMENT COMMENT '植物监测表',
  `PlantId` int(11) DEFAULT NULL COMMENT '植物的分类Id,从Division表中选取',
  `IndicatorId` int(11) DEFAULT NULL COMMENT '植物的监测指标的Id',
  `low` decimal(10,2) DEFAULT NULL COMMENT '最小值',
  `high` decimal(10,2) DEFAULT NULL COMMENT '最大值',
  PRIMARY KEY (`PlantInicatorId`),
  KEY `PlantId` (`PlantId`),
  KEY `IndicatorId` (`IndicatorId`),
  CONSTRAINT `PlantIndicator_ibfk_1` FOREIGN KEY (`PlantId`) REFERENCES `PlantsBasicInfo` (`plantId`),
  CONSTRAINT `PlantIndicator_ibfk_2` FOREIGN KEY (`IndicatorId`) REFERENCES `Indicator` (`IndicatorId`)
)