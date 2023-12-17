package com.internetbank.controller;


import com.internetbank.pojo.Result;
import com.internetbank.pojo.Trade;
import com.internetbank.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    /**
     * 新增 trade
     * @param trade
     * @return
     */
    @PostMapping()
    public Result insert(@RequestBody Trade trade){
        tradeService.insert(trade);
        return Result.success();
    }

    /**
     * 查询 trade
     * @param cardNumber1
     * @param type
     * @param begin
     * @param end
     * @return
     */
    @GetMapping()
    public Result getTrade(String cardNumber1, Short type,
                           @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime begin,
                           @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime end){
        List<Trade> trades = tradeService.list(cardNumber1, type, begin, end);
        return Result.success(trades);
    }
}
