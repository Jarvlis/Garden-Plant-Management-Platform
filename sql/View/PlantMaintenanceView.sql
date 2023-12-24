CREATE VIEW PlantMaintenanceView AS
SELECT
    pm.MaintenanceID,
    pm.MissionName,
    pd.AnotherName,
    pm.ExecutionTime,
    pm.ExecutionPlace,
    u.userName,
    pm.JobDescribtion
FROM
    PlantMaintenance pm
LEFT JOIN
    User u ON pm.userId = u.userId
LEFT JOIN
    PlantsBasicInfo pbi ON pm.plantId = pbi.plantId
LEFT JOIN
    PlantDevision pd ON pbi.devisionId = pd.devisionId;
