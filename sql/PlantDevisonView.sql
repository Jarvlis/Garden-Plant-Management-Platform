# CREATE VIEW PlantDevisionView AS
# SELECT
#     pd.DevisionID,
#     pd.FamilyName,
#     pd.GenusName,
#     pd.SpeciesName,
#     pd.AnotherName,
#     da.Province,
#     da.City,
#     da.Country,
#     u.userName AS Creator,
#     pd.CreationTime,
#     pd.UpdateTime,
#     pd.GrowingEnvironment
# FROM
#     PlantDevision pd
#         LEFT JOIN
#     DistributionArea da ON pd.DistributionAreaID = da.DistributionAreaID
#         LEFT JOIN
#     User u ON pd.Creator = u.userId;

# create table plants.PlantDevision
# (
#     DevisionID         int auto_increment
#         primary key,
#     GenusSpeciesID     int          null comment '属种ID',
#     AnotherName        varchar(255) null,
#     DistributionAreaID int          null,
#     GrowingEnvironment text         null,
#     Creator            int          null,
#     CreationTime       timestamp    null,
#     UpdateTime         timestamp    null,
#     constraint PlantDevision___fk
#         foreign key (GenusSpeciesID) references plants.GenusSpecies (GenusSpeciesID),
#     constraint PlantDevision_ibfk_1
#         foreign key (DistributionAreaID) references plants.DistributionArea (DistributionAreaID),
#     constraint PlantDevision_ibfk_2
#         foreign key (Creator) references plants.User (userId)
# );
#
# create table plants.GenusSpecies
# (
#     GenusSpeciesID int auto_increment
#         primary key,
#     GenusName      varchar(255) not null,
#     SpeciesName    varchar(255) not null,
#     constraint GenusName
#         unique (GenusName, SpeciesName),
#     constraint GenusSpecies_ibfk_1
#         foreign key (GenusName) references plants.FamilyGenus (GenusName)
# );
#
#
# create table plants.FamilyGenus
# (
#     FamilyGenusID int auto_increment
#         primary key,
#     FamilyName    varchar(255) not null,
#     GenusName     varchar(255) not null,
#     constraint FamilyName
#         unique (FamilyName, GenusName)
# );
#
# create table plants.DistributionArea
# (
#     DistributionAreaID int auto_increment
#         primary key,
#     Province           varchar(255) null,
#     City               varchar(255) null,
#     Country            varchar(255) null
# );
#
# create table plants.User
# (
#     userId       int auto_increment comment '用户ID'
#         primary key,
#     userName     varchar(80)                         not null comment '用户名',
#     userPassword varchar(50)                         not null comment '密码',
#     createdAt    timestamp default CURRENT_TIMESTAMP null comment '创建时间',
#     updatedAt    timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间',
#     phoneNumber  varchar(40)                         not null comment '手机号码',
#     userStatus   tinyint   default 0                 not null comment '用户状态',
#     constraint userName
#         unique (userName)
# )


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
