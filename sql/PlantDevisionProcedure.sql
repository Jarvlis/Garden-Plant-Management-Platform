DELIMITER //

CREATE PROCEDURE InsertPlantDevision(
    IN p_GenusSpeciesID INT,
    IN p_AnotherName VARCHAR(255),
    IN p_DistributionAreaID INT,
    IN p_GrowingEnvironment TEXT,
    IN p_Creator INT
)
BEGIN
    DECLARE isGenusSpeciesValid INT;
    DECLARE isDistributionAreaValid INT;
    DECLARE isCreatorValid INT;
    DECLARE isAnotherNameExists INT;
    -- 检查GenusSpeciesID是否存在于GenusSpecies表中
    SELECT COUNT(*) INTO isGenusSpeciesValid
    FROM plants.GenusSpecies
    WHERE GenusSpeciesID = p_GenusSpeciesID;

-- 检查DistributionAreaID是否存在于DistributionArea表中
    SELECT COUNT(*) INTO isDistributionAreaValid
    FROM plants.DistributionArea
    WHERE DistributionAreaID = p_DistributionAreaID;

-- 检查Creator是否存在于User表中
    SELECT COUNT(*) INTO isCreatorValid
    FROM plants.User
    WHERE userId = p_Creator;

-- 检查AnotherName是否已经存在于PlantDevision表中
    SELECT COUNT(*) INTO isAnotherNameExists
    FROM plants.PlantDevision
    WHERE AnotherName = p_AnotherName;
-- 如果所有外键都有效，则插入数据
IF isGenusSpeciesValid = 1 AND isDistributionAreaValid = 1 AND isCreatorValid = 1 AND isAnotherNameExists = 0 THEN
        INSERT INTO plants.PlantDevision (
            GenusSpeciesID,
            AnotherName,
            DistributionAreaID,
            GrowingEnvironment,
            Creator,
            CreationTime,
            UpdateTime
        ) VALUES (
            p_GenusSpeciesID,
            p_AnotherName,
            p_DistributionAreaID,
            p_GrowingEnvironment,
            p_Creator,
            CURRENT_TIMESTAMP,
            CURRENT_TIMESTAMP
        );
ELSE
    -- 外键约束不满足，可以选择抛出错误或记录日志
    -- 此处简化为输出信息
    SELECT 'Invalid foreign key constraint' AS Message;
END IF;
END //

DELIMITER ;
