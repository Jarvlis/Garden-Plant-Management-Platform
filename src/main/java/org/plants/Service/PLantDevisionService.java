package org.plants.Service;

import org.plants.DAO.*;
import org.plants.po.Distributionarea;
import org.plants.po.Familygenus;
import org.plants.po.Genusspecies;
import org.plants.po.Plantdevision;
import org.plants.pojo.PlantDevisionUserDistributionArea;
import org.plants.pojo.UserWithRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PLantDevisionService {
    @Resource
    private FamilygenusMapper familygenusMapper;
    @Resource
    private GenusspeciesMapper genusspeciesMapper;
    @Resource
    private DistributionareaMapper distributionareaMapper;
    @Resource
    private PlantdevisionMapper plantdevisionMapper;
    @Resource
    private UserMapper userMapper;
    private UserroleMapper userroleMapper;

    public void insertOnePlantDevision(PlantDevisionUserDistributionArea record) {
        Distributionarea distributionarea = new Distributionarea();
        distributionarea.setProvince(record.getProvince());
        distributionarea.setCountry(record.getCountry());
        distributionarea.setCity(record.getCity());
        Distributionarea devisionflag = distributionareaMapper.selectByAllTYPE(distributionarea);
        if(devisionflag==null){
            distributionareaMapper.insert(distributionarea);
            devisionflag=distributionareaMapper.selectByAllTYPE(distributionarea);
        }

        Familygenus familygenus=new Familygenus();
        familygenus.setFamilyname(record.getFamilyname());
        familygenus.setGenusname(record.getGenusname());
        Familygenus familyGenusflag=familygenusMapper.selectByAllTYPE(familygenus);
        if(familyGenusflag==null){
            familygenusMapper.insert(familygenus);
            familyGenusflag=familygenusMapper.selectByAllTYPE(familygenus);
        }

        Genusspecies genusspecies = new Genusspecies();
        genusspecies.setGenusname(record.getGenusname());
        genusspecies.setSpeciesname(record.getSpeciesname());
        Genusspecies genusspeciesflag=genusspeciesMapper.selectByAllTYPE(genusspecies);
        if(genusspeciesflag==null){
            genusspeciesMapper.insert(genusspecies);
            genusspeciesflag=genusspeciesMapper.selectByAllTYPE(genusspecies);
        }

        UserWithRole user = userMapper.selectUserRoleByUsername(record.getUserName());


        Plantdevision plantdevision = new Plantdevision();
        plantdevision.setDevisionid(record.getDevisionid());
        plantdevision.setGenusspeciesid(genusspeciesflag.getGenusspeciesid());
        plantdevision.setAnothername(record.getAnothername());
        plantdevision.setGrowingenvironment(record.getGrowingenvironment());
        plantdevision.setCreator(user.getUserid());
        //plantdevision.setCreator(user.getId());
        plantdevision.setDistributionareaid(devisionflag.getDistributionareaid());
        plantdevisionMapper.callInsertPlantDevision(plantdevision);
    }
    public void updateOnePlantDevision(PlantDevisionUserDistributionArea record){
//        PlantDevisionUserDistributionArea plantDevisionUserDistributionArea = plantdevisionMapper.selectByAnothernameToTotal(record.getAnothername());
//        Plantdevision plantdevision = plantdevisionMapper.selectByAnothernamePlantdevisionsOnly(record.getAnothername());
//        if(!record.getProvince().equals(plantDevisionUserDistributionArea.getProvince())||
//                !record.getCity().equals( plantDevisionUserDistributionArea.getCity())||
//                !record.getCountry().equals( plantDevisionUserDistributionArea.getCountry())){
//            Distributionarea distributionarea = new Distributionarea();
//            distributionarea.setProvince(record.getProvince());
//            distributionarea.setCountry(record.getCountry());
//            distributionarea.setCity(record.getCity());
//            Distributionarea devisionflag = distributionareaMapper.selectByAllTYPE(distributionarea);
//            if(devisionflag==null){
//                distributionareaMapper.insert(distributionarea);
//                devisionflag=distributionareaMapper.selectByAllTYPE(distributionarea);
//            }
//        }


        Distributionarea distributionarea = new Distributionarea();
        distributionarea.setProvince(record.getProvince());
        distributionarea.setCountry(record.getCountry());
        distributionarea.setCity(record.getCity());
        Distributionarea devisionflag = distributionareaMapper.selectByAllTYPE(distributionarea);
        if(devisionflag==null){
            distributionareaMapper.insert(distributionarea);
            devisionflag=distributionareaMapper.selectByAllTYPE(distributionarea);
        }

        Familygenus familygenus=new Familygenus();
        familygenus.setFamilyname(record.getFamilyname());
        familygenus.setGenusname(record.getGenusname());
        Familygenus familyGenusflag=familygenusMapper.selectByAllTYPE(familygenus);
        if(familyGenusflag==null){
            familygenusMapper.insert(familygenus);
        }

        Genusspecies genusspecies = new Genusspecies();
        genusspecies.setGenusname(record.getGenusname());
        genusspecies.setSpeciesname(record.getSpeciesname());
        Genusspecies genusspeciesflag=genusspeciesMapper.selectByAllTYPE(genusspecies);
        if(genusspeciesflag==null){
            genusspeciesMapper.insert(genusspecies);
            genusspeciesflag=genusspeciesMapper.selectByAllTYPE(genusspecies);
        }

        Plantdevision plantdevision = new Plantdevision();
        plantdevision.setDevisionid(record.getDevisionid());
        plantdevision.setGenusspeciesid(genusspeciesflag.getGenusspeciesid());
        plantdevision.setAnothername(record.getAnothername());
        plantdevision.setGrowingenvironment(record.getGrowingenvironment());
        plantdevision.setDistributionareaid(devisionflag.getDistributionareaid());
        plantdevisionMapper.updateByAnothernamePlantdevisionsOnly(plantdevision);
    }
}
