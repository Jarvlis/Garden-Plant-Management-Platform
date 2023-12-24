DELIMITER //
CREATE TRIGGER PlantsBasicInfo_AfterDelete
AFTER DELETE ON PlantsBasicInfo
FOR EACH ROW
BEGIN
  -- 在PlantsBasicInfo表删除记录后，删除相关的PlantImages和PestControlStrategies记录
  DELETE FROM PlantImages WHERE plantId = OLD.plantId;
  DELETE FROM PestControlStrategies WHERE plantId = OLD.plantId;
END //
DELIMITER ;