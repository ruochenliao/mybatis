package com.mybatis;

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

    /**
     * 模拟 mybatis
     * @return
     */
    @GetMapping("/myCity")
    public String myCity() {
        cityService.query();
        return "suceess";
    }

    /**
     * 正常的 mybatis
     *
     * @return
     */
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