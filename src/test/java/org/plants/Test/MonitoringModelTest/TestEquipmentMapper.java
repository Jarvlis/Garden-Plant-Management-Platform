package org.plants.Test.MonitoringModelTest;

import org.junit.jupiter.api.Test;
import org.plants.DAO.EquipmentMapper;
import org.plants.config.AppConfig;
import org.plants.po.Equipment;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@SpringJUnitConfig(value = {AppConfig.class})
public class TestEquipmentMapper {

    @Resource
    EquipmentMapper equipmentMapper;
    @Test
    public void testSelect()
    {
        Equipment equipment = equipmentMapper.selectByPrimaryKey(1L);
        System.out.println(equipment);
    }
    @Test
    public void testInsert()
    {
        Equipment equipment = new Equipment();
        equipment.setCreatetime(new Date());
        equipment.setEquipmentname("综合检测设备三");
        equipmentMapper.insert(equipment);
    }
    @Test
    public void testUpdate()
    {
        Equipment equipment = equipmentMapper.selectByPrimaryKey(2L);
        equipment.setEquipmentname("单一检测设备1");
        equipment.setUpdatetime(new Date());
        equipmentMapper.updateByPrimaryKey(equipment);
    }
    @Test
    public void testDelete()
    {
        int res = equipmentMapper.deleteByPrimaryKey(2L);
        System.out.println(res);
    }



}
