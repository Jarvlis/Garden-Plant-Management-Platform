package org.plants.po;

import java.io.Serializable;

/*
植物分类管理-分布区域
 */
public class DistributionArea implements Serializable {
    private static final long serialVersionUID =1L;
    //分布区域ID
    private int DistributionAreaID;
    //省
    private String Province;
    //市
    private String City;
    //县
    private String Country;
}
