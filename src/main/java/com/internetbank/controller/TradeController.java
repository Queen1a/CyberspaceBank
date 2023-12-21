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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @PostMapping("/All")
    public Result ResultgetTrageAll(@RequestBody String cards) {
        cards = cards.substring(10);
        ArrayList<String> list = new ArrayList<>(List.of(cards.split(",")));
        String cur = list.get(list.size() - 1).substring(0, 19);
        list.remove(list.size() - 1);
        list.add(cur);
        System.out.println(list);
        List<Trade> trades = tradeService.getTradeAll(list);
        return Result.success(trades);
    }
}
