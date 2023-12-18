package org.plants.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 科属表
 * @TableName FamilyGenus
 */
@Data
public class Familygenus implements Serializable {
    /**
     * 
     */
    private Integer familygenusid;

    /**
     * 
     */
    private String familyname;

    /**
     * 
     */
    private String genusname;

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
        Familygenus other = (Familygenus) that;
        return (this.getFamilygenusid() == null ? other.getFamilygenusid() == null : this.getFamilygenusid().equals(other.getFamilygenusid()))
            && (this.getFamilyname() == null ? other.getFamilyname() == null : this.getFamilyname().equals(other.getFamilyname()))
            && (this.getGenusname() == null ? other.getGenusname() == null : this.getGenusname().equals(other.getGenusname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFamilygenusid() == null) ? 0 : getFamilygenusid().hashCode());
        result = prime * result + ((getFamilyname() == null) ? 0 : getFamilyname().hashCode());
        result = prime * result + ((getGenusname() == null) ? 0 : getGenusname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", familygenusid=").append(familygenusid);
        sb.append(", familyname=").append(familyname);
        sb.append(", genusname=").append(genusname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}