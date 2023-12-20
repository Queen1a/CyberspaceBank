package com.internetbank.controller;

import com.internetbank.pojo.Card;
import com.internetbank.pojo.Result;
import com.internetbank.service.CardService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Resource
    private CardService cardService;

    /**
     * 根据 cardId 查询 card
     * @param id
     * @return
     */

    /**
     * 根据 userId 查询 card
     * @param userId
     * @return
     */
    @GetMapping("/byUserId")
    public Result getByUserId(@RequestParam String userId){
        List<Card> cards = cardService.getByUserId(userId);
        return Result.success(cards);
    }

    @GetMapping("/getAll")
    public Result getAll(@RequestParam String userId){

        List<Card> cards = cardService.getByUserId(userId);
        Integer num = cards.size();
        double total = 0;
        for(Integer i = 0; i < num; i ++){
            Card card = cards.get(i);
            total += card.getBalance();
        }
        return Result.success(total);
    }

    /**
     * 根据 cardId 更新 card
     * @param card
     * @return
     */
    @PutMapping()
    public Result update(@RequestBody Card card){
        cardService.update(card);
        return Result.success();
    }

    @PostMapping()
    public Result insert(@RequestBody Card card){
        cardService.insert(card);
        return Result.success();
    }
}
