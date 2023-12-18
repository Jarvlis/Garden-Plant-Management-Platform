package org.plants.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 属种表
 * @TableName GenusSpecies
 */
@Data
public class Genusspecies implements Serializable {
    /**
     * 
     */
    private Integer genusspeciesid;

    /**
     * 
     */
    private String genusname;

    /**
     * 
     */
    private String speciesname;

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
        Genusspecies other = (Genusspecies) that;
        return (this.getGenusspeciesid() == null ? other.getGenusspeciesid() == null : this.getGenusspeciesid().equals(other.getGenusspeciesid()))
            && (this.getGenusname() == null ? other.getGenusname() == null : this.getGenusname().equals(other.getGenusname()))
            && (this.getSpeciesname() == null ? other.getSpeciesname() == null : this.getSpeciesname().equals(other.getSpeciesname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGenusspeciesid() == null) ? 0 : getGenusspeciesid().hashCode());
        result = prime * result + ((getGenusname() == null) ? 0 : getGenusname().hashCode());
        result = prime * result + ((getSpeciesname() == null) ? 0 : getSpeciesname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", genusspeciesid=").append(genusspeciesid);
        sb.append(", genusname=").append(genusname);
        sb.append(", speciesname=").append(speciesname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}