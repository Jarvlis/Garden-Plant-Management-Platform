create table plants.PlantMaintenance
(
    MaintenanceID  int auto_increment
        primary key,
    MissionName    varchar(255) null,
    ExecutionTime  timestamp    null,
    ExecutionPlace varchar(255) null,
    userId         int          null,
    JobDescribtion text         null,
    plantId        int          null,
    creatorID      int          null,
    CreatorTime    timestamp    null,
    UpdateTime     timestamp    null,
    constraint PlantMaintenance_ibfk_1
        foreign key (plantId) references plants.PlantsBasicInfo (plantId),
    constraint PlantMaintenance_ibfk_2
        foreign key (userId) references plants.User (userId)
)
    comment '植物养护管理';




