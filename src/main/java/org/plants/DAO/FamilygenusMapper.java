package org.plants.DAO;

import org.plants.po.Familygenus;

/**
* @author ASUS
* @description 针对表【FamilyGenus(科属表)】的数据库操作Mapper
* @createDate 2023-12-18 15:41:48
* @Entity org.plants.po.Familygenus
*/
public interface FamilygenusMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Familygenus record);

    int insertSelective(Familygenus record);

    Familygenus selectByPrimaryKey(Long id);

    Familygenus selectByAllTYPE(Familygenus record);

    int updateByPrimaryKeySelective(Familygenus record);

    int updateByPrimaryKey(Familygenus record);

}
