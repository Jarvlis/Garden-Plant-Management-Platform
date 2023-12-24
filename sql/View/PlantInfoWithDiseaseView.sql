-- 创建只包含有疾病的植物的视图  
CREATE VIEW PlantInfoWithDiseaseView AS  
SELECT pb.plantId AS '植物编号',  
pb.diseaseName AS '病名',  
pb.morphologicalFeatures AS '形态特征',  
pb.cultivationTechniques AS '栽培技术要点',  
pb.applicationValue AS '应用价值',  
pm.PestName AS '病虫害名称',  
pm.PesticideName AS '药剂名称',  
pm.PesticideDosage AS '药剂用例',  
pm.ControlMethod AS '防治方法'  
FROM PlantsBasicInfo pb  
LEFT JOIN PestControlStrategies pc ON pb.plantId = pc.plantId  
LEFT JOIN GardenPlantPestControlManagement pm ON pc.preventionId = pm.PreventionId  
WHERE pb.diseaseName IS NOT NULL;