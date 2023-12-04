package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.PlantsBasicInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
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
