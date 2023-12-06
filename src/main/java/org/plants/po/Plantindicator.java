package org.plants.po;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName PlantIndicator
 */
@Data
public class Plantindicator implements Serializable {
    /**
     * 植物监测表
     */
    private Integer plantinicatorid;

    /**
     * 植物的分类Id,从Division表中选取
     */
    private Integer plantid;

    /**
     * 植物的监测指标的Id
     */
    private Integer indicatorid;

    /**
     * 最小值
     */
    private BigDecimal low;

    /**
     * 最大值
     */
    private BigDecimal high;

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
        Plantindicator other = (Plantindicator) that;
        return (this.getPlantinicatorid() == null ? other.getPlantinicatorid() == null : this.getPlantinicatorid().equals(other.getPlantinicatorid()))
            && (this.getPlantid() == null ? other.getPlantid() == null : this.getPlantid().equals(other.getPlantid()))
            && (this.getIndicatorid() == null ? other.getIndicatorid() == null : this.getIndicatorid().equals(other.getIndicatorid()))
            && (this.getLow() == null ? other.getLow() == null : this.getLow().equals(other.getLow()))
            && (this.getHigh() == null ? other.getHigh() == null : this.getHigh().equals(other.getHigh()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlantinicatorid() == null) ? 0 : getPlantinicatorid().hashCode());
        result = prime * result + ((getPlantid() == null) ? 0 : getPlantid().hashCode());
        result = prime * result + ((getIndicatorid() == null) ? 0 : getIndicatorid().hashCode());
        result = prime * result + ((getLow() == null) ? 0 : getLow().hashCode());
        result = prime * result + ((getHigh() == null) ? 0 : getHigh().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plantinicatorid=").append(plantinicatorid);
        sb.append(", plantid=").append(plantid);
        sb.append(", indicatorid=").append(indicatorid);
        sb.append(", low=").append(low);
        sb.append(", high=").append(high);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}