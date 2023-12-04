package org.plants.pojo;

import lombok.Data;
import org.plants.po.User;

import java.io.Serializable;

/**
 * Author:Jarvlis
 * Date:2023-12-03
 * Time:19:49
 */
@Data
public class UserWithRole extends User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String rolename;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", createdat=").append(createdat);
        sb.append(", updatedat=").append(updatedat);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", userstatus=").append(userstatus);
        sb.append(", rolename=").append(rolename);
        sb.append("]");
        return sb.toString();
    }
}
