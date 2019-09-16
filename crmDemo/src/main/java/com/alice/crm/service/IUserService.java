package com.alice.crm.service;

import com.alice.crm.entity.User;

import java.util.List;

public interface IUserService {

    boolean insertUser(User user);

    int deleteUser(User user);

    User updateUser(User user);

    List<User> getByAllUser();

    User getByUserId(Integer userId);

}
