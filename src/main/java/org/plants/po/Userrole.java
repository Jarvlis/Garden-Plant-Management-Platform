package org.plants.po;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户角色表
 * @TableName UserWithRole
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userrole implements Serializable {
    /**
     * 用户角色ID
     */
    private Integer userroleid;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 角色ID
     */
    private Integer roleid;

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
        Userrole other = (Userrole) that;
        return (this.getUserroleid() == null ? other.getUserroleid() == null : this.getUserroleid().equals(other.getUserroleid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getRoleid() == null ? other.getRoleid() == null : this.getRoleid().equals(other.getRoleid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserroleid() == null) ? 0 : getUserroleid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getRoleid() == null) ? 0 : getRoleid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userroleid=").append(userroleid);
        sb.append(", userid=").append(userid);
        sb.append(", roleid=").append(roleid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}