package org.plants.DAO;


import org.plants.po.Indicator;

/**
* @author PEA
* @description 针对表【Indicator】的数据库操作Mapper
* @createDate 2023-12-05 20:11:14
* @Entity generator.domain.Indicator
*/
public interface IndicatorMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Indicator record);

    int insertSelective(Indicator record);

    Indicator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Indicator record);

    int updateByPrimaryKey(Indicator record);

}
