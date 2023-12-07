package com.internetbank.mapper;

import com.internetbank.pojo.Admin;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AdminMapper {
    @Select("select * from admin where adminId = #{id}")
    Admin getById(Integer id);

    void update(Admin admin);

    @Insert("insert into admin(adminName, password) VALUES (#{adminName}, #{password})")
    void insert(Admin admin);

    @Delete("delete from admin where adminId = #{id}")
    void delete(Integer id);
}
