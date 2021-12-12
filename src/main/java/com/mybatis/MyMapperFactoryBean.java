package com.mybatis;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyMapperFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        MyCityMapper myCityMapper = (MyCityMapper) MySqlSession.getMapper(MyCityMapper.class);
        return myCityMapper;
    }

    @Override
    public Class<?> getObjectType() {
        return MyCityMapper.class;
    }
}
