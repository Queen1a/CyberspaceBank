package com.internetbank.controller;


import com.internetbank.pojo.Result;
import com.internetbank.pojo.Trade;
import com.internetbank.service.TradeService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/trade")
public class TradeController {

    @Resource
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
     */
    @GetMapping()
    public Result getTrade(@RequestParam String cardId){

        List<Trade> trades = tradeService.getTrade(cardId);
        return Result.success(trades);
    }
}
