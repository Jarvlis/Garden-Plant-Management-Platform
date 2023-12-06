package org.plants.DAO;

import org.plants.po.Gardenplantmonitoringmanagement;

/**
* @author PEA
* @description 针对表【GardenPlantMonitoringManagement】的数据库操作Mapper
* @createDate 2023-12-05 21:13:00
* @Entity generator.domain.Gardenplantmonitoringmanagement
*/
public interface GardenplantmonitoringmanagementMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Gardenplantmonitoringmanagement record);

    int insertSelective(Gardenplantmonitoringmanagement record);

    Gardenplantmonitoringmanagement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Gardenplantmonitoringmanagement record);

    int updateByPrimaryKey(Gardenplantmonitoringmanagement record);

}
