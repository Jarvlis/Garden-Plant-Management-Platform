package org.plants.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 用户表
* @TableName User
*/
@Data
public class User implements Serializable {

    /**
    * 用户ID
    */
    private Integer userid;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String userpassword;

    /**
    * 创建时间
    */
    private Date createdat;

    /**
    * 更新时间
    */
    private Date updatedat;
}
