package com.internetbank.service;

import com.internetbank.pojo.Deposit;

import java.util.List;

public interface DepositService {
    List<Deposit> getById(String id);

    void insert(Deposit deposit);
}
