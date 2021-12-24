package com.mybatis;

/**
 * 启动后访问
 * 1、访问 http://localhost:8080/city 即可得到正常的 mybatis
 * 2、访问 http://localhost:8080/myCity 来模拟 mybatis 原理
 * 3、MyBatis只需要声明接口即可调用SQL是怎么做到的？
 *      3.1 通过改变bean的生成方式，启动时候，生成 mybatis 接口的动态代理
 *      3.2 生成动态代理的时候，扫描 mybatis 的配置，比如 @annotation sql 或者 xml sql，获得需要执行的SQL语句
 *      3.3 把生成好的 mybatis 代理放入到 sqlSession bean 中
 *      3.4 使用的时候先开启 session, 获取需要执行 mapper 接口，再关闭 session
 *
 *        //获取session
 *         SqlSession session = sqlSessionFactory.openSession();
 *         //获取mapper接口的代理对象
 *         UserMapper userMapper = session.getMapper(UserMapper.class);
 *         //调用代理对象方法
 *         User user = userMapper.findUserById(27);
 *         System.out.println(user);
 *         //关闭session
 *         session.close();
 *         System.out.println("---------执行完毕-----------");
 * 参考： Mybatis中Mapper动态代理的实现原理: https://blog.csdn.net/xiaokang123456kao/article/details/76228684
 */
public class Readme {

}
