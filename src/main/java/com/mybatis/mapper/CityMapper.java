package com.mybatis.mapper;


import com.mybatis.CityDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author john
 * @Mapper 注解的的作用
 * 记得idea 需要安装 Free mybatis plugin
 * 1:为了把mapper这个DAO交給Spring管理
 * 2:为了不再写mapper映射文件
 * 3:为了给mapper接口 自动根据一个添加@Mapper注解的接口生成一个实现类
 */
@Mapper
@Repository
public interface CityMapper {
    /**
     *
     * @param id
     * @return
     */
    CityDTO query(@Param("id") Long id);
}
