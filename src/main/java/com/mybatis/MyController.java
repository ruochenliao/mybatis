package com.mybatis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class MyController {

    @Resource
    private CityService cityService;

    @GetMapping("/myTest")
    public String myTest(){
        cityService.query();
        return "suceess";
    }

    //返回视图
    @GetMapping("/index")
    public String indexHtml(Model model) {
        //返回视图名字
        return "index";
    }
}