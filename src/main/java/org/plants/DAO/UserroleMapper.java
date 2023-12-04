package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.Userrole;
import org.springframework.stereotype.Repository;

/**
* @author 十肆
* @description 针对表【UserWithRole(用户角色表)】的数据库操作Mapper
* @createDate 2023-12-03 20:11:07
* @Entity org.plants.po.Userrole
*/
@Mapper
@Repository
public interface UserroleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    Userrole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);

}
