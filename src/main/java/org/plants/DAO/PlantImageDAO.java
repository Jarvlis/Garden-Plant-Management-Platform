package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.PlantImage;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface PlantImageDAO {
    // 创建
    void addPlantImage(PlantImage plantImage);

    // 读取
    PlantImage getPlantImageById(int imageId);
    List<PlantImage> getPlantImagesByPlantId(int plantId);

    // 更新
    void updatePlantImage(PlantImage plantImage);

    // 删除
    void deletePlantImage(int imageId);
}
