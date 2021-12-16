package com.mybatis;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


/**
 * 生成 MyCityMapper 的 bean
 * @return
 * @throws Exception
 */
@Component
public class MyMapperFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        MySqlSession mySqlSession = new MySqlSession();
        MyCityMapper myCityMapper = mySqlSession.getMapper(MyCityMapper.class);
        return myCityMapper;
    }

    @Override
    public Class<?> getObjectType() {
        return MyCityMapper.class;
    }
}
