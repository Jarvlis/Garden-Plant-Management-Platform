package org.plants.DAO;

import org.plants.po.PlantImage;

import java.util.List;

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
