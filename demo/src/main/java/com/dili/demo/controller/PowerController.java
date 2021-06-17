package com.dili.demo.controller;

import com.dili.demo.tddomain.ElectricPower;
import com.dili.demo.tdmapper.ElectricPowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    ElectricPowerMapper electricPowerMapper;
    /**
     * 执行login请求，跳转到Main页面或者返回login页面
     *
     * @param electricPower
     * @param modelMap
     * @param request
     * @return
     */
    @PostMapping(value = "/list")
    public List<ElectricPower> list(ElectricPower electricPower, ModelMap modelMap, HttpServletRequest request) {
        List<ElectricPower> select = electricPowerMapper.select(1, 0);
        return select;
    }
}
