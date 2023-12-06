package org.plants.DAO;


import org.plants.po.Equipment;

/**
* @author PEA
* @description 针对表【Equipment】的数据库操作Mapper
* @createDate 2023-12-05 19:25:27
* @Entity generator.domain.Equipment
*/
public interface EquipmentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    Equipment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);

}
