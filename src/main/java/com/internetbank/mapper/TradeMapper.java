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

    @Insert("insert into trade VALUES (null,#{cardId},#{type},#{tradeAmount},#{tradeDate},#{tradeAccount},#{balance},#{notes})")
    void insert(Trade trade);

    @Select("select * from trade where cardId = #{cradId}")
    List<Trade> getTrade(String cardId);
}
