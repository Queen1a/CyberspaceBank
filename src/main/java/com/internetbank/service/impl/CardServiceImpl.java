package com.internetbank.service.impl;

import com.internetbank.mapper.CardMapper;
import com.internetbank.pojo.Card;
import com.internetbank.service.CardService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Resource
    private CardMapper cardMapper;

    @Override
    public Card getByCardId(String id) {
        return cardMapper.getByCardId(id);
    }

    @Override
    public List<Card> getByUserId(String id) {
        System.out.println("2");
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

    @Override
    public Card getByTelephone(String telephone) {
        return cardMapper.getByTelephone(telephone);
    }
}
