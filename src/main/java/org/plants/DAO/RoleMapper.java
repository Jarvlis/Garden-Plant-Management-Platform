package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.Role;
import org.springframework.stereotype.Repository;

/**
* @author 十肆
* @description 针对表【Role(角色表)】的数据库操作Mapper
* @createDate 2023-12-03 19:52:14
* @Entity org.plants.po.Role
*/
@Mapper
@Repository
public interface RoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
