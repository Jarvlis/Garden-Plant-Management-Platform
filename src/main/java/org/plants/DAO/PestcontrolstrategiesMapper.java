package org.plants.DAO;

import org.plants.po.Pestcontrolstrategies;

/**
* @author 张娜
* @description 针对表【PestControlStrategies(病虫害防治策略表)】的数据库操作Mapper
* @createDate 2023-12-04 20:24:26
* @Entity org.plants.po.Pestcontrolstrategies
*/
public interface PestcontrolstrategiesMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Pestcontrolstrategies record);

    int insertSelective(Pestcontrolstrategies record);

    Pestcontrolstrategies selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Pestcontrolstrategies record);

    int updateByPrimaryKey(Pestcontrolstrategies record);

}
