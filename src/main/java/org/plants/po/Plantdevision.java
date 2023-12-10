package org.plants.po;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import lombok.Data;

/**
 * 植物分类管理
 * @TableName PlantDevision
 */
@Data
public class Plantdevision implements Serializable {
    /**
     * 分类管理ID
     */
    protected Integer devisionid;

    /**
     * 科名
     */
    protected String familyname;

    /**
     * 属名
     */
    protected String genusname;

    /**
     * 种名
     */
    protected String speciesname;

    /**
     * 别名
     */
    protected String anothername;

    /**
     * 分布区域
     */
    protected Integer distributionareaid;

    /**
     * 生长环境
     */
    protected String growingenvironment;

    /**
     * 创建人员
     */
    protected Integer creator;

    /**
     * 创建时间
     */
    protected Timestamp creationtime;

    /**
     * 修改时间
     */
    protected Timestamp updatetime;

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
        Plantdevision other = (Plantdevision) that;
        return (this.getDevisionid() == null ? other.getDevisionid() == null : this.getDevisionid().equals(other.getDevisionid()))
            && (this.getFamilyname() == null ? other.getFamilyname() == null : this.getFamilyname().equals(other.getFamilyname()))
            && (this.getGenusname() == null ? other.getGenusname() == null : this.getGenusname().equals(other.getGenusname()))
            && (this.getSpeciesname() == null ? other.getSpeciesname() == null : this.getSpeciesname().equals(other.getSpeciesname()))
            && (this.getAnothername() == null ? other.getAnothername() == null : this.getAnothername().equals(other.getAnothername()))
            && (this.getDistributionareaid() == null ? other.getDistributionareaid() == null : this.getDistributionareaid().equals(other.getDistributionareaid()))
            && (this.getGrowingenvironment() == null ? other.getGrowingenvironment() == null : this.getGrowingenvironment().equals(other.getGrowingenvironment()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDevisionid() == null) ? 0 : getDevisionid().hashCode());
        result = prime * result + ((getFamilyname() == null) ? 0 : getFamilyname().hashCode());
        result = prime * result + ((getGenusname() == null) ? 0 : getGenusname().hashCode());
        result = prime * result + ((getSpeciesname() == null) ? 0 : getSpeciesname().hashCode());
        result = prime * result + ((getAnothername() == null) ? 0 : getAnothername().hashCode());
        result = prime * result + ((getDistributionareaid() == null) ? 0 : getDistributionareaid().hashCode());
        result = prime * result + ((getGrowingenvironment() == null) ? 0 : getGrowingenvironment().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", devisionid=").append(devisionid);
        sb.append(", familyname=").append(familyname);
        sb.append(", genusname=").append(genusname);
        sb.append(", speciesname=").append(speciesname);
        sb.append(", anothername=").append(anothername);
        sb.append(", distributionareaid=").append(distributionareaid);
        sb.append(", growingenvironment=").append(growingenvironment);
        sb.append(", creator=").append(creator);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}