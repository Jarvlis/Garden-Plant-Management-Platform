package org.plants.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName GardenPlantPestControlManagement
 */
@Data
public class Gardenplantpestcontrolmanagement implements Serializable {
    /**
     * 预防的Id主键
     */
    private Integer preventionid;

    /**
     * 害虫名称
     */
    private String pestname;

    /**
     * 预防的方法
     */
    private String controlmethod;

    /**
     * 药剂名称
     */
    private String pesticidename;

    /**
     * 药剂用量
     */
    private String pesticidedosage;

    /**
     * 作用期限
     */
    private String validityperiod;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date creationtime;

    /**
     * 更新时间
     */
    private Date updatetime;

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
        Gardenplantpestcontrolmanagement other = (Gardenplantpestcontrolmanagement) that;
        return (this.getPreventionid() == null ? other.getPreventionid() == null : this.getPreventionid().equals(other.getPreventionid()))
            && (this.getPestname() == null ? other.getPestname() == null : this.getPestname().equals(other.getPestname()))
            && (this.getControlmethod() == null ? other.getControlmethod() == null : this.getControlmethod().equals(other.getControlmethod()))
            && (this.getPesticidename() == null ? other.getPesticidename() == null : this.getPesticidename().equals(other.getPesticidename()))
            && (this.getPesticidedosage() == null ? other.getPesticidedosage() == null : this.getPesticidedosage().equals(other.getPesticidedosage()))
            && (this.getValidityperiod() == null ? other.getValidityperiod() == null : this.getValidityperiod().equals(other.getValidityperiod()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPreventionid() == null) ? 0 : getPreventionid().hashCode());
        result = prime * result + ((getPestname() == null) ? 0 : getPestname().hashCode());
        result = prime * result + ((getControlmethod() == null) ? 0 : getControlmethod().hashCode());
        result = prime * result + ((getPesticidename() == null) ? 0 : getPesticidename().hashCode());
        result = prime * result + ((getPesticidedosage() == null) ? 0 : getPesticidedosage().hashCode());
        result = prime * result + ((getValidityperiod() == null) ? 0 : getValidityperiod().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", preventionid=").append(preventionid);
        sb.append(", pestname=").append(pestname);
        sb.append(", controlmethod=").append(controlmethod);
        sb.append(", pesticidename=").append(pesticidename);
        sb.append(", pesticidedosage=").append(pesticidedosage);
        sb.append(", validityperiod=").append(validityperiod);
        sb.append(", creator=").append(creator);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}