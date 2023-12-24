CREATE TABLE `GardenPlantMonitoringManagement` (
  `MonitoringId` int(11) NOT NULL AUTO_INCREMENT COMMENT '监测记录ID',
  `MonitoringTime` timestamp NULL DEFAULT NULL COMMENT '检查时间',
  `MonitoringStaffId` int(11) NOT NULL COMMENT '检察人员的Id',
  `MonitoringLocation` varchar(255) DEFAULT NULL COMMENT '监测的地点',
  `MonitoringPlantId` int(11) DEFAULT NULL COMMENT '检测植物的编号Id',
  `MonitoringIndicatorId` int(11) DEFAULT NULL COMMENT '监测的指标',
  `MonitoringEquipmentId` int(11) DEFAULT NULL COMMENT '用于监测的设备',
  `NumericResult` decimal(10,2) DEFAULT NULL COMMENT '数字化的结果',
  `CommonResult` varchar(255) DEFAULT NULL COMMENT '普通结果',
  `CreatorId` int(11) DEFAULT NULL COMMENT '创建该条记录的人员的Id',
  `CreateTime` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `UpdateTime` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`MonitoringId`)
)