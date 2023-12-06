package org.plants.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 植物养护管理
 * @TableName PlantMaintenance
 */
@Data
public class Plantmaintenance implements Serializable {
    /**
     * 养护ID
     */
    protected Integer maintenanceid;

    /**
     * 任务名称
     */
    protected String missionname;

    /**
     * 执行时间
     */
    protected Date executiontime;

    /**
     * 执行地点
     */
    protected String executionplace;

    /**
     * 执行人员
     */
    protected Integer userid;

    /**
     * 任务描述
     */
    protected String jobdescribtion;

    /**
     * 养护对象
     */
    protected Integer plantid;

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
        Plantmaintenance other = (Plantmaintenance) that;
        return (this.getMaintenanceid() == null ? other.getMaintenanceid() == null : this.getMaintenanceid().equals(other.getMaintenanceid()))
            && (this.getMissionname() == null ? other.getMissionname() == null : this.getMissionname().equals(other.getMissionname()))
            && (this.getExecutiontime() == null ? other.getExecutiontime() == null : this.getExecutiontime().equals(other.getExecutiontime()))
            && (this.getExecutionplace() == null ? other.getExecutionplace() == null : this.getExecutionplace().equals(other.getExecutionplace()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getJobdescribtion() == null ? other.getJobdescribtion() == null : this.getJobdescribtion().equals(other.getJobdescribtion()))
            && (this.getPlantid() == null ? other.getPlantid() == null : this.getPlantid().equals(other.getPlantid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMaintenanceid() == null) ? 0 : getMaintenanceid().hashCode());
        result = prime * result + ((getMissionname() == null) ? 0 : getMissionname().hashCode());
        result = prime * result + ((getExecutiontime() == null) ? 0 : getExecutiontime().hashCode());
        result = prime * result + ((getExecutionplace() == null) ? 0 : getExecutionplace().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getJobdescribtion() == null) ? 0 : getJobdescribtion().hashCode());
        result = prime * result + ((getPlantid() == null) ? 0 : getPlantid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", maintenanceid=").append(maintenanceid);
        sb.append(", missionname=").append(missionname);
        sb.append(", executiontime=").append(executiontime);
        sb.append(", executionplace=").append(executionplace);
        sb.append(", userid=").append(userid);
        sb.append(", jobdescribtion=").append(jobdescribtion);
        sb.append(", plantid=").append(plantid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}