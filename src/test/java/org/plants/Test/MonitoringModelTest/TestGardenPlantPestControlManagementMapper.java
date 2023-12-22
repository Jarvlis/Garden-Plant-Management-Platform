package org.plants.Test.MonitoringModelTest;

import org.junit.jupiter.api.Test;
import org.plants.config.AppConfig;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;
import java.util.Date;

@SpringJUnitConfig(value = {AppConfig.class})
public class TestGardenPlantPestControlManagementMapper {
    @Resource
    org.plants.DAO.GardenplantpestcontrolmanagementMapper gardenplantpestcontrolmanagementMapper;
    @Test
    void testSelect()
    {
        org.plants.po.Gardenplantpestcontrolmanagement gardenplantpestcontrolmanagement = gardenplantpestcontrolmanagementMapper.selectByPrimaryKey(1L);
        System.out.println(gardenplantpestcontrolmanagement);
    }
    @Test
    void testInsert()
    {
        org.plants.po.Gardenplantpestcontrolmanagement gardenplantpestcontrolmanagement = new org.plants.po.Gardenplantpestcontrolmanagement();
        gardenplantpestcontrolmanagement.setControlmethod("灭虫");
        gardenplantpestcontrolmanagement.setCreationtime(new Date());
        gardenplantpestcontrolmanagement.setCreator("张三");
        gardenplantpestcontrolmanagement.setPesticidedosage("1kg");
        gardenplantpestcontrolmanagement.setPesticidename("杀虫粉");
        gardenplantpestcontrolmanagement.setPestname("行军蚁");
        gardenplantpestcontrolmanagement.setValidityperiod("30天");
        gardenplantpestcontrolmanagementMapper.insert(gardenplantpestcontrolmanagement);
    }
    @Test
    void testDelete()
    {
        int res =gardenplantpestcontrolmanagementMapper.deleteByPrimaryKey(8L);
        System.out.println(res);
    }
    @Test
    void testUpdate()
    {
        org.plants.po.Gardenplantpestcontrolmanagement gardenplantpestcontrolmanagement = gardenplantpestcontrolmanagementMapper.selectByPrimaryKey(3L);
        gardenplantpestcontrolmanagement.setUpdatetime(new Date());
        gardenplantpestcontrolmanagement.setCreator("李四");
        gardenplantpestcontrolmanagement.setPesticidename("杀虫粉");
        gardenplantpestcontrolmanagement.setPestname("火蚁");
        gardenplantpestcontrolmanagement.setValidityperiod("15天");
        gardenplantpestcontrolmanagementMapper.updateByPrimaryKey(gardenplantpestcontrolmanagement);
    }
}
