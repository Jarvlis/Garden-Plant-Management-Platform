package org.plants.Test.MonitoringModelTest;

import org.junit.jupiter.api.Test;
import org.plants.DAO.GardenplantmonitoringmanagementMapper;
import org.plants.config.AppConfig;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

@SpringJUnitConfig(value = {AppConfig.class})
public class TestGardenPlantMonitoringManagement {
    @Resource
    GardenplantmonitoringmanagementMapper gardenplantmonitoringmanagementMapper;
    @Test
    void testSelect()
    {
        org.plants.po.Gardenplantmonitoringmanagement gardenplantmonitoringmanagement = gardenplantmonitoringmanagementMapper.selectByPrimaryKey(4L);
        System.out.println(gardenplantmonitoringmanagement);
    }
    @Test
    void testUpdate()
    {
        org.plants.po.Gardenplantmonitoringmanagement gardenplantmonitoringmanagement = gardenplantmonitoringmanagementMapper.selectByPrimaryKey(4L);
        gardenplantmonitoringmanagement.setMonitoringplantid(4);
        gardenplantmonitoringmanagementMapper.updateByPrimaryKey(gardenplantmonitoringmanagement);
    }
    @Test
    void testInsert()
    {
        org.plants.po.Gardenplantmonitoringmanagement gardenplantmonitoringmanagement = new org.plants.po.Gardenplantmonitoringmanagement();
        gardenplantmonitoringmanagement.setMonitoringstaffid(3);
        gardenplantmonitoringmanagement.setCreatorid(1);
        gardenplantmonitoringmanagement.setMonitoringequipmentid(2);
        gardenplantmonitoringmanagement.setMonitoringindicatorid(1);
        gardenplantmonitoringmanagement.setMonitoringplantid(3);
        gardenplantmonitoringmanagement.setMonitoringtime(new Date());
        gardenplantmonitoringmanagement.setNumericresult(BigDecimal.valueOf(20));
        gardenplantmonitoringmanagementMapper.insert(gardenplantmonitoringmanagement);
    }
    @Test
    void testDelete()
    {
        int res =gardenplantmonitoringmanagementMapper.deleteByPrimaryKey(6L);
        System.out.println(res);
    }

}
