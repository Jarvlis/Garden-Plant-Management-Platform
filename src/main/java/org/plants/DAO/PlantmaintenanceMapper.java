package org.plants.DAO;



import org.plants.po.Plantmaintenance;

/**
* @author ASUS
* @description 针对表【PlantMaintenance(植物养护管理)】的数据库操作Mapper
* @createDate 2023-12-05 09:19:31
* @Entity org.plants.po.Plantmaintenance
*/
public interface PlantmaintenanceMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Plantmaintenance record);

    int insertSelective(Plantmaintenance record);

    Plantmaintenance selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Plantmaintenance record);

    int updateByPrimaryKey(Plantmaintenance record);

}
