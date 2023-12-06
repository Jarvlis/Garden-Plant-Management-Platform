package org.plants.DAO;


import org.plants.po.Gardenplantpestcontrolmanagement;

/**
* @author PEA
* @description 针对表【GardenPlantPestControlManagement】的数据库操作Mapper
* @createDate 2023-12-05 21:01:02
* @Entity generator.domain.Gardenplantpestcontrolmanagement
*/
public interface GardenplantpestcontrolmanagementMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Gardenplantpestcontrolmanagement record);

    int insertSelective(Gardenplantpestcontrolmanagement record);

    Gardenplantpestcontrolmanagement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Gardenplantpestcontrolmanagement record);

    int updateByPrimaryKey(Gardenplantpestcontrolmanagement record);

}
