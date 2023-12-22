package org.plants.Test;

import org.junit.jupiter.api.Test;
import org.plants.DAO.PestcontrolstrategiesMapper;
import org.plants.DAO.PlantimagesMapper;
import org.plants.DAO.PlantsbasicinfoMapper;
import org.plants.config.AppConfig;
import org.plants.po.Plantsbasicinfo;
import org.plants.pojo.PlantsBasicInfoPro;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringJUnitConfig(value = {AppConfig.class})
public class TestPlantsBasicInfoMapper {
    @Resource
    private PlantsbasicinfoMapper plantsBasicInfoMapper;

    @Resource
    private PlantimagesMapper plantImagesMapper;

    @Resource
    private PestcontrolstrategiesMapper pestControlStrategiesMapper;
    @Test
    public void testSelectPlantsBasicInfoPro() {
        // Set the plant ID for testing
        Long plantId = 1L;

        // Execute the query
        PlantsBasicInfoPro result = plantsBasicInfoMapper.selectPlantsBasicInfoPro(plantId);

        // Validate the result
        assertNotNull(result);
        System.out.println("Query result: " + result);
    }
    @Test
    public void testCountPlantsByDevision() {
        // Execute the query to count plants by division
        List<Map<String, Object>> result = plantsBasicInfoMapper.countPlantsByDevision();

        // Validate the result
        assertNotNull(result);
        System.out.println("Count result: " + result);
    }
    @Test
    public void testSearchPlants() {
        // Create a map with search parameters
        Map<String, Object> params = new HashMap<>();
//        params.put("diseaseName", "SomeDisease");
        params.put("divisionId", 1);
//        params.put("familyName","白花丹科");
        // Execute the query to search plants
        List<PlantsBasicInfoPro> result = plantsBasicInfoMapper.searchPlants(params);

        // Validate the result
        assertNotNull(result);
        System.out.println("Search result: " + result);
    }
    @Test
    public void testInsert() {
        // 创建一个 Plantsbasicinfo 对象，并设置其属性值
        Plantsbasicinfo plantInfo = new Plantsbasicinfo();
        plantInfo.setDiseasename("Test Disease");
        plantInfo.setDevisionid(3);
        plantInfo.setApplicationvalue("test");
        plantInfo.setMorphologicalfeatures("test");
        plantInfo.setCultivationtechniques("test");

        // 执行插入操作
        int result = plantsBasicInfoMapper.insert(plantInfo);

        // 验证结果
        assertEquals(1, result);
        assertNotNull(plantInfo.getPlantid());
        System.out.println("insert result: " + plantInfo);
    }
    @Test
    public void testInsertSelective() {
        // 创建一个 Plantsbasicinfo 对象，并设置其属性值
        Plantsbasicinfo plantInfo = new Plantsbasicinfo();
        plantInfo.setDiseasename("Test Disease-InsertSelective");
        plantInfo.setDevisionid(4);

        // 执行插入操作
        int result = plantsBasicInfoMapper.insertSelective(plantInfo);

        // 验证结果
        assertEquals(1, result);
        assertNotNull(plantInfo.getPlantid());
        System.out.println("InsertSelective result: " + plantInfo);
    }
    @Test
    public void testSelectByPrimaryKey() {
        // 设置要查询的植物 ID
        Long id = 1L;

        // 执行查询操作
        Plantsbasicinfo result = plantsBasicInfoMapper.selectByPrimaryKey(id);

        // 验证结果
        assertNotNull(result);
        System.out.println("SelectByPrimaryKey result: " + result);
    }
    @Test
    public void testUpdateByPrimaryKeySelective() {
        // 设置要更新的植物 ID
        Long id = 10L;

        // 查询原始数据
        Plantsbasicinfo original = plantsBasicInfoMapper.selectByPrimaryKey(id);

        // 修改部分属性值
        original.setMorphologicalfeatures("Updated Features");

        // 执行更新操作
        int result = plantsBasicInfoMapper.updateByPrimaryKeySelective(original);

        // 验证结果
        assertEquals(1, result);

        // 再次查询以验证更新是否成功
        Plantsbasicinfo updated = plantsBasicInfoMapper.selectByPrimaryKey(id);
        System.out.println("Updated:"+updated);
    }

    @Test
    public void testDeleteByPrimaryKey() {
        // 设置要删除的植物 ID
        Long id = 10L;

        // 执行删除操作
        int result = plantsBasicInfoMapper.deleteByPrimaryKey(id);

        // 验证结果
        assertEquals(1, result);
    }

    @Test
    public void testSelectAllByPlantId() {

        // 执行查询操作
        List<Plantsbasicinfo> resultList = plantsBasicInfoMapper.selectAll();

        // 验证结果
        assertNotNull(resultList);
        // 可以进一步验证 resultList 中的内容
        System.out.println("SelectAll result: " + resultList);
    }
    @Test
    public void testCountPlantsByDisease() {
        // 执行查询操作
        List<Map<String, Object>> result = plantsBasicInfoMapper.countPlantsByDisease();
        // 验证结果
        assertNotNull(result);
        System.out.println(result);
        // 遍历结果并输出
        for (Map<String, Object> entry : result) {
            String pestName = String.valueOf(entry.get("PestName"));
            Long plantCount = (Long) entry.get("plantCount");
            System.out.println("病虫害名称: " + pestName + ", 植物数量: " + plantCount);
        }
    }

}
