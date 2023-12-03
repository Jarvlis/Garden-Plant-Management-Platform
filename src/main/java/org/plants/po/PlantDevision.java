package org.plants.po;

import java.io.Serializable;
import java.time.LocalDateTime;

/*
植物分类管理
 */
public class PlantDevision implements Serializable {
    private static final long serialVersionUID =1L;
    //植物分类管理ID
    private int DevisionID;
    //科名
    private String FamilyName;
    //属名
    private String GenusName;
    //种名
    private String SpeciesName;
    //分布区域ID
    private int DistributionAreaID;
    //生长环境
    private String GrowingEnvironment;
    //创建人员
    private int Creator;
    //创建时间
    private LocalDateTime CreationTime;
    //修改时间
    private LocalDateTime UpdateTime;
}
