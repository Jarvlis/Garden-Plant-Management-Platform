-- 病虫害防治策略表
CREATE TABLE PestControlStrategies (
    strategieId INT AUTO_INCREMENT PRIMARY KEY,
    plantId INT,
    preventionId INT,
    FOREIGN KEY (plantId) REFERENCES PlantsBasicInfo(plantId),
    FOREIGN KEY (preventionId) REFERENCES GardenPlantPestControlManagement(PreventionId)
)COMMENT='病虫害防治策略表';