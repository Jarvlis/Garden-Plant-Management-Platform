-- 创建包括配图的基本信息视图  
CREATE VIEW PlantInfoWithImagesView AS  
SELECT pb.plantId AS '植物编号',   
pb.morphologicalFeatures AS '形态特征',  
pb.cultivationTechniques AS '栽培技术要点',  
pb.applicationValue AS '应用价值',  
pi.imageId AS '配图ID',  
pi.imageData AS '配图',  
pi.imageLocation AS '拍摄地',  
pi.imageDescribe AS '配图描述',  
pi.photographer AS '拍摄者'  
FROM PlantsBasicInfo pb  
LEFT JOIN PlantImages pi ON pb.plantId = pi.plantId  
ORDER BY pb.plantId;