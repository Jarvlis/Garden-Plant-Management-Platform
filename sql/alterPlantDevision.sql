# alter table PlantDevision
#     add Family_GenusID Integer null comment '科属ID' after DevisionID;
#
# alter table PlantDevision
#     add Genus_SpeciesID Integer null comment '属种ID' after Family_GenusID;



-- 添加唯一性约束
ALTER TABLE PlantDevision
    ADD CONSTRAINT OnlyAnotherName UNIQUE (AnotherName);
