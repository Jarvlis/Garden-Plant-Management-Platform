CREATE TABLE `EquipmentIndicator` (
  `EquipmentIndicatorId` int(11) NOT NULL AUTO_INCREMENT,
  `EquipmentId` int(11) NOT NULL COMMENT '检测设备Id',
  `IndicatorId` int(11) NOT NULL COMMENT '检测指标Id',
  PRIMARY KEY (`EquipmentIndicatorId`),
  KEY `EquipmentId` (`EquipmentId`),
  KEY `IndicatorId` (`IndicatorId`),
  CONSTRAINT `EquipmentIndicator_ibfk_2` FOREIGN KEY (`IndicatorId`) REFERENCES `Indicator` (`IndicatorId`)
)