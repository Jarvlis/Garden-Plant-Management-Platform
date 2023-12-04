package org.plants.DAO;

import org.plants.po.PlantsBasicInfo;

import java.util.List;

public interface PlantsBasicInfoDAO {
    // 创建
    void addPlantsBasicInfo(PlantsBasicInfo plantsBasicInfo);

    // 读取
    PlantsBasicInfo getPlantsBasicInfoById(int plantId);
    List<PlantsBasicInfo> getAllPlantsBasicInfo();

    // 更新
    void updatePlantsBasicInfo(PlantsBasicInfo plantsBasicInfo);

    // 删除
    void deletePlantsBasicInfo(int plantId);
}
