CREATE VIEW PlantMaintenanceView AS
SELECT
    pm.MaintenanceID AS 养护编号,
    pm.MissionName AS 任务名称,
    pd.AnotherName AS 植物名称,
    pm.ExecutionTime AS 执行时间,
    pm.ExecutionPlace AS 执行地点,
    u.userName AS 执行人员,
    pm.JobDescribtion AS 任务描述
FROM
    PlantMaintenance pm
LEFT JOIN
    User u ON pm.userId = u.userId
LEFT JOIN
    PlantsBasicInfo pbi ON pm.plantId = pbi.plantId
LEFT JOIN
    PlantDevision pd ON pbi.devisionId = pd.devisionId;
