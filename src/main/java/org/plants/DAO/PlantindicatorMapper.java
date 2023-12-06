package org.plants.DAO;


import org.plants.po.Plantindicator;

/**
* @author PEA
* @description 针对表【PlantIndicator】的数据库操作Mapper
* @createDate 2023-12-05 20:31:28
* @Entity generator.domain.Plantindicator
*/
public interface PlantindicatorMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Plantindicator record);

    int insertSelective(Plantindicator record);

    Plantindicator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Plantindicator record);

    int updateByPrimaryKey(Plantindicator record);

}
