package com.alice.crm.workbench.controller;

import com.alice.crm.user.entity.User;
import com.alice.crm.user.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/workbench")
public class workbenchController {

    private final Logger logger = LoggerFactory.getLogger(workbenchController.class);

    @Autowired
    private IUserService userService;

//    @RequestMapping("/index")
//    public String workbenchIndex(Model model, HttpServletRequest request, HttpServletResponse response) {
//        logger.info("com.alice.crm.workbench.controller.workbenchController.workbenchIndex");
//
//        String userName = request.getParameter("userName");
//        String password = request.getParameter("password");
//
//        System.out.println(userName);
//        System.out.println(password);
//
//        try {
//            if (userName != null && password != null) {
//                User byUser = userService.getByUser(userName, password);
//                if(byUser != null){
//                    model.addAttribute("byUser", byUser);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return "workbench/index.html";
//    }
}
