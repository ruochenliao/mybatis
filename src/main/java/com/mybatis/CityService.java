package com.mybatis;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CityService {

    /**
     * cityMapper 是对象，被 jdk 动态代理产生的实例对象
     */
//    @Resource
//    private CityMapper cityMapper;

    public void query(){
        CityMapper cityMapper = (CityMapper) MySqlSession.getMapper(CityMapper.class);
        System.out.println(cityMapper.query());
    }
}
