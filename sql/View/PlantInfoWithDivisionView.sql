-- 创建视图，根据分类展示植物  
CREATE VIEW PlantInfoWithDivisionView AS  
SELECT pd.FamilyName AS '科名',  
pd.GenusName AS '属名',  
pd.SpeciesName AS '种名',  
pd.AnotherName AS '别名',  
pb.plantId AS '植物编号',  
pb.morphologicalFeatures AS '形态特征',  
pb.cultivationTechniques AS '栽培技术要点',  
pb.applicationValue AS '应用价值'  
FROM PlantsBasicInfo pb  
LEFT JOIN PlantDevision pd ON pb.devisionId = pd.DevisionID;