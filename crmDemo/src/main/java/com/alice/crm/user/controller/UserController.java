package com.alice.crm.user.controller;

import com.alice.crm.user.entity.User;
import com.alice.crm.user.service.IUserService;
import com.alice.crm.utils.GetTimeUUID;
import com.alice.crm.utils.NetoworkUtils;
import com.alice.crm.utils.RandomValueUtil;
import com.alice.crm.utils.UUIDutils;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * user Controller
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    /**
     * 添加user 随机生成一个user
     * @return
     */
    @ResponseBody
    @RequestMapping("/add")
    public String insertUser() {
        User user = new User();

        user.setId(GetTimeUUID.getGuid());
        user.setUserName(RandomValueUtil.getChineseName());
        user.setLoginAct(RandomValueUtil.getTelephone());
        user.setLoginPwd(DigestUtils.md5DigestAsHex("alice".getBytes()));
        user.setAllowIps(NetoworkUtils.getHostIp());
        user.setCreateBy("ABC");
        user.setCreateTime(new Date());
        user.setEditBy("DEF");
        user.setEditTime(new Date());
        user.setEmail(RandomValueUtil.getEmail(5,9));
        user.setLockStatus("0"); //待激活
//        user.setLoginPwd(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setPhone(RandomValueUtil.getTelephone());
        userService.insertUser(user);
        return user.toString();
    }

    /**
     * 显示所有user
     * @param model
     * @return
     */
    @RequestMapping("/showAllUser")
    public String getAllUserList(Model model) {
        List<User> byAllUser = userService.getByAllUser();
        model.addAttribute("logName","liusc");
        model.addAttribute("userList",byAllUser);
        return "user/showAllUser";
    }



}
