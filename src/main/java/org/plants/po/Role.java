package org.plants.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色表
 * @TableName Role
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    /**
     * 角色ID
     */
    private Integer roleid;

    /**
     * 角色名
     */
    private String rolename;

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
        Role other = (Role) that;
        return (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()))
            && (this.getRolename() == null ? other.getRolename() == null : this.getRolename().equals(other.getRolename()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        result = prime * result + ((getRolename() == null) ? 0 : getRolename().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleid=").append(roleid);
        sb.append(", rolename=").append(rolename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}