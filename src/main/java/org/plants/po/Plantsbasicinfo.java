package org.plants.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 基本信息表
 * @TableName PlantsBasicInfo
 */
@Data
public class Plantsbasicinfo implements Serializable {
    /**
     * 植物ID
     */
    private Integer plantid;

    /**
     * 病名
     */
    private String diseasename;

    /**
     * 分类ID
     */
    private Integer devisionid;

    /**
     * 形态特征
     */
    private String morphologicalfeatures;

    /**
     * 栽培技术要点
     */
    private String cultivationtechniques;

    /**
     * 应用价值
     */
    private String applicationvalue;

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
        Plantsbasicinfo other = (Plantsbasicinfo) that;
        return (this.getPlantid() == null ? other.getPlantid() == null : this.getPlantid().equals(other.getPlantid()))
            && (this.getDiseasename() == null ? other.getDiseasename() == null : this.getDiseasename().equals(other.getDiseasename()))
            && (this.getDevisionid() == null ? other.getDevisionid() == null : this.getDevisionid().equals(other.getDevisionid()))
            && (this.getMorphologicalfeatures() == null ? other.getMorphologicalfeatures() == null : this.getMorphologicalfeatures().equals(other.getMorphologicalfeatures()))
            && (this.getCultivationtechniques() == null ? other.getCultivationtechniques() == null : this.getCultivationtechniques().equals(other.getCultivationtechniques()))
            && (this.getApplicationvalue() == null ? other.getApplicationvalue() == null : this.getApplicationvalue().equals(other.getApplicationvalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlantid() == null) ? 0 : getPlantid().hashCode());
        result = prime * result + ((getDiseasename() == null) ? 0 : getDiseasename().hashCode());
        result = prime * result + ((getDevisionid() == null) ? 0 : getDevisionid().hashCode());
        result = prime * result + ((getMorphologicalfeatures() == null) ? 0 : getMorphologicalfeatures().hashCode());
        result = prime * result + ((getCultivationtechniques() == null) ? 0 : getCultivationtechniques().hashCode());
        result = prime * result + ((getApplicationvalue() == null) ? 0 : getApplicationvalue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plantid=").append(plantid);
        sb.append(", diseasename=").append(diseasename);
        sb.append(", devisionid=").append(devisionid);
        sb.append(", morphologicalfeatures=").append(morphologicalfeatures);
        sb.append(", cultivationtechniques=").append(cultivationtechniques);
        sb.append(", applicationvalue=").append(applicationvalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}