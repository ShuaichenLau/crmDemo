package com.alice.crm.workbench.controller;

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
public class WorkbenchController {

    private final Logger logger = LoggerFactory.getLogger(WorkbenchController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String idnex(Model model, HttpServletRequest request, HttpServletResponse response) {
        return "/workbench/index";
    }

    @RequestMapping("/main/index")
    public String mainIndex(Model model, HttpServletRequest request, HttpServletResponse response) {
        return "/workbench/main/index";
    }

}
