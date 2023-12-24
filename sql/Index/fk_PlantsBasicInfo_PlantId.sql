-- 在PlantImages表的plantId列上创建外键索引  
ALTER TABLE PlantImages  
ADD INDEX fk_PlantsBasicInfo_PlantId (plantId),  
ADD FOREIGN KEY (plantId) REFERENCES PlantsBasicInfo(plantId);