package org.plants.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.plants.DAO.UserMapper;
import org.plants.DAO.UserroleMapper;
import org.plants.po.User;
import org.plants.po.Userrole;
import org.plants.pojo.UserWithRole;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Configuration
@ComponentScan(basePackages = {"org.plants.DAO"})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {UserMapperTest.class})
public class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Resource
    UserroleMapper userroleMapper;

    @Test
    public void testInsertSelective() {
        // 创建一个User对象，并设置其属性值
        User user = new User();
        user.setUsername("王厂长");
        user.setUserpassword("123456789");
        user.setPhonenumber("10010");

        // 执行插入用户表操作
        int result1 = userMapper.insertSelective(user);

        Userrole userrole = new Userrole();
        userrole.setRoleid(1);
        userrole.setUserid(user.getUserid());

        // 插入用户权限表
        int result2 = userroleMapper.insertSelective(userrole);

        // 验证结果
        assertEquals(1, result1);
        assertEquals(1, result2);
    }

    @Test
    public void testSelectByPrimaryKey() {

        // 设置要查询的用户ID
        int id = 1;

        // 执行查询操作
        UserWithRole result = userMapper.selectUserRoleByPrimaryKey(id);

        // 验证结果
        assertNotNull(result);
        System.out.println("查询结果：" + result);
    }

    // 测试更新数据（非空）
    @Test
    public void testUpdateByPrimaryKeySelective() {
        // 设置要更新的用户ID
        int id = 5;

        // 查询原始数据
        User original = userMapper.selectByPrimaryKey(id);

        // 修改部分属性值
        original.setUsername("王二狗");
        original.setUserpassword("00000000");

        // 执行更新操作
        int result = userMapper.updateByPrimaryKeySelective(original);

        // 验证结果
        assertEquals(1, result);

        // 再次查询以验证更新是否成功
        User updated = userMapper.selectByPrimaryKey(id);
        assertEquals("王二狗", updated.getUsername());
        assertEquals("00000000", updated.getUserpassword());
    }

    // 测试删除数据
    @Test
    public void testDeleteByPrimaryKey() {
        // 设置要删除的用户ID
        int id = 5;

        // 执行删除操作
        int result1 = userMapper.deleteByPrimaryKey(id);
        int result2 = userroleMapper.deleteByPrimaryKey(id);

        // 验证结果
        assertEquals(1, result1);
        assertEquals(1, result2);
    }
}