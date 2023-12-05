package org.plants.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 分类管理-分布区域
 * @TableName DistributionArea
 */
@Data
public class Distributionarea implements Serializable {
    /**
     * 分布区域ID
     */
    private Integer distributionareaid;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String country;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Distributionarea other = (Distributionarea) that;
        return (this.getDistributionareaid() == null ? other.getDistributionareaid() == null : this.getDistributionareaid().equals(other.getDistributionareaid()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDistributionareaid() == null) ? 0 : getDistributionareaid().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", distributionareaid=").append(distributionareaid);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}