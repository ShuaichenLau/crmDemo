package com.alice.crm.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Data
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


//    private String id; // 字段id
//    private String loginAct; // 字段loginAct
//    private String loginPwd; // 字段loginPwd
//    private String name; // 字段name
//    private String email; // 字段email
//    private String lockStatus; // 字段lockStatus
//    private String expireTime; // 字段expireTime
//    private String allowIps; // 字段allowIps
//    private String deptId; // 字段deptId
//    private String createBy; // 字段createBy
//    private String createTime; // 字段createTime
//    private String editBy; // 字段updateBy
//    private String editTime; // 字段updateTime
//
//
//    private Integer userId; //int(11) NOT NULL AUTO_INCREMENT,
//    private String userName; //varchar(255) NOT NULL,
//    private String password; //varchar(255) NOT NULL,
//    private String phone; //varchar(255) NOT NULL,
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId='" + userId + '\'' +
//                ", userName='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
}
