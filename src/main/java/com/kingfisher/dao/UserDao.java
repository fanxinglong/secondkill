package com.kingfisher.dao;

import com.kingfisher.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *这里如果不使用@Mapper 可以用mapper扫描
 * 此处如何交给spring管理的 并没有加注解
 * 是通过mapper prxoy代理模式生产的
 * Created by xinglongfan on 2018/1/10.
 */
@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    public User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name) values (#{id},#{name}) ")
    public boolean insertUser(User user);

}
