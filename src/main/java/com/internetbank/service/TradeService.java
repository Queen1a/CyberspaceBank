package com.internetbank.service;

import com.internetbank.pojo.Trade;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface TradeService {
    void insert(Trade trade);

    List<Trade> getTrade(String cardId);

    List<Trade> getTradeAll(List<String> cards);
}
