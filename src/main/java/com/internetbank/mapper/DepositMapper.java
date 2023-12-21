package com.internetbank.mapper;

import com.internetbank.pojo.Deposit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepositMapper {

    @Select("select * from deposit where userId = #{id}")
    Deposit getById(String id);

    @Insert("insert into deposit(userId, userName, balance, term, startDate, endDate, account, rate) VALUES (#{userId}, #{userName}, #{balance}, #{term}, #{startDate}, #{endDate}, #{account}, #{rate})")
    Deposit insert(Deposit deposit);
}
