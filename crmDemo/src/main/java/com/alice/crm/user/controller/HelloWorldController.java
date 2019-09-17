package com.alice.crm.user.controller;

import com.alice.crm.user.entity.Person;
import com.alice.crm.user.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * HelloWorldDemo
 */
@Controller
@RequestMapping("/")
public class HelloWorldController {

    private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Resource
    private DataSource dataSource;

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/showConfig")
    public String index() {

        logger.info("com.alice.hikaricp.controller.HelloWorldController.index");

        logger.info("dataSource ==>  " + dataSource.getClass());

        logger.info("userService ==>  " + userService.getClass());

        return "Greetings from Spring Boot! ";
    }

    @RequestMapping("/demo")
    public String indexHtml(Model model) {

        Person single = new Person("hyj", 21);
        List<Person> peopleList = new ArrayList<Person>();
        Person p1 = new Person("dlp", 21);
        Person p2 = new Person("tq", 21);
        Person p3 = new Person("mk", 21);
        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", peopleList);
        return "indexDemo";
    }


    /**
     * 页面入口 登录
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model) {
        logger.info("com.alice.crm.controller.HelloWorldController.index");
        return "login";
    }

}
