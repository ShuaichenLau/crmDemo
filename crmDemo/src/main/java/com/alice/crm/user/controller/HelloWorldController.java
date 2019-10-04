package com.alice.crm.user.controller;

import com.alice.crm.commons.kafka.KafkaSender;
import com.alice.crm.user.entity.Person;
import com.alice.crm.user.service.IUserService;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.*;

/**
 * HelloWorldDemo
 */
@Controller
@RequestMapping("/")
@Slf4j
public class HelloWorldController {

    @Resource
    private DataSource dataSource;

    @Autowired
    private IUserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private KafkaSender kafkaSender;

    @ResponseBody
    @RequestMapping("/showConfig")
    public String index() {

        log.info("com.alice.hikaricp.controller.HelloWorldController.index");

        log.info("dataSource ==>  " + dataSource.getClass());

        log.info("userService ==>  " + userService.getClass());

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

    @ResponseBody
    @RequestMapping("/redisDemo")
    public String redisDemo(Model model) {
        log.info("com.alice.crm.user.controller.HelloWorldController.redisDemo");
        HashOperations<String, String, String> hashOperations = redisTemplate.opsForHash();
//        redisTemplate.opsForValue();//操作字符串
//        redisTemplate.opsForHash();//操作hash
//        redisTemplate.opsForList();//操作list
//        redisTemplate.opsForSet();//操作set
//        redisTemplate.opsForZSet();//操作有序set

        Set<String> keys = hashOperations.keys("alice");
        for (int i = keys.size(); i < keys.size() + 10; i++) {
            hashOperations.put("alice", i + "-alice", UUID.randomUUID().toString().replaceAll("-", ""));
        }

        StringBuffer stringBuffer = new StringBuffer();

        for (String key : hashOperations.keys("alice")) {
            String str = hashOperations.get("alice", key);
            stringBuffer.append(key)
                    .append("==>")
                    .append(str)
                    .append(System.getProperty("line.separator"));
        }

        return stringBuffer.toString();
    }

    @ResponseBody
    @RequestMapping("/kafkaDemo")
    public String kafkaDemo(Model model){

        for (int i = 0; i < 10; i++) {
            kafkaSender.send();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return "kafkaDemo";
    }

    /**
     * 页面入口 登录
     *
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model) {
        log.info("com.alice.crm.controller.HelloWorldController.index");
        return "login";
    }

}
