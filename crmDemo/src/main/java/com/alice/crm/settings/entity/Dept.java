package com.alice.crm.settings.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_dept")
public class Dept implements Serializable {

    @TableId
    private String deptId;  //bigint(30) NOT NULL COMMENT '编号',
    private String deptName;  //varchar(255) DEFAULT NULL COMMENT '名称',
    private String deptManager;  //varchar(255) DEFAULT NULL COMMENT '负责人',
    private String deptPhone;  //varchar(255) DEFAULT NULL COMMENT '电话',
    private String deptDescribe;  //varchar(255) DEFAULT NULL COMMENT '部门描述',

}
