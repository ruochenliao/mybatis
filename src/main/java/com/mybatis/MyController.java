package com.mybatis;

import com.mybatis.mapper.CityMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class MyController {

    @Resource
    private CityService cityService;

    @Resource
    private CityMapper cityMapper;

    @GetMapping("/myCity")
    public String myCity() {
        cityService.query();
        return "suceess";
    }

    @GetMapping("/city")
    public String getCity() {
        CityDTO cityDTO = cityMapper.query(1L);
        System.out.println(cityDTO.getCityName());
        return "suceess";
    }


    //返回视图
    @GetMapping("/index")
    public String indexHtml(Model model) {
        return "index";
    }
}