package org.plants.DAO;

import org.plants.po.PestControlStrategy;

import java.util.List;

public interface PestControlStrategyDAO {
    // 创建
    void addPestControlStrategy(PestControlStrategy pestControlStrategy);

    // 读取
    PestControlStrategy getPestControlStrategyById(int strategieId);
    List<PestControlStrategy> getPestControlStrategiesByPlantId(int plantId);

    // 更新
    void updatePestControlStrategy(PestControlStrategy pestControlStrategy);

    // 删除
    void deletePestControlStrategy(int strategieId);
}
