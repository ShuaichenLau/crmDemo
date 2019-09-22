package com.alice.crm.settings.service;

import com.alice.crm.settings.entity.Dept;

import java.util.List;

public interface IDeptService {

    boolean insertDept(Dept dept);

    boolean deleteDept(Dept dept);

    boolean updateDept(Dept dept);

    Dept getDeptByDeptId(String deptId);

    List<Dept> getAllDept();
}
