package org.plants.DAO;


import org.plants.po.User;

/**
 * Author:Jarvlis
 * Date:2023-12-02
 * Time:12:27
 */
public interface UserDAO {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
