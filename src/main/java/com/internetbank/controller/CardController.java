package com.internetbank.controller;

import com.internetbank.pojo.Card;
import com.internetbank.pojo.Result;
import com.internetbank.pojo.Trade;
import com.internetbank.service.CardService;
import com.internetbank.service.TradeService;
import com.internetbank.service.UserService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/card")
public class CardController {

    @Resource
    private CardService cardService;
    @Resource
    private UserService userService;
    @Resource
    private TradeService tradeService;



    @GetMapping("/transfer")
    public Result transfer(@RequestParam String cardId1, @RequestParam String cardId2, @RequestParam double money, @RequestParam String payee){
        if(cardService.getByCardId(cardId2) == null){
            return Result.error("卡号不存在");
        }
        String userId = cardService.getByCardId(cardId2).getUserId();
        String n = userService.getById(userId).getUserName();
        Card c1 = new Card(),c2 = new Card();
        Trade t1 = new Trade(),t2 = new Trade();
        c1.setCardId(cardId1);
        c1.setBalance(cardService.getByCardId(cardId1).getBalance()-money);
        c2.setCardId(cardId2);
        c2.setBalance(cardService.getByCardId(cardId2).getBalance()+money);
        t1.setCardId(cardId1);
        t1.setBalance(cardService.getByCardId(cardId1).getBalance()-money);
        t1.setTradeAccount(cardId2);
        t1.setTradeAmount(-money);
        t1.setTradeDate(new Date());
        t1.setType("转账");
        t1.setNotes("转账");
        t2.setCardId(cardId2);
        t2.setBalance(cardService.getByCardId(cardId2).getBalance()+money);
        t2.setTradeAccount(cardId1);
        t2.setTradeAmount(money);
        t2.setTradeDate(new Date());
        t2.setType("转账");
        t2.setNotes("收款");
        if(!Objects.equals(n, payee)){
            return Result.error("信息错误");
        }else{
            cardService.update(c1);
            cardService.update(c2);
            tradeService.insert(t1);
            tradeService.insert(t2);
            return Result.success();
        }
    }

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

    @PostMapping("/getAll")
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
