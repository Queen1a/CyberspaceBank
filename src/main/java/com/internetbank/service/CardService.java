package com.internetbank.service;

import com.internetbank.pojo.Card;

import java.util.List;

public interface CardService {
    Card getByCardId(String id);

    List<Card> getByUserId(String id);

    void update(Card card);

    void insert(Card card);
}
