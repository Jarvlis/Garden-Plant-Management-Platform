-- 植物配图信息表
CREATE TABLE PlantImages (
    imageId INT AUTO_INCREMENT PRIMARY KEY,
    plantId INT,
    imageData BLOB,
    imageLocation VARCHAR(255),
    imageDescribe TEXT,
    photographer VARCHAR(255),
    FOREIGN KEY (plantId) REFERENCES PlantsBasicInfo(plantId)
)COMMENT='配图信息表';