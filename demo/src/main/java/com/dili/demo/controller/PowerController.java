package com.dili.demo.controller;

import com.dili.demo.domain.User;
import com.dili.demo.mapper.UserMapper;
import com.dili.demo.service.UserService;
import com.dili.demo.tddomain.ElectricPower;
import com.dili.demo.mapper.ElectricPowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: WM
 * @time: 2021/6/17 16:32
 */
@Controller
@RequestMapping("/power")
public class PowerController {

    @Autowired
    UserService userService;
    /**
     * 执行login请求，跳转到Main页面或者返回login页面
     *
     * @param electricPower
     * @param modelMap
     * @param request
     * @return
     */
    @PostMapping(value = "/list")
    @ResponseBody
    public List<User> list(ElectricPower electricPower, ModelMap modelMap, HttpServletRequest request) {
        List<User> users = userService.selectAll();
        List<ElectricPower> electricPowers = userService.selectElectricPower();
        System.out.println(electricPowers);
        return users;
    }
}
