CREATE TABLE `Indicator` (
  `IndicatorId` int(11) NOT NULL AUTO_INCREMENT COMMENT '观测指标Id',
  `IndicatorName` varchar(255) DEFAULT NULL COMMENT '观测指标的名称',
  `info` varchar(255) DEFAULT NULL COMMENT '观测指标基本说明',
  `isnumeric` tinyint(1) DEFAULT '0' COMMENT '观测指标是否能够进行数字化统计,0不可以,1可以',
  PRIMARY KEY (`IndicatorId`)
)