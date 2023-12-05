package org.plants.DAO;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.plants.po.Plantsbasicinfo;
import org.plants.pojo.PlantsBasicInfoPro;

import java.util.List;
import java.util.Map;

/**
* @author 张娜
* @description 针对表【PlantsBasicInfo(基本信息表)】的数据库操作Mapper
* @createDate 2023-12-04 20:15:29
 * @Entity org.plants.po.Plantsbasicinfo
*/
public interface PlantsbasicinfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Plantsbasicinfo record);

    int insertSelective(Plantsbasicinfo record);

    Plantsbasicinfo selectByPrimaryKey(Long id);
    List<Plantsbasicinfo> selectAll();

    int updateByPrimaryKeySelective(Plantsbasicinfo record);

    int updateByPrimaryKey(Plantsbasicinfo record);

    /**
     * 查找植物详细信息
     * @param id 植物ID
     * @return
     */
    PlantsBasicInfoPro selectPlantsBasicInfoPro(Long id);
    /**
     * 统计各科植物的数量信息
     */
    @MapKey("FamilyName")
    List<Map<String, Object>> countPlantsByDevision();

    /**
     * 根据任意属性或属性组合查询植物
     * @param params <属性名,值>
     * @return
     */
    List<PlantsBasicInfoPro> searchPlants(Map<String, Object> params);
    /**
     * 统计各种病虫害的植物数量
     */
    @MapKey("PestName")
    List<Map<String, Object>> countPlantsByDisease();
}
