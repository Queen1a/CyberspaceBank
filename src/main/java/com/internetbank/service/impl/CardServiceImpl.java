package com.internetbank.service.impl;

import com.internetbank.mapper.CardMapper;
import com.internetbank.pojo.Card;
import com.internetbank.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardMapper cardMapper;

    @Override
    public Card getByCardId(Integer id) {
        return cardMapper.getByCardId(id);
    }

    @Override
    public List<Card> getByUserId(Integer id) {
        return cardMapper.getByUserId(id);
    }

    @Override
    public void update(Card card) {
        cardMapper.update(card);
    }

    @Override
    public void insert(Card card) {
        card.setOpenDate(LocalDateTime.now());
        cardMapper.insert(card);
    }
}
