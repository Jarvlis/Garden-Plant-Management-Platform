package org.plants.DAO;

import org.plants.po.DistributionArea;

import java.util.List;

public interface DistributionAreaDAO {
    int insert(DistributionArea distribution);
    int delete(int distributionId);
    int update(int distributionId);
    //ID查询
    DistributionArea selectById(int distributionId);
    //省名查询
    List<DistributionArea> selectByProvince(String Province);
    //市名查询
    List<DistributionArea> selectByCity(String City);
    //县名查询
    List<DistributionArea> selectByCountry(String Country);
}
