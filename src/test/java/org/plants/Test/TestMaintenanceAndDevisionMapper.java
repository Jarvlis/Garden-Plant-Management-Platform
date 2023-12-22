package org.plants.Test;

import org.junit.jupiter.api.Test;
import org.plants.DAO.DistributionareaMapper;
import org.plants.DAO.PlantdevisionMapper;
import org.plants.DAO.PlantmaintenanceMapper;
import org.plants.Service.PLantDevisionService;
import org.plants.config.AppConfig;
import org.plants.po.Distributionarea;
import org.plants.po.Plantmaintenance;
import org.plants.pojo.PlantDevisionUserDistributionArea;
import org.plants.pojo.PlantMaintenance_User_PlantsBasicInfo;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringJUnitConfig(value = {AppConfig.class})
public class TestMaintenanceAndDevisionMapper {
    @Resource
    DistributionareaMapper distributionareaMapper;
    @Resource
    PlantdevisionMapper plantdevisionMapper;
    @Resource
    PlantmaintenanceMapper plantmaintenanceMapper;
    @Resource
    PLantDevisionService plantDevisionService;
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
        plantmaintenance= plantmaintenanceMapper.selectAll();
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
        plantmaintenanceMapper.insert(plantmaintenance2);
        System.out.println(plantmaintenanceMapper.selectByPrimaryKey((long)600));

        //update测试
        plantmaintenance2.setJobdescribtion("这是更新的测试");
        plantmaintenanceMapper.updateByPrimaryKey(plantmaintenance2);
        System.out.println(plantmaintenance2.toString());
        //删除测试
        plantmaintenanceMapper.deleteByPrimaryKey((long)600);
    }
    @Test
    public void testPlantdevisionMapper(){
        plantdevisionMapper.deleteByPrimaryKey((long)1000);
        PlantDevisionUserDistributionArea platdevisionEND = new PlantDevisionUserDistributionArea();
        platdevisionEND.setDevisionid(1000);
        platdevisionEND.setFamilyname("北京林业大学");
        platdevisionEND.setGenusname("信息学院");
        platdevisionEND.setSpeciesname("计算机科学与技术");
        platdevisionEND.setAnothername("计算机班级");
        platdevisionEND.setProvince("内蒙古");
        platdevisionEND.setCity("赤峰市");
        platdevisionEND.setCountry("元宝山区");
        platdevisionEND.setGrowingenvironment("环境优美，景色迷人");
        platdevisionEND.setUserName("系统管理员");
        plantDevisionService.insertOnePlantDevision(platdevisionEND);

        platdevisionEND.setFamilyname("北京林业大学new");
        platdevisionEND.setGenusname("信息学院new");
        platdevisionEND.setSpeciesname("计算机科学与技术new");
        platdevisionEND.setAnothername("计算机班级");
        platdevisionEND.setProvince("内蒙古new");
        platdevisionEND.setCity("赤峰市new");
        platdevisionEND.setCountry("元宝山区new");
        platdevisionEND.setGrowingenvironment("环境优美，景色迷人new");
        platdevisionEND.setUserName("系统管理员");
        plantDevisionService.updateOnePlantDevision(platdevisionEND);


    }
    @Test
    public void testDevisionView(){
        //selectall();
        List<PlantDevisionUserDistributionArea> areas = new ArrayList<PlantDevisionUserDistributionArea>();
        areas= plantdevisionMapper.selectAllToConnection();
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();


        System.out.println(plantdevisionMapper.selectByDevisionidToConnection((long)3));


        //名查询
        areas= plantdevisionMapper.selectByFamilynameToConnection("科");
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas= plantdevisionMapper.selectByGenusnameToConnection("属");
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas= plantdevisionMapper.selectBySpeciesnameToConnection("长蕊珍珠菜");
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas= plantdevisionMapper.selectByAnothernameToConnection("草");
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();


        //区域查询

        areas= plantdevisionMapper.selectByProvinceToConnection("广东省");
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas= plantdevisionMapper.selectByCityToConnection("杭州");
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();
        areas= plantdevisionMapper.selectByCountryToConnection("区");
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();

        areas= plantdevisionMapper.selectByGrowingenvironmentToConnection("热带");
        for(PlantDevisionUserDistributionArea ppp:areas){
            System.out.println(ppp.toString());
        }
        areas.clear();
    }
    @Test
    public void testMaintenanceView(){
        List<PlantMaintenance_User_PlantsBasicInfo> pls=new ArrayList<PlantMaintenance_User_PlantsBasicInfo>();
        pls= plantmaintenanceMapper.selectAllToConnection();
        for(PlantMaintenance_User_PlantsBasicInfo ppp:pls){
            System.out.println(ppp.toString());
        }
        pls.clear();

        pls= plantmaintenanceMapper.selectByJobdescribtionToConnection("执行");
        for(PlantMaintenance_User_PlantsBasicInfo ppp:pls){
            System.out.println(ppp.toString());
        }
        pls.clear();
        pls= plantmaintenanceMapper.selectByAnothernameToConnection("草");
        for(PlantMaintenance_User_PlantsBasicInfo ppp:pls){
            System.out.println(ppp.toString());
        }
        pls.clear();
        pls= plantmaintenanceMapper.selectByExecutionplaceToConnection("工厂");
        for(PlantMaintenance_User_PlantsBasicInfo ppp:pls){
            System.out.println(ppp.toString());
        }
        pls.clear();
        PlantMaintenance_User_PlantsBasicInfo plantMaintenanceUserPlantsBasicInfo= plantmaintenanceMapper.selectByMaintenanceidToConnection((long)3);
        System.out.println(plantMaintenanceUserPlantsBasicInfo.toString());


    }
}
