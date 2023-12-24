
CREATE VIEW plants.UnitPlantDevisionView AS
SELECT
    pd.DevisionID,
    fg.FamilyName,
    gs.GenusName,
    gs.SpeciesName,
    pd.AnotherName,
    da.Province,
    da.City,
    da.Country,
    pd.CreationTime,
    pd.UpdateTime,
    pd.GrowingEnvironment,
    u.userName
FROM
    plants.PlantDevision pd
        LEFT JOIN
    plants.DistributionArea da ON pd.DistributionAreaID = da.DistributionAreaID
        LEFT JOIN
    plants.GenusSpecies gs ON pd.GenusSpeciesID = gs.GenusSpeciesID
        LEFT JOIN
    plants.FamilyGenus fg ON gs.GenusName = fg.GenusName
        LEFT JOIN
    plants.User u ON pd.Creator = u.userId;
