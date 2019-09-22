package com.alice.crm.settings.service.impl;

import com.alice.crm.settings.dao.DeptDao;
import com.alice.crm.settings.entity.Dept;
import com.alice.crm.settings.service.IDeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements IDeptService {

    private final Logger logger = LoggerFactory.getLogger(DeptServiceImpl.class);

    @Autowired
    private DeptDao deptDao;


    @Override
    public boolean insertDept(Dept dept) {
        int insert = deptDao.insert(dept);
        if (insert > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteDept(Dept dept) {
        int count = deptDao.deleteById(dept);
        if (count > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateDept(Dept dept) {
        int count = deptDao.updateById(dept);
        if (count > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Dept getDeptByDeptId(String deptId) {
        Dept dept = deptDao.selectById(deptId);
        return dept;
    }

    @Override
    public List<Dept> getAllDept() {
        List<Dept> depts = deptDao.selectDepts();
        return depts;
    }
}
