package org.plants.Test.MonitoringModelTest;

import org.junit.jupiter.api.Test;
import org.plants.DAO.IndicatorMapper;
import org.plants.config.AppConfig;
import org.plants.po.Indicator;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;

@SpringJUnitConfig(value = {AppConfig.class})
public class TestIndicatorMapper {
    @Resource
    IndicatorMapper indicatorMapper;
    @Test
    void testInsert()
    {
        Indicator indicator = new Indicator();
        indicator.setIndicatorname("温度");
        indicator.setInfo("植物生长的温度");
        indicatorMapper.insert(indicator);
    }
    @Test
    void testDelete()
    {
        int res =indicatorMapper.deleteByPrimaryKey(3L);
        System.out.println(res);
    }
    @Test
    void testUpdate()
    {
        Indicator indicator = indicatorMapper.selectByPrimaryKey(3L);
        indicator.setIsnumeric(1);
        indicatorMapper.updateByPrimaryKey(indicator);
    }
    @Test
    void testSelect()
    {
        Indicator indicator = indicatorMapper.selectByPrimaryKey(1L);
        System.out.println(indicator);
    }
}
