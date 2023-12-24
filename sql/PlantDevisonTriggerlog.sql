CREATE TABLE PlantDevisionTriggerLog (
                                         id INT AUTO_INCREMENT PRIMARY KEY,
                                         message TEXT,
                                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER $$

CREATE TRIGGER PlantDevision_After_Insert
    AFTER INSERT ON PlantDevision
    FOR EACH ROW
BEGIN
    INSERT INTO PlantDevisionTriggerLog (message) VALUES ('PlantDevision table has been modified (INSERT).');
END$$

CREATE TRIGGER PlantDevision_After_Delete
    AFTER DELETE ON PlantDevision
    FOR EACH ROW
BEGIN
    INSERT INTO PlantDevisionTriggerLog (message) VALUES ('PlantDevision table has been modified (DELETE).');
END$$

CREATE TRIGGER PlantDevision_After_Update
    AFTER UPDATE ON PlantDevision
    FOR EACH ROW
BEGIN
    INSERT INTO PlantDevisionTriggerLog (message) VALUES ('PlantDevision table has been modified (UPDATE).');
END$$

DELIMITER ;

-- 创建专门用于放日志的表
CREATE TABLE IF NOT EXISTS `PlantDevision_Log` (
                                                   `LogID` INT(11) NOT NULL AUTO_INCREMENT,
                                                   `DevisionID` INT(11) DEFAULT NULL,
                                                   `LogMessage` VARCHAR(255) DEFAULT NULL,
                                                   `LogTimestamp` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                                   PRIMARY KEY (`LogID`)
);

-- 创建触发器
DELIMITER //
CREATE TRIGGER `PlantDevision_AfterInsert` AFTER INSERT ON `PlantDevision`
    FOR EACH ROW
BEGIN
    IF NEW.DistributionAreaID IS NULL OR NEW.Creator IS NULL THEN
        -- 插入异常日志
        INSERT INTO `PlantDevision_Log` (`DevisionID`, `LogMessage`)
        VALUES (NEW.DevisionID, 'Data exception: DistributionAreaID or Creator is NULL');
    END IF;
END;
//
DELIMITER ;








