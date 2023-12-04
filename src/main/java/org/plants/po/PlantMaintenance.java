package org.plants.po;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/*
植物养护管理
 */
@Data
public class PlantMaintenance implements Serializable {
    private static final long serialVersionUID =1L;
    //养护任务编号
    private int MaintenanceID;
    //任务名称
    private String MissionName;
    //执行时间
    private LocalDateTime ExecutionTime;
    //执行地点
    private String ExecutionPlace;
    //执行人员
    private int userId;
    //任务描述
    private String JobDescribtion;
    //养护对象
    private int plantId;
}
