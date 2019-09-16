package com.alice.crm.dao;

import com.alice.crm.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao extends BaseMapper<User> {

    int insertUser(User record);

    int deleteUserById(@Param("userId") Integer userId);

    boolean updateUser(User userDomain);

    List<User> selectUsers();

    User getUserByUserId(@Param("userId") Integer userId);
}
