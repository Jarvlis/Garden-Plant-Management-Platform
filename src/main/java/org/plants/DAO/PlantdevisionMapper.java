package org.plants.DAO;


import org.plants.po.Plantdevision;

import java.util.List;

/**
* @author ASUS
* @description 针对表【PlantDevision(植物分类管理)】的数据库操作Mapper
* @createDate 2023-12-05 09:19:31
* @Entity org.plants.po.Plantdevision
*/
public interface PlantdevisionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Plantdevision record);

    int insertSelective(Plantdevision record);

    Plantdevision selectByPrimaryKey(Long id);

    List<Plantdevision> selectByAnothernamePlantdevisions(String anothername);
    List<Plantdevision> selectByFamilynamePlantdevisions(String familyname);
    List<Plantdevision> selectByGenusnamePlantdevisions(String genusname);
    List<Plantdevision> selectBySpeciesnamePlantdevisions(String speciesname);
    List<Plantdevision> selectByGrowingenvironmentPlantdevisions(String growingenvironment);
    int updateByPrimaryKeySelective(Plantdevision record);

    int updateByPrimaryKey(Plantdevision record);

}
