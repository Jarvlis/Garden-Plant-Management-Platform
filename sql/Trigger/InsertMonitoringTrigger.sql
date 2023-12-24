DELIMITER $$
CREATE
    /*!50017 DEFINER = 'developer'@'%' */
    TRIGGER `InsertMonitoringTrigger` AFTER INSERT ON `GardenPlantMonitoringManagement` 
    FOR EACH ROW 
BEGIN
    DECLARE numericValue INT;
    DECLARE lowValue DECIMAL(10, 2);
    DECLARE highValue DECIMAL(10, 2);

    -- 获取插入的监测指标的numeric值、low值和high值
    SELECT Indicator.isnumeric, PlantIndicator.low, PlantIndicator.high
    INTO numericValue, lowValue, highValue
    FROM Indicator
    JOIN PlantIndicator ON Indicator.IndicatorId = PlantIndicator.IndicatorId
    WHERE Indicator.IndicatorId = NEW.MonitoringIndicatorId;

    -- 检查numeric值是否为1且其值不在low和high之间
    IF numericValue = 1 AND (NEW.NumericResult < lowValue OR NEW.NumericResult > highValue) THEN
        -- 将异常记录插入到异常表中
        INSERT INTO AbnormalMonitoringRecords (MonitoringId, MonitoringTime, MonitoringStaffId, MonitoringLocation, MonitoringPlantId, MonitoringIndicatorId, MonitoringEquipmentId, NumericResult, CommonResult, CreatorId, CreateTime, UpdateTime)
        VALUES (NEW.MonitoringId, NEW.MonitoringTime, NEW.MonitoringStaffId, NEW.MonitoringLocation, NEW.MonitoringPlantId, NEW.MonitoringIndicatorId, NEW.MonitoringEquipmentId, NEW.NumericResult, NEW.CommonResult, NEW.CreatorId, NEW.CreateTime, NEW.UpdateTime);
    END IF;
END;
$$
DELIMITER ;