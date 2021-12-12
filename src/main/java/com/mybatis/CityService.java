package com.mybatis;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CityService {

    /**
     * myCityMapper 是对象，被 jdk 动态代理产生的实例对象
     */
    @Resource
    private MyCityMapper myCityMapper;

    public void query(){
        myCityMapper.query();
    }
}
