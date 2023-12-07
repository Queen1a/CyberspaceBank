package com.internetbank.mapper;


import com.internetbank.pojo.Card;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CardMapper {

    @Select("select * from card where cardId = #{id}")
    Card getByCardId(Integer id);

    @Select("select * from card where userId = #{id}")
    List<Card> getByUserId(Integer id);

    void update(Card card);

    @Insert("insert into card(cardNumber, cardPassword, userId, balance, status, openDate)" +
            "values (#{cardNumber}, #{cardPassword}, #{userId}, #{balance}, #{status}, #{openDate})")
    void insert(Card card);
}
