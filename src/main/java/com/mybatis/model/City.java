package com.mybatis.model;

import java.io.Serializable;

public class City implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.id
     *
     * @mbggenerated Sun Dec 19 16:52:06 CST 2021
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column city.city_name
     *
     * @mbggenerated Sun Dec 19 16:52:06 CST 2021
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table city
     *
     * @mbggenerated Sun Dec 19 16:52:06 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.id
     *
     * @return the value of city.id
     *
     * @mbggenerated Sun Dec 19 16:52:06 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.id
     *
     * @param id the value for city.id
     *
     * @mbggenerated Sun Dec 19 16:52:06 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column city.city_name
     *
     * @return the value of city.city_name
     *
     * @mbggenerated Sun Dec 19 16:52:06 CST 2021
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column city.city_name
     *
     * @param cityName the value for city.city_name
     *
     * @mbggenerated Sun Dec 19 16:52:06 CST 2021
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}