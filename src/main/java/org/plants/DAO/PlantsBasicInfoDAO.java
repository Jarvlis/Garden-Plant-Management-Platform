package org.plants.DAO;

import org.apache.ibatis.annotations.MapKey;
import org.plants.po.PlantsBasicInfo;

import java.util.List;
import java.util.Map;

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

    /**
     * 统计各科植物信息
     */
    @MapKey("FamilyName")
    List<Map<String, Long>> countPlantsByDevision();

    /**
     * 根据任意属性或属性组合查询植物
     * @param params <属性名,值>
     * @return
     */
    List<PlantsBasicInfo> searchPlants(Map<String, Object> params);
}
