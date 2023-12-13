package org.plants.Test;

import org.junit.jupiter.api.Test;
import org.plants.DAO.DistributionareaMapper;
import org.plants.DAO.PlantdevisionMapper;
import org.plants.DAO.PlantmaintenanceMapper;
import org.plants.config.AppConfig;
import org.plants.po.Distributionarea;
import org.plants.po.Plantdevision;
import org.plants.po.Plantmaintenance;
import org.plants.pojo.PlantDevision_User_DistributionArea;
import org.plants.pojo.PlantMaintenance_User_PlantsBasicInfo;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringJUnitConfig(value = {AppConfig.class})
public class ZhengKaiFu_Test {
    @Resource
    DistributionareaMapper distributionareaMapper;
    @Resource
    PlantdevisionMapper platdevisionMapper;
    @Resource
    PlantmaintenanceMapper platmaintenanceMapper;
    @Test
    public void testDistributionareaMapper(){
        //selectaall测试
        List<Distributionarea> distributions = new ArrayList<Distributionarea>();
        distributions=distributionareaMapper.selectAll();
        for(Distributionarea area : distributions){
            System.out.println(area.toString());
        }

        //insert测试
        Distributionarea distribution=new Distributionarea();
        distribution.setDistributionareaid(600);
        distribution.setProvince("test");
        distribution.setCity("test");
        distribution.setCountry("test");
        distributionareaMapper.insert(distribution);

        //select测试
        Distributionarea distributionarea=distributionareaMapper.selectByPrimaryKey((long)600);
        System.out.println(distributionarea.toString());

        //delete测试
        distributionareaMapper.deleteByPrimaryKey((long)600);

        distributions.clear();
        //省查询
        distributions = new ArrayList<Distributionarea>();
        distributions=distributionareaMapper.selectByProvince("贵州省");
        for(Distributionarea area:distributions){
            System.out.println(area.toString());
        }
        distributions.clear();
        //市查询
        distributions=distributionareaMapper.selectByCity("遵义");
        for(Distributionarea area:distributions){
            System.out.println(area.toString());
        }
        distributions.clear();
        //区查询
        distributions=distributionareaMapper.selectByCountry("区");
        for(Distributionarea area:distributions){
            System.out.println(area.toString());
        }

        //update测试
        distribution=new Distributionarea();
        distribution.setDistributionareaid(600);
        distribution.setProvince("test");
        distribution.setCity("test");
        distribution.setCountry("test");
        distributionareaMapper.insert(distribution);
        System.out.println(distributionareaMapper.toString());
        distribution.setProvince("newtest");
        distributionareaMapper.updateByPrimaryKey(distribution);
        System.out.println(distributionareaMapper.toString());
        distributionareaMapper.deleteByPrimaryKey((long)600);
    }
    @Test
    public void testPlantmaintenanceMapper(){
        //select测试
        List<Plantmaintenance> plantmaintenance=new ArrayList<Plantmaintenance>();
        plantmaintenance=platmaintenanceMapper.selectAll();
        for(Plantmaintenance plantmaintenance1:plantmaintenance){
            System.out.println(plantmaintenance1.toString());
        }

        //insert测试、主键查询
        Plantmaintenance plantmaintenance2=new Plantmaintenance();
        plantmaintenance2.setMaintenanceid(600);
        plantmaintenance2.setMissionname("test");
        plantmaintenance2.setExecutionplace("第二教学楼");
        plantmaintenance2.setPlantid(1);
        plantmaintenance2.setUserid(3);
        plantmaintenance2.setJobdescribtion("test");
        platmaintenanceMapper.insert(plantmaintenance2);
        System.out.println(platmaintenanceMapper.selectByPrimaryKey((long)600));

        //update测试
        plantmaintenance2.setJobdescribtion("这是更新的测试");
        platmaintenanceMapper.updateByPrimaryKey(plantmaintenance2);
        System.out.println(plantmaintenance2.toString());
        //删除测试
        platmaintenanceMapper.deleteByPrimaryKey((long)600);
    }
    @Test
    public void testPlantdevisionMapper(){

        //查找测试
        List<Plantdevision> plantdevisions = new ArrayList<Plantdevision>();
        plantdevisions=platdevisionMapper.selectAll();
        for(Plantdevision plantdevision : plantdevisions){
            System.out.println(plantdevision.toString());
        }
        //插入测试、更新测试、删除测试、单查找测试
        Plantdevision plantdevision=new Plantdevision();
        plantdevision.setDevisionid(600);
        plantdevision.setFamilyname("test");
        plantdevision.setGenusname("test");
        plantdevision.setSpeciesname("opopopo");
        plantdevision.setAnothername("999999");
        plantdevision.setDistributionareaid(60);
        plantdevision.setGrowingenvironment("环境恶劣");
        plantdevision.setCreator(1);
        platdevisionMapper.insert(plantdevision);
        System.out.println(platdevisionMapper.selectByPrimaryKey((long)600).toString());
        plantdevision.setFamilyname("first");
        plantdevision.setGenusname("second");
        plantdevision.setAnothername("third");
        plantdevision.setDistributionareaid(60);
        plantdevision.setGrowingenvironment("环境恶劣++");
        platdevisionMapper.updateByPrimaryKey(plantdevision);
        System.out.println(platdevisionMapper.selectByPrimaryKey((long)600).toString());
        platdevisionMapper.deleteByPrimaryKey((long)600);
    }
    @Test
    public void testDevisionView(){
        //selectall();
        List<PlantDevision_User_DistributionArea> areas = new ArrayList<PlantDevision_User_DistributionArea>();
        areas=platdevisionMapper.selectAllToConnection();
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();


        System.out.println(platdevisionMapper.selectByDevisionidToConnection((long)3));


        //名查询
        areas=platdevisionMapper.selectByFamilynameToConnection("科");
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas=platdevisionMapper.selectByGenusnameToConnection("属");
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas=platdevisionMapper.selectBySpeciesnameToConnection("长蕊珍珠菜");
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas=platdevisionMapper.selectByAnothernameToConnection("草");
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();


        //区域查询

        areas=platdevisionMapper.selectByProvinceToConnection("广东省");
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas=platdevisionMapper.selectByCityToConnection("杭州");
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();
        areas=platdevisionMapper.selectByCountryToConnection("区");
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas=platdevisionMapper.selectByGrowingenvironmentToConnection("热带");
        for(PlantDevision_User_DistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();
    }
    @Test
    public void testMaintenanceView(){
        List<PlantMaintenance_User_PlantsBasicInfo> pls=new ArrayList<PlantMaintenance_User_PlantsBasicInfo>();
        pls=platmaintenanceMapper.selectAllToConnection();
        for(PlantMaintenance_User_PlantsBasicInfo ppp:pls){
            System.out.println(ppp.toString());
        }
        pls.clear();

        pls=platmaintenanceMapper.selectByJobdescribtionToConnection("执行");
        for(PlantMaintenance_User_PlantsBasicInfo ppp:pls){
            System.out.println(ppp.toString());
        }
        pls.clear();
        pls=platmaintenanceMapper.selectByAnothernameToConnection("草");
        for(PlantMaintenance_User_PlantsBasicInfo ppp:pls){
            System.out.println(ppp.toString());
        }
        pls.clear();
        pls=platmaintenanceMapper.selectByExecutionplaceToConnection("工厂");
        for(PlantMaintenance_User_PlantsBasicInfo ppp:pls){
            System.out.println(ppp.toString());
        }
        pls.clear();
        PlantMaintenance_User_PlantsBasicInfo plantMaintenanceUserPlantsBasicInfo=platmaintenanceMapper.selectByMaintenanceidToConnection((long)3);
        System.out.println(plantMaintenanceUserPlantsBasicInfo.toString());


    }
}
