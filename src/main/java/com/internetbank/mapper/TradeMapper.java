package com.internetbank.mapper;

import com.internetbank.pojo.Trade;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface TradeMapper {

    @Insert("insert into trade(cardNumber1, type, money, tradeDate, cardNumber2) VALUES (#{cardNumber1}, #{type}, #{money}, #{tradeDate}, #{cardNumber2})")
    void insert(Trade trade);

    List<Trade> list(String cardNumber1, Short type, LocalDateTime begin, LocalDateTime end);
}
