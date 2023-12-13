package org.plants.pojo;

import lombok.Data;
import org.plants.po.Plantdevision;
import org.plants.po.User;

import java.io.Serializable;
import java.util.Date;

@Data
public class PlantDevision_User_DistributionArea extends Plantdevision implements Serializable {
    private static final long serialVersionUID = 1L;

    private String province;
    private String city;
    private String country;
    private String userName;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", 编号=").append(devisionid);
        sb.append(", 科名=").append(familyname);
        sb.append(", 属名=").append(genusname);
        sb.append(", 种名=").append(speciesname);
        sb.append(", 别名=").append(anothername);
        sb.append(", 省=").append(province);
        sb.append(", 市=").append(city);
        sb.append(", 县=").append(country);
        sb.append(", 生长环境=").append(growingenvironment);
        sb.append(", 创建者=").append(userName);
        sb.append(", 创建时间=").append(creationtime);
        sb.append(", 更新时间=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }
}
