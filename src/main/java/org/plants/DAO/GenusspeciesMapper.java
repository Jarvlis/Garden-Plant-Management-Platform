package org.plants.DAO;

import org.plants.po.Genusspecies;

/**
* @author ASUS
* @description 针对表【GenusSpecies(属种表)】的数据库操作Mapper
* @createDate 2023-12-18 15:44:11
* @Entity org.plants.po.Genusspecies
*/
public interface GenusspeciesMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Genusspecies record);

    int insertSelective(Genusspecies record);

    Genusspecies selectByPrimaryKey(Long id);

    Genusspecies selectByAllTYPE(Genusspecies record);

    int updateByPrimaryKeySelective(Genusspecies record);

    int updateByPrimaryKey(Genusspecies record);

}
