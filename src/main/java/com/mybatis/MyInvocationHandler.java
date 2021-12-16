package com.mybatis;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author john
 */
public class MyInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //parse sql， 实际是从 registery 注册表里取到的 SQL， 注册表在启动的时候把 interface 和 xml 的SQL id 用map 存起来了
        Select annotation = method.getAnnotation(Select.class);
        String sql = annotation.value()[0];
        //执行 SQL
        System.out.println("exe sql:" + sql);
        return null;
    }
}
