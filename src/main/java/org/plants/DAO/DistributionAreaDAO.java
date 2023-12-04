package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.DistributionArea;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DistributionAreaDAO {
    int insert(DistributionArea distribution);
    int delete(int distributionId);
    int update(DistributionArea distribution);
    //ID查询
    DistributionArea selectById(int distributionId);
    //省名查询
    List<DistributionArea> selectByProvince(String Province);
    //市名查询
    List<DistributionArea> selectByCity(String City);
    //县名查询
    List<DistributionArea> selectByCountry(String Country);
}
