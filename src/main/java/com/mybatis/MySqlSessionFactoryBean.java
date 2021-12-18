package com.mybatis;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * 模拟 mybatis sqlSession
 */
@Component
public class MySqlSessionFactoryBean implements FactoryBean {

    <T> T getMapper(Class<T> clazz) {
        Class[] clazzs = new Class[]{clazz};
        T object = (T) Proxy.newProxyInstance(MySqlSessionFactoryBean.class.getClassLoader(), clazzs,
                new MyInvocationHandler());
        return object;
    }

    public void openSession() {
        System.out.println("open Session");
    }

    public void close() {
        System.out.println("close connection");
    }

    @Override
    public Object getObject() throws Exception {
        openSession();
        close();
        return new MySqlSessionFactoryBean();
    }

    @Override
    public Class<?> getObjectType() {
        return MySqlSessionFactoryBean.class;
    }
}
