CREATE VIEW PlantDevisionView AS
SELECT
    pd.DevisionID,
    pd.FamilyName,
    pd.GenusName,
    pd.SpeciesName,
    pd.AnotherName,
    da.Province,
    da.City,
    da.Country,
    u.userName AS Creator,
    pd.CreationTime,
    pd.UpdateTime,
    pd.GrowingEnvironment
FROM
    PlantDevision pd
        LEFT JOIN
    DistributionArea da ON pd.DistributionAreaID = da.DistributionAreaID
        LEFT JOIN
    User u ON pd.Creator = u.userId;

