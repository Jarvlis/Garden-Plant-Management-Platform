package org.plants.po;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName GardenPlantMonitoringManagement
 */
@Data
public class Gardenplantmonitoringmanagement implements Serializable {
    /**
     * 监测记录ID
     */
    private Integer monitoringid;

    /**
     * 检查时间
     */
    private Date monitoringtime;

    /**
     * 检察人员的Id
     */
    private Integer monitoringstaffid;

    /**
     * 监测的地点
     */
    private String monitoringlocation;

    /**
     * 检测植物的编号Id
     */
    private Integer monitoringplantid;

    /**
     * 监测的指标
     */
    private Integer monitoringindicatorid;

    /**
     * 用于监测的设备
     */
    private Integer monitoringequipmentid;

    /**
     * 数字化的结果
     */
    private BigDecimal numericresult;

    /**
     * 普通结果
     */
    private String commonresult;

    /**
     * 创建该条记录的人员的Id
     */
    private Integer creatorid;

    /**
     * 创建时间
     */
    private Date createtime;

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
        Gardenplantmonitoringmanagement other = (Gardenplantmonitoringmanagement) that;
        return (this.getMonitoringid() == null ? other.getMonitoringid() == null : this.getMonitoringid().equals(other.getMonitoringid()))
            && (this.getMonitoringtime() == null ? other.getMonitoringtime() == null : this.getMonitoringtime().equals(other.getMonitoringtime()))
            && (this.getMonitoringstaffid() == null ? other.getMonitoringstaffid() == null : this.getMonitoringstaffid().equals(other.getMonitoringstaffid()))
            && (this.getMonitoringlocation() == null ? other.getMonitoringlocation() == null : this.getMonitoringlocation().equals(other.getMonitoringlocation()))
            && (this.getMonitoringplantid() == null ? other.getMonitoringplantid() == null : this.getMonitoringplantid().equals(other.getMonitoringplantid()))
            && (this.getMonitoringindicatorid() == null ? other.getMonitoringindicatorid() == null : this.getMonitoringindicatorid().equals(other.getMonitoringindicatorid()))
            && (this.getMonitoringequipmentid() == null ? other.getMonitoringequipmentid() == null : this.getMonitoringequipmentid().equals(other.getMonitoringequipmentid()))
            && (this.getNumericresult() == null ? other.getNumericresult() == null : this.getNumericresult().equals(other.getNumericresult()))
            && (this.getCommonresult() == null ? other.getCommonresult() == null : this.getCommonresult().equals(other.getCommonresult()))
            && (this.getCreatorid() == null ? other.getCreatorid() == null : this.getCreatorid().equals(other.getCreatorid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMonitoringid() == null) ? 0 : getMonitoringid().hashCode());
        result = prime * result + ((getMonitoringtime() == null) ? 0 : getMonitoringtime().hashCode());
        result = prime * result + ((getMonitoringstaffid() == null) ? 0 : getMonitoringstaffid().hashCode());
        result = prime * result + ((getMonitoringlocation() == null) ? 0 : getMonitoringlocation().hashCode());
        result = prime * result + ((getMonitoringplantid() == null) ? 0 : getMonitoringplantid().hashCode());
        result = prime * result + ((getMonitoringindicatorid() == null) ? 0 : getMonitoringindicatorid().hashCode());
        result = prime * result + ((getMonitoringequipmentid() == null) ? 0 : getMonitoringequipmentid().hashCode());
        result = prime * result + ((getNumericresult() == null) ? 0 : getNumericresult().hashCode());
        result = prime * result + ((getCommonresult() == null) ? 0 : getCommonresult().hashCode());
        result = prime * result + ((getCreatorid() == null) ? 0 : getCreatorid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", monitoringid=").append(monitoringid);
        sb.append(", monitoringtime=").append(monitoringtime);
        sb.append(", monitoringstaffid=").append(monitoringstaffid);
        sb.append(", monitoringlocation=").append(monitoringlocation);
        sb.append(", monitoringplantid=").append(monitoringplantid);
        sb.append(", monitoringindicatorid=").append(monitoringindicatorid);
        sb.append(", monitoringequipmentid=").append(monitoringequipmentid);
        sb.append(", numericresult=").append(numericresult);
        sb.append(", commonresult=").append(commonresult);
        sb.append(", creatorid=").append(creatorid);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}