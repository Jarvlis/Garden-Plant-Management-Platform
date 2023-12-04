package org.plants.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 配图信息类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlantImage {
    /**
     * 配图ID
     */
    private int imageId;
    /**
     *  植物ID
     */
    private int plantId;
    /**
     * 配图二进制存储
     */
    private byte[] imageData;
    /**
     * 配图拍摄地
     */
    private String imageLocation;
    /**
     * 配图描述
     */
    private String imageDescribe;
    /**
     * 配图拍摄者
     */
    private String photographer;

    public PlantImage(int imageId, int plantId, byte[] imageData, String imagePath, String imageLocation, String imageDescribe, String photographer) {
        this.imageId = imageId;
        this.plantId = plantId;
        this.imageData = imageData;
        this.imageLocation = imageLocation;
        this.imageDescribe = imageDescribe;
        this.photographer = photographer;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public String getImageDescribe() {
        return imageDescribe;
    }

    public void setImageDescribe(String imageDescribe) {
        this.imageDescribe = imageDescribe;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }
}
