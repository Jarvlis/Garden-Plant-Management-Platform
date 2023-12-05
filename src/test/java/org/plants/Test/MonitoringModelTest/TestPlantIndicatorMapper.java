package org.plants.Test.MonitoringModelTest;

import org.junit.jupiter.api.Test;
import org.plants.DAO.PlantindicatorMapper;
import org.plants.config.AppConfig;
import org.plants.po.Plantindicator;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;

@SpringJUnitConfig(value = {AppConfig.class})
public class TestPlantIndicatorMapper {
    @Resource
    PlantindicatorMapper plantindicatorMapper;
    @Test
    void testInsert()
    {
        Plantindicator plantindicator = new Plantindicator();
        plantindicator.setPlantid(3);
        plantindicator.setIndicatorid(2);
        plantindicatorMapper.insert(plantindicator);
    }
    @Test
    void testDelete()
    {
        int res =plantindicatorMapper.deleteByPrimaryKey(3L);
        System.out.println(res);
    }
}
