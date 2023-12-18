-- # INSERT INTO PlantDevision (FamilyName, GenusName, SpeciesName, AnotherName, DistributionAreaID, GrowingEnvironment, Creator, CreationTime, UpdateTime)
-- # VALUES
-- #     ('白花丹科', '补血草属', '二色补血草', '蝇子草', RAND() % 236 + 1, '', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
-- #     ('白花丹科', '补血草属', '珊瑚补血草', '无叶补血草', RAND() % 236 + 1, '', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
-- #     ('报春花科', '琉璃繁缕属', '琉璃繁缕', '海绿', RAND() % 236 + 1, '', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
--
--
-- # INSERT INTO PlantDevision (FamilyName, GenusName, SpeciesName, AnotherName, DistributionAreaID, GrowingEnvironment, Creator, CreationTime, UpdateTime)
-- # VALUES
-- #     ('报春花科', '珍珠菜属', '长蕊珍珠菜', '白豆瓣菜', RAND() % 236 + 1, '', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
-- #     ('唇形科', '益母草属', '錾菜', '白花益母草', RAND() % 236 + 1, '', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
-- #     ('大风子科', '山桂花属', '山桂花', '木本远志', RAND() % 236 + 1, '', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
-- #     ('大戟科', '大戟属', '狼毒', '续毒', RAND() % 236 + 1, '', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
-- #     ('大戟科', '大戟属', '大戟', '京大戟', RAND() % 236 + 1, '', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
--
--
-- INSERT INTO PlantMaintenance (MissionName, ExecutionTime, ExecutionPlace, userId, JobDescribtion, plantId)
-- VALUES
--     ('维护任务1', CURRENT_TIMESTAMP, '工厂A', 3, '执行维护任务1的描述', 1),
--     ('维护任务2', CURRENT_TIMESTAMP, '工厂B', 3, '执行维护任务2的描述', 2),
--     ('维护任务3', CURRENT_TIMESTAMP, '工厂C', 3, '执行维护任务3的描述', 3),
--     ('维护任务4', CURRENT_TIMESTAMP, '工厂D', 3, '执行维护任务4的描述', 4),
--     ('维护任务5', CURRENT_TIMESTAMP, '工厂E', 3, '执行维护任务5的描述', 5),
--     ('维护任务6', CURRENT_TIMESTAMP, '工厂F', 3, '执行维护任务6的描述', 6),
--     ('维护任务7', CURRENT_TIMESTAMP, '工厂G', 3, '执行维护任务7的描述', 7),
--     ('维护任务8', CURRENT_TIMESTAMP, '工厂H', 3, '执行维护任务8的描述', 8),
--     ('维护任务9', CURRENT_TIMESTAMP, '工厂A', 3, '执行维护任务9的描述', 1),
--     ('维护任务10', CURRENT_TIMESTAMP, '工厂B', 3, '执行维护任务10的描述', 2);




# CREATE TABLE PlantDevisionTriggerLog (
#                             id INT AUTO_INCREMENT PRIMARY KEY,
#                             message TEXT,
#                             created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
# );
#
# DELIMITER $$
#
# CREATE TRIGGER PlantDevision_After_Insert
#     AFTER INSERT ON PlantDevision
#     FOR EACH ROW
# BEGIN
#     INSERT INTO PlantDevisionTriggerLog (message) VALUES ('PlantDevision table has been modified (INSERT).');
# END$$
#
# CREATE TRIGGER PlantDevision_After_Delete
#     AFTER DELETE ON PlantDevision
#     FOR EACH ROW
# BEGIN
#     INSERT INTO PlantDevisionTriggerLog (message) VALUES ('PlantDevision table has been modified (DELETE).');
# END$$
#
# CREATE TRIGGER PlantDevision_After_Update
#     AFTER UPDATE ON PlantDevision
#     FOR EACH ROW
# BEGIN
#     INSERT INTO PlantDevisionTriggerLog (message) VALUES ('PlantDevision table has been modified (UPDATE).');
# END$$
#
# DELIMITER ;
#
# CREATE TABLE PlantMaintenanceTriggerLog (
#                             id INT AUTO_INCREMENT PRIMARY KEY,
#                             message TEXT,
#                             created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
# );
#
# DELIMITER $$
#
# CREATE TRIGGER PlantMaintenance_After_Insert
#     AFTER INSERT ON PlantMaintenance
#     FOR EACH ROW
# BEGIN
#     INSERT INTO PlantMaintenanceTriggerLog (message) VALUES ('PlantMaintenance table has been modified (INSERT).');
# END$$
#
# CREATE TRIGGER PlantMaintenance_After_Delete
#     AFTER DELETE ON PlantMaintenance
#     FOR EACH ROW
# BEGIN
#     INSERT INTO PlantMaintenanceTriggerLog (message) VALUES ('PlantMaintenance table has been modified (DELETE).');
# END$$
#
# CREATE TRIGGER PlantMaintenance_After_Update
#     AFTER UPDATE ON PlantMaintenance
#     FOR EACH ROW
# BEGIN
#     INSERT INTO PlantMaintenanceTriggerLog (message) VALUES ('PlantMaintenance table has been modified (UPDATE).');
# END$$
#
# DELIMITER ;

alter table PlantDevision
    add Family_GenusID Integer null comment '科属ID' after DevisionID;

alter table PlantDevision
    add Genus_SpeciesID Integer null comment '属种ID' after Family_GenusID;

