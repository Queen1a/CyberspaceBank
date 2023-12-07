package com.internetbank.service;

import com.internetbank.pojo.Card;

import java.util.List;

public interface CardService {
    Card getByCardId(Integer id);

    List<Card> getByUserId(Integer id);

    void update(Card card);

    void insert(Card card);
}
