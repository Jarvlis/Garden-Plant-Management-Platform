package org.plants.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.plants.po.Distributionarea;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author ASUS
* @description 针对表【DistributionArea(分类管理-分布区域)】的数据库操作Mapper
* @createDate 2023-12-05 09:12:28
* @Entity org.plants.po.Distributionarea
*/
@Mapper
@Repository
public interface DistributionareaMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Distributionarea record);

    int insertSelective(Distributionarea record);

    Distributionarea selectByPrimaryKey(Long id);
    List<Distributionarea> selectAll();
    List<Distributionarea> selectByProvince(String province);
    List<Distributionarea> selectByCity(String city);
    List<Distributionarea> selectByCountry(String country);
    int updateByPrimaryKeySelective(Distributionarea record);

    int updateByPrimaryKey(Distributionarea record);

}
