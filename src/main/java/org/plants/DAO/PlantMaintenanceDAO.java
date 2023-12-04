package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.PlantMaintenance;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/*
植物养护管理
 */
@Mapper
@Repository
public interface PlantMaintenanceDAO {
    int insert(PlantMaintenance plantMaintenance);
    int updateById(PlantMaintenance plantMaintenanceID);
    int deleteById(int plantMaintenanceID);


    //养护ID查询
    PlantMaintenance selectById(int plantMaintenanceID);
    //养护人员ID查询
    List<PlantMaintenance> selectByuserId(int userId);
    //养护植物ID查询
    List<PlantMaintenance> selectByplantId(int plantId);

}
