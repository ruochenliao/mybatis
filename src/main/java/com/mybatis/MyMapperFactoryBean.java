package com.mybatis;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * 生成 MyCityMapper 的 bean
 * @return
 * @throws Exception
 */
@Component
public class MyMapperFactoryBean implements FactoryBean {

    @Resource
    private MySqlSessionFactoryBean mySqlSession;

    @Override
    public Object getObject() throws Exception {
        MyCityMapper myCityMapper = mySqlSession.getMapper(MyCityMapper.class);
        return myCityMapper;
    }

    @Override
    public Class<?> getObjectType() {
        return MyCityMapper.class;
    }
}
