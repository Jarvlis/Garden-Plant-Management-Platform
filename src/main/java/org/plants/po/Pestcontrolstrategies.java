package org.plants.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 病虫害防治策略表
 * @TableName PestControlStrategies
 */
@Data
public class Pestcontrolstrategies implements Serializable {
    /**
     * 策略ID
     */
    private Integer strategieid;

    /**
     * 植物ID
     */
    private Integer plantid;

    /**
     * 预防ID
     */
    private Integer preventionid;

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
        Pestcontrolstrategies other = (Pestcontrolstrategies) that;
        return (this.getStrategieid() == null ? other.getStrategieid() == null : this.getStrategieid().equals(other.getStrategieid()))
            && (this.getPlantid() == null ? other.getPlantid() == null : this.getPlantid().equals(other.getPlantid()))
            && (this.getPreventionid() == null ? other.getPreventionid() == null : this.getPreventionid().equals(other.getPreventionid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStrategieid() == null) ? 0 : getStrategieid().hashCode());
        result = prime * result + ((getPlantid() == null) ? 0 : getPlantid().hashCode());
        result = prime * result + ((getPreventionid() == null) ? 0 : getPreventionid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", strategieid=").append(strategieid);
        sb.append(", plantid=").append(plantid);
        sb.append(", preventionid=").append(preventionid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}