package org.plants.po;

import java.io.Serializable;
import java.util.Arrays;
import lombok.Data;

/**
 * 配图信息表
 * @TableName PlantImages
 */
@Data
public class Plantimages implements Serializable {
    /**
     * 
     */
    private Integer imageid;

    /**
     * 
     */
    private Integer plantid;

    /**
     * 
     */
    private String imagelocation;

    /**
     * 
     */
    private String imagedescribe;

    /**
     * 
     */
    private String photographer;

    /**
     * 
     */
    private byte[] imagedata;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Plantimages other = (Plantimages) that;
        return (this.getImageid() == null ? other.getImageid() == null : this.getImageid().equals(other.getImageid()))
            && (this.getPlantid() == null ? other.getPlantid() == null : this.getPlantid().equals(other.getPlantid()))
            && (this.getImagelocation() == null ? other.getImagelocation() == null : this.getImagelocation().equals(other.getImagelocation()))
            && (this.getImagedescribe() == null ? other.getImagedescribe() == null : this.getImagedescribe().equals(other.getImagedescribe()))
            && (this.getPhotographer() == null ? other.getPhotographer() == null : this.getPhotographer().equals(other.getPhotographer()))
            && (Arrays.equals(this.getImagedata(), other.getImagedata()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getImageid() == null) ? 0 : getImageid().hashCode());
        result = prime * result + ((getPlantid() == null) ? 0 : getPlantid().hashCode());
        result = prime * result + ((getImagelocation() == null) ? 0 : getImagelocation().hashCode());
        result = prime * result + ((getImagedescribe() == null) ? 0 : getImagedescribe().hashCode());
        result = prime * result + ((getPhotographer() == null) ? 0 : getPhotographer().hashCode());
        result = prime * result + (Arrays.hashCode(getImagedata()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", imageid=").append(imageid);
        sb.append(", plantid=").append(plantid);
        sb.append(", imagelocation=").append(imagelocation);
        sb.append(", imagedescribe=").append(imagedescribe);
        sb.append(", photographer=").append(photographer);
        sb.append(", imagedata=").append(imagedata);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}