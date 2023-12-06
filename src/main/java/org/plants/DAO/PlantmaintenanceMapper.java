package org.plants.DAO;



import org.apache.ibatis.annotations.Mapper;
import org.plants.po.Plantmaintenance;
import org.plants.pojo.PlantMaintenance_User_PlantsBasicInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author ASUS
* @description 针对表【PlantMaintenance(植物养护管理)】的数据库操作Mapper
* @createDate 2023-12-05 09:19:31
* @Entity org.plants.po.Plantmaintenance
*/
@Mapper
@Repository
public interface PlantmaintenanceMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Plantmaintenance record);

    int insertSelective(Plantmaintenance record);

    Plantmaintenance selectByPrimaryKey(Long id);
    List<Plantmaintenance> selectAll();
    int updateByPrimaryKeySelective(Plantmaintenance record);

    int updateByPrimaryKey(Plantmaintenance record);


    //PlantmaintenanceView视图

    PlantMaintenance_User_PlantsBasicInfo selectByMaintenanceidToConnection(Long id);
    List<PlantMaintenance_User_PlantsBasicInfo> selectByAnothernameToConnection(String anothername);
    List<PlantMaintenance_User_PlantsBasicInfo> selectByExecutionplaceToConnection(String executionplace);
    List<PlantMaintenance_User_PlantsBasicInfo> selectByJobdescribtionToConnection(String jobdescribtion);
    List<PlantMaintenance_User_PlantsBasicInfo> selectAllToConnection();
}
