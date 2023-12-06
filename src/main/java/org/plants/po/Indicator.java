package org.plants.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName Indicator
 */
@Data
public class Indicator implements Serializable {
    /**
     * 观测指标Id
     */
    private Integer indicatorid;

    /**
     * 观测指标的名称
     */
    private String indicatorname;

    /**
     * 观测指标基本说明
     */
    private String info;

    /**
     * 观测指标是否能够进行数字化统计,0不可以,1可以
     */
    private Integer isnumeric;

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
        Indicator other = (Indicator) that;
        return (this.getIndicatorid() == null ? other.getIndicatorid() == null : this.getIndicatorid().equals(other.getIndicatorid()))
            && (this.getIndicatorname() == null ? other.getIndicatorname() == null : this.getIndicatorname().equals(other.getIndicatorname()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getIsnumeric() == null ? other.getIsnumeric() == null : this.getIsnumeric().equals(other.getIsnumeric()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIndicatorid() == null) ? 0 : getIndicatorid().hashCode());
        result = prime * result + ((getIndicatorname() == null) ? 0 : getIndicatorname().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getIsnumeric() == null) ? 0 :getIsnumeric().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", indicatorid=").append(indicatorid);
        sb.append(", indicatorname=").append(indicatorname);
        sb.append(", info=").append(info);
        sb.append(", numeric=").append(isnumeric);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}