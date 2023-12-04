package org.plants.po;

import java.util.List;

/**
 * 植物基本信息类
 */
public class PlantsBasicInfo {
    /**
     * 植物ID
     */
    private int plantId;
    /**
     * 病名
     */
    private String diseaseName;
    /**
     * 分类ID
     */
    private int devisionId;
    /**
     * 形态特征
     */
    private String morphologicalFeatures;
    /**
     * 栽培技术要点
     */
    private String cultivationTechniques;
    /**
     * 应用价值
     */
    private String applicationValue;
    /**
     * 植物配图
     */
    List<PlantImage> plantImageList;
    /**
     * 植物分类
     */
    private PlantDevision plantDevision;

    public PlantsBasicInfo() {
    }

    public PlantsBasicInfo(int plantId, String diseaseName, int devisionId, String morphologicalFeatures, String cultivationTechniques, String applicationValue) {
        this.plantId = plantId;
        this.diseaseName = diseaseName;
        this.devisionId = devisionId;
        this.morphologicalFeatures = morphologicalFeatures;
        this.cultivationTechniques = cultivationTechniques;
        this.applicationValue = applicationValue;
    }

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public int getDevisionId() {
        return devisionId;
    }

    public void setDevisionId(int devisionId) {
        this.devisionId = devisionId;
    }

    public String getMorphologicalFeatures() {
        return morphologicalFeatures;
    }

    public void setMorphologicalFeatures(String morphologicalFeatures) {
        this.morphologicalFeatures = morphologicalFeatures;
    }

    public String getCultivationTechniques() {
        return cultivationTechniques;
    }

    public void setCultivationTechniques(String cultivationTechniques) {
        this.cultivationTechniques = cultivationTechniques;
    }

    public String getApplicationValue() {
        return applicationValue;
    }

    public void setApplicationValue(String applicationValue) {
        this.applicationValue = applicationValue;
    }

    public List<PlantImage> getPlantImageList() {
        return plantImageList;
    }

    public void setPlantImageList(List<PlantImage> plantImageList) {
        this.plantImageList = plantImageList;
    }

    public PlantDevision getPlantDevision() {
        return plantDevision;
    }

    public void setPlantDevision(PlantDevision plantDevision) {
        this.plantDevision = plantDevision;
    }
}
