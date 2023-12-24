create table plants.DistributionArea
(
    DistributionAreaID int auto_increment
        primary key,
    Province           varchar(255) null,
    City               varchar(255) null,
    Country            varchar(255) null
)
    comment '分类管理-分布区域';

create table plants.FamilyGenus
(
    FamilyGenusID int auto_increment
        primary key,
    FamilyName    varchar(255) not null,
    GenusName     varchar(255) not null,
    constraint FamilyName
        unique (FamilyName, GenusName)
)
    comment '科属表';


create table plants.GenusSpecies
(
    GenusSpeciesID int auto_increment
        primary key,
    GenusName      varchar(255) not null,
    SpeciesName    varchar(255) not null,
    constraint GenusName
        unique (GenusName, SpeciesName),
    constraint GenusSpecies_ibfk_1
        foreign key (GenusName) references plants.FamilyGenus (GenusName)
)
    comment '属种表';


create table plants.PlantDevision
(
    DevisionID         int auto_increment
        primary key,
    GenusSpeciesID     int          null comment '属种ID',
    AnotherName        varchar(255) null,
    DistributionAreaID int          null,
    GrowingEnvironment text         null,
    Creator            int          null,
    CreationTime       timestamp    null,
    UpdateTime         timestamp    null,
    constraint OnlyAnotherName
        unique (AnotherName),
    constraint PlantDevision___fk
        foreign key (GenusSpeciesID) references plants.GenusSpecies (GenusSpeciesID),
    constraint PlantDevision_ibfk_1
        foreign key (DistributionAreaID) references plants.DistributionArea (DistributionAreaID),
    constraint PlantDevision_ibfk_2
        foreign key (Creator) references plants.User (userId)
)
    comment '植物分类管理';




