CREATE TABLE PlantMaintenanceTriggerLog (
                                            id INT AUTO_INCREMENT PRIMARY KEY,
                                            message TEXT,
                                            created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER $$

CREATE TRIGGER PlantMaintenance_After_Insert
    AFTER INSERT ON PlantMaintenance
    FOR EACH ROW
BEGIN
    INSERT INTO PlantMaintenanceTriggerLog (message) VALUES ('PlantMaintenance table has been modified (INSERT).');
END$$

CREATE TRIGGER PlantMaintenance_After_Delete
    AFTER DELETE ON PlantMaintenance
    FOR EACH ROW
BEGIN
    INSERT INTO PlantMaintenanceTriggerLog (message) VALUES ('PlantMaintenance table has been modified (DELETE).');
END$$

CREATE TRIGGER PlantMaintenance_After_Update
    AFTER UPDATE ON PlantMaintenance
    FOR EACH ROW
BEGIN
    INSERT INTO PlantMaintenanceTriggerLog (message) VALUES ('PlantMaintenance table has been modified (UPDATE).');
END$$

DELIMITER ;