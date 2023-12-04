package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.PestControlStrategy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
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
