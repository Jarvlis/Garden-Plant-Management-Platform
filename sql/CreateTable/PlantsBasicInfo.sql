-- 园林植物基本信息表
CREATE TABLE PlantsBasicInfo (
  plantId INT AUTO_INCREMENT PRIMARY KEY,
  diseaseName VARCHAR(255),
  devisionId INT,
  morphologicalFeatures TEXT,
  cultivationTechniques TEXT,
  applicationValue TEXT,
  FOREIGN KEY (devisionId) REFERENCES PlantDevision(DevisionID)
)COMMENT='基本信息表';