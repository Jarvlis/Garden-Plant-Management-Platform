package org.plants.DAO;


import org.apache.ibatis.annotations.Mapper;
import org.plants.po.Plantdevision;
import org.plants.pojo.PlantDevisionUserDistributionArea;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author ASUS
* @description 针对表【PlantDevision(植物分类管理)】的数据库操作Mapper
* @createDate 2023-12-05 09:19:31
* @Entity org.plants.po.Plantdevision
*/
@Mapper
@Repository
public interface PlantdevisionMapper {

    int deleteByPrimaryKey(Long id);

    //int insert(Plantdevision record);
    int insertPlantDevision(Plantdevision record);
    //int insertSelective(Plantdevision record);
    int callInsertPlantDevision(Plantdevision record);
    Plantdevision selectByPrimaryKey(Long id);
    List<Plantdevision> selectAll();
    List<Plantdevision> selectByAnothernamePlantdevisions(String anothername);
    Plantdevision selectByAnothernamePlantdevisionsOnly(String anothername);
//    List<Plantdevision> selectByFamilynamePlantdevisions(String familyname);
//    List<Plantdevision> selectByGenusnamePlantdevisions(String genusname);
//    List<Plantdevision> selectBySpeciesnamePlantdevisions(String speciesname);
    List<Plantdevision> selectByGrowingenvironmentPlantdevisions(String growingenvironment);
    int updateByPrimaryKeySelective(Plantdevision record);

    int updateByPrimaryKey(Plantdevision record);
    int updateByAnothernamePlantdevisionsOnly(Plantdevision record);
    /*
    PlantDevision_User_DistributionArea类
     */
    //ID查询
    PlantDevisionUserDistributionArea selectByDevisionidToConnection(Long id);

    //名查询
    List<PlantDevisionUserDistributionArea> selectByFamilynameToConnection(String familyname);
    List<PlantDevisionUserDistributionArea> selectByGenusnameToConnection(String genusname);
    List<PlantDevisionUserDistributionArea> selectBySpeciesnameToConnection(String specisname);
    List<PlantDevisionUserDistributionArea> selectByAnothernameToConnection(String anothername);
    PlantDevisionUserDistributionArea selectByAnothernameToTotal(String anothername);
    //区域查询
    List<PlantDevisionUserDistributionArea> selectByProvinceToConnection(String province);

    List<PlantDevisionUserDistributionArea> selectByCityToConnection(String city);
    List<PlantDevisionUserDistributionArea> selectByCountryToConnection(String country);
    List<PlantDevisionUserDistributionArea> selectByGrowingenvironmentToConnection(String growingenvironment);
    List<PlantDevisionUserDistributionArea> selectAllToConnection();



}
