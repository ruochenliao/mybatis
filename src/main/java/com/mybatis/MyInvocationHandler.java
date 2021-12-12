package com.mybatis;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //parse sql
        Select annotation = method.getAnnotation(Select.class);
        String sql = annotation.value()[0];
        //连接SQL session

        //exe sql
        System.out.println("exe sql");
        return null;
    }
}
