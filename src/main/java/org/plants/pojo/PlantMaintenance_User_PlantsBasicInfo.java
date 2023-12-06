package org.plants.pojo;

import lombok.Data;
import org.plants.po.Plantdevision;
import org.plants.po.Plantmaintenance;

import java.io.Serializable;

@Data
public class PlantMaintenance_User_PlantsBasicInfo extends Plantmaintenance implements Serializable {
    private static final long serialVersionUID = 1L;
    private String anothername;
    private String creator;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", 养护编号=").append(maintenanceid);
        sb.append(", 任务名称=").append(missionname);
        sb.append(", 职务名称=").append(anothername);
        sb.append(", 执行时间=").append(executiontime);
        sb.append(", 执行地点=").append(executionplace);
        sb.append(", 执行人员=").append(creator);
        sb.append(", 任务描述=").append(jobdescribtion);
        sb.append("]");
        return sb.toString();
    }
}
