package com.alice.crm.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("t_user")
public class User implements Serializable {

    @TableId
    private String id;  //  bigint       not null
    private String userName;  // varchar(255) not null,
    private String phone;  // varchar(255) not null,
    private String loginAct;  // varchar(255) null,
    private String loginPwd;  // varchar(255) null,
    private String email;  // varchar(255) null,
    private String lockStatus;  // varchar(255) null,
    private Date expireTime;  //   timestamp    null,
    private String allowIps;  // varchar(255) null,
    private String createBy;  // varchar(255) null,
    private Date createTime;  //       timestamp    null on update CURRENT_TIMESTAMP,
    private String editBy;  // varchar(255) null,
    private Date editTime;  //    timestamp    null on update CURRENT_TIMESTAMP

}
