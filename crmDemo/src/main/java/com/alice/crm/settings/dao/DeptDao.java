package com.alice.crm.settings.dao;

import com.alice.crm.settings.entity.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeptDao extends BaseMapper<Dept> {

    List<Dept> selectDepts();
}
