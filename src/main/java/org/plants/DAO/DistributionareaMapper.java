package org.plants.DAO;

import org.plants.po.Distributionarea;

import java.util.List;

/**
* @author ASUS
* @description 针对表【DistributionArea(分类管理-分布区域)】的数据库操作Mapper
* @createDate 2023-12-05 09:12:28
* @Entity org.plants.po.Distributionarea
*/
public interface DistributionareaMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Distributionarea record);

    int insertSelective(Distributionarea record);

    Distributionarea selectByPrimaryKey(Long id);
    List<Integer> selectByProvince(String province);
    List<Integer> selectByCity(String city);
    List<Integer> selectByCountry(String country);
    int updateByPrimaryKeySelective(Distributionarea record);

    int updateByPrimaryKey(Distributionarea record);

}
