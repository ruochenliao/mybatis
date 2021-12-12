package com.mybatis;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyMapperFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        CityMapper cityMapper = (CityMapper) MySqlSession.getMapper(CityMapper.class);
        return cityMapper;
    }

    @Override
    public Class<?> getObjectType() {
        return CityMapper.class;
    }
}
