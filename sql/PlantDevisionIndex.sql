#植物分类表
create index AnotherName_Index
    on plants.PlantDevision (AnotherName)
    comment '别名';

create index Creator
    on plants.PlantDevision (Creator);

create index DistributionAreaID
    on plants.PlantDevision (DistributionAreaID);


#科属表
create index idx_GenusName
    on plants.FamilyGenus (GenusName);



