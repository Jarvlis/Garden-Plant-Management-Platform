package org.plants.DAO;


import org.apache.ibatis.annotations.Mapper;
import org.plants.po.Plantdevision;
import org.plants.pojo.PlantDevision_User_DistributionArea;
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

    int insert(Plantdevision record);

    int insertSelective(Plantdevision record);

    Plantdevision selectByPrimaryKey(Long id);
    List<Plantdevision> selectAll();
    List<Plantdevision> selectByAnothernamePlantdevisions(String anothername);
    List<Plantdevision> selectByFamilynamePlantdevisions(String familyname);
    List<Plantdevision> selectByGenusnamePlantdevisions(String genusname);
    List<Plantdevision> selectBySpeciesnamePlantdevisions(String speciesname);
    List<Plantdevision> selectByGrowingenvironmentPlantdevisions(String growingenvironment);
    int updateByPrimaryKeySelective(Plantdevision record);

    int updateByPrimaryKey(Plantdevision record);

    /*
    PlantDevision_User_DistributionArea类
     */
    //ID查询
    PlantDevision_User_DistributionArea selectByDevisionidToConnection(Long id);

    //名查询
    List<PlantDevision_User_DistributionArea> selectByFamilynameToConnection(String familyname);
    List<PlantDevision_User_DistributionArea> selectByGenusnameToConnection(String genusname);
    List<PlantDevision_User_DistributionArea> selectBySpeciesnameToConnection(String specisname);
    List<PlantDevision_User_DistributionArea> selectByAnothernameToConnection(String anothername);

    //区域查询
    List<PlantDevision_User_DistributionArea> selectByProvinceToConnection(String province);

    List<PlantDevision_User_DistributionArea> selectByCityToConnection(String city);
    List<PlantDevision_User_DistributionArea> selectByCountryToConnection(String country);
    List<PlantDevision_User_DistributionArea> selectByGrowingenvironmentToConnection(String growingenvironment);
    List<PlantDevision_User_DistributionArea> selectAllToConnection();



}
