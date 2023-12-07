package com.internetbank.mapper;


import com.internetbank.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where userId = #{id}")
    User getById(Integer id);

    @Insert("insert into user(userName, gender, age, telephone, address)" +
            "values (#{userName}, #{gender}, #{age}, #{telephone}, #{address})")
    void insert(User user);

    void update(User user);

    @Delete("delete from user where userId = #{id}")
    void delete(Integer id);
}
