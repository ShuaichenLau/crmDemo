package com.alice.crm.user.dao;

import com.alice.crm.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao extends BaseMapper<User> {

    int insertUser(User user);

    int deleteUserById(@Param("id") String userId);

    boolean updateUser(User userDomain);

    List<User> selectUsers();

    User getUserByUserId(@Param("id") String userId);

    User getUserByUser(@Param("loginAct")String loginAct, @Param("loginPwd")String password);
}
