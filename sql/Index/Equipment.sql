CREATE TABLE `Equipment` (
  `EquipmentId` int(11) NOT NULL AUTO_INCREMENT COMMENT '设备的Id号',
  `EquipmentName` varchar(255) DEFAULT NULL COMMENT '设备的名称',
  `CreateTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `UpdateTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`EquipmentId`)
)