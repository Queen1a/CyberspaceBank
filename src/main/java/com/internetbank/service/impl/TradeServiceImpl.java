package com.internetbank.service.impl;


import com.internetbank.mapper.TradeMapper;
import com.internetbank.pojo.Result;
import com.internetbank.pojo.Trade;
import com.internetbank.service.TradeService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class TradeServiceImpl implements TradeService {

    @Resource
    private TradeMapper tradeMapper;

    @Override
    public void insert(Trade trade) {
        trade.setTradeDate(new Date());
        tradeMapper.insert(trade);
    }

    @Override
    public List<Trade> getTrade(String cardId) {
        return tradeMapper.getTrade(cardId);
    }

    @Override
    public List<Trade> getTradeAll(List<String> cards) {
        return tradeMapper.getTradeAll(cards);
    }


}
