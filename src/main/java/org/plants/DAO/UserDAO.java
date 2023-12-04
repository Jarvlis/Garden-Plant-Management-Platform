package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.User;
import org.plants.pojo.UserWithRole;
import org.springframework.stereotype.Repository;

/**
* @author 十肆
* @description 针对表【User(用户表)】的数据库操作Mapper
* @createDate 2023-12-03 19:37:38
* @Entity org.plants.po.User
*/
@Mapper
@Repository
public interface UserDAO {

    UserWithRole selectUserRoleByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
