package org.plants.DAO;

import org.plants.po.PlantDevision;

import java.util.List;

//植物分类管理
public interface PlantDevisionDAO {
    int insert(PlantDevision plant);
    int delete(int plantDevisionId);
    int update(PlantDevision plant);

    //id查询
    PlantDevision selectByPlantDevisionId(int plantDevisionId);
    //生长环境查询——模糊查询
    List<PlantDevision> selectByGrowingEnvironment(String environment);
    //科名查找
    List<PlantDevision> selectByFamilyName(String familyName);
    //属名查找
    List<PlantDevision> selectBySpeciesName(String speciesName);
    //种名查找
    List<PlantDevision> selectByGenusName(String geneName);
    //别名查找
    List<PlantDevision> selectByAnotherName(String anotherName);

}
