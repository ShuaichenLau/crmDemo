package com.alice.crm.user.service;

import com.alice.crm.user.entity.User;

import java.util.List;

public interface IUserService {

    boolean insertUser(User user);

    int deleteUser(User user);

    User updateUser(User user);

    List<User> getByAllUser();

    User getByUserId(Integer userId);

    User getByUser(String userName, String password);

}
