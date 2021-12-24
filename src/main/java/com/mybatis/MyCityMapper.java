package com.mybatis;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 1、sqlSessionFactory 配置
 * 2、连接池配置
 * 3、Mapper interface
 * 4、SQL: 注解或xml
 * 5、使用 mybatis的MapperFactoryBean 交给 Spring IOC 容器管理
 *
 *
 *
 *
 */
public interface MyCityMapper {

    @Select("select * from city")
    List<Map<String, Object>> query();
}
