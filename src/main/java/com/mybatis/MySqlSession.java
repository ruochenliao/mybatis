package com.mybatis;

import java.lang.reflect.Proxy;

/**
 * 模拟 mybatis sqlSession
 */
public class MySqlSession {
    <T> T getMapper(Class<T> clazz) {
        Class[] clazzs = new Class[]{clazz};
        T object = (T) Proxy.newProxyInstance(MySqlSession.class.getClassLoader(), clazzs,
                new MyInvocationHandler());
        return object;
    }

    public void openSession() {
        System.out.println("open Session");
    }

    public void close() {
        System.out.println("close connection");
    }
}
