package com.alice.crm.settings.controller;

import com.alice.crm.settings.entity.Dept;
import com.alice.crm.settings.service.impl.DeptServiceImpl;
import com.alice.crm.utils.GetTimeUUID;
import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
@RequestMapping("/settings")
public class SettingsController {

    private final Logger logger = LoggerFactory.getLogger(SettingsController.class);

    @Autowired
    private DeptServiceImpl deptService;

    @RequestMapping("/index")
    public String settingsIndex(Model model, HttpServletRequest request, HttpServletResponse response) {
        logger.info("com.alice.crm.settings.controller.SettingsController.settingsIndex");
        return "settings/index";
    }

    /**
     * 部门列表首页
     *
     * @param model
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("dept/index")
    public String deptIndex(Model model, HttpServletRequest request, HttpServletResponse response) {
        return "settings/dept/index";
    }

    /**
     * 部门添加
     * @param model
     * @param request
     * @param response
     * @param name 部门名称
     * @param phone 部门电话
     * @param manager 部门负责人
     * @param describe 部门描述
     * @return
     */
    @ResponseBody
    @RequestMapping("dept/add")
    public Map<String, String> deptAdd(Model model, HttpServletRequest request, HttpServletResponse response,
                                       @RequestParam("name") String name, @RequestParam("phone") String phone,
                                       @RequestParam("manager") String manager, @RequestParam("describe") String describe) {
        logger.info("com.alice.crm.settings.controller.SettingsController.deptAdd");

        Map<String, String> returnMaps = Maps.newHashMap();

        Dept dept = new Dept();
        dept.setDeptId(GetTimeUUID.getGuid());
        dept.setDeptName(name);
        dept.setDeptManager(manager);
        dept.setDeptPhone(phone);
        dept.setDeptDescribe(describe);
        boolean insertFlag = deptService.insertDept(dept);

        if (insertFlag) {
            returnMaps.put("success","0");

        } else {
            returnMaps.put("success","1");
        }
        return returnMaps;
    }


}
