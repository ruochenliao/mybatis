package com.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface CityMapper {

    @Select("select * from city")
    List<Map<String, Object>> query();

    CityDTO findUnique(Long id);
}
