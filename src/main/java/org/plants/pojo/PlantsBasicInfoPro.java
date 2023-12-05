package org.plants.pojo;

import lombok.Data;
import org.plants.po.Plantimages;
import org.plants.po.Plantsbasicinfo;

import java.util.List;
@Data
public class PlantsBasicInfoPro extends Plantsbasicinfo {
    /**
     * 植物配图
     */
    List<Plantimages> plantImageList;
    /**
     * 植物分类
     */
    /*private PlantDevision plantDevision;*/
    /**
     * 分类信息
     */
    private String familyName;
    private String genusName;
    private String speciesName;
    private String anotherName;
    /**
     * 病虫害防治策略
     */
    private String pestName;
    private String controlMethod;
    private String pesticideName;
    private String pesticideDosage;
    private String validityPeriod;
}
