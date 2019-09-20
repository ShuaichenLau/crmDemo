package com.alice.crm.login.controller;

import com.alice.crm.user.entity.User;
import com.alice.crm.user.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class LoginController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private IUserService userService;

    /**
     * 登录
     *
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/login")
    public String login(@RequestParam("userName") String username, @RequestParam("password") String password,
                        Model model, HttpServletRequest request, HttpServletResponse response) {
        logger.info("com.alice.crm.login.controller.LoginController.login");

        // MD5加密
        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
        if (username != null && md5Password != null) {
            User byUser = userService.getByUser(username, md5Password);
            if (byUser != null) {
                model.addAttribute("byUser", byUser);
                model.addAttribute("errInfo","用户名OR密码不正确");
                return "workbench/index.html";
            }
        }
        return "login";
    }
}
