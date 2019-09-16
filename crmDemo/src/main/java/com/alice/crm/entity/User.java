package com.alice.crm.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String id; // 字段id
    private String loginAct; // 字段loginAct
    private String loginPwd; // 字段loginPwd
    private String name; // 字段name
    private String email; // 字段email
    private String lockStatus; // 字段lockStatus
    private String expireTime; // 字段expireTime
    private String allowIps; // 字段allowIps
    private String deptId; // 字段deptId
    private String createBy; // 字段createBy
    private String createTime; // 字段createTime
    private String editBy; // 字段updateBy
    private String editTime; // 字段updateTime


    private Integer userId; //int(11) NOT NULL AUTO_INCREMENT,
    private String userName; //varchar(255) NOT NULL,
    private String password; //varchar(255) NOT NULL,
    private String phone; //varchar(255) NOT NULL,

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
