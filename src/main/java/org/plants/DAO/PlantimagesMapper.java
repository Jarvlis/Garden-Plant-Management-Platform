package org.plants.DAO;

import org.plants.po.Plantimages;

/**
* @author 张娜
* @description 针对表【PlantImages(配图信息表)】的数据库操作Mapper
* @createDate 2023-12-04 20:21:44
* @Entity org.plants.po.Plantimages
*/
public interface PlantimagesMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Plantimages record);

    int insertSelective(Plantimages record);

    Plantimages selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Plantimages record);

    int updateByPrimaryKey(Plantimages record);

}
