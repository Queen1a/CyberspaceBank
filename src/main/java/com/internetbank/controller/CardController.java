package com.internetbank.controller;

import com.internetbank.pojo.Card;
import com.internetbank.pojo.Result;
import com.internetbank.service.CardService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardService cardService;

    /**
     * 根据 cardId 查询 card
     * @param id
     * @return
     */
    @GetMapping("/byCardId/{id}")
    public Result getByCardId(@PathVariable Integer id){
        Card card = cardService.getByCardId(id);
        return Result.success(card);
    }

    /**
     * 根据 userId 查询 card
     * @param id
     * @return
     */
    @GetMapping("/byUserId/{id}")
    public Result getByUserId(@PathVariable Integer id){
        List<Card> cards = cardService.getByUserId(id);
        return Result.success(cards);
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
