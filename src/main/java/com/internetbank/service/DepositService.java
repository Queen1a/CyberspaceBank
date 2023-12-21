package com.internetbank.service;

import com.internetbank.pojo.Deposit;

public interface DepositService {
    Deposit getById(String id);

    Deposit insert(Deposit deposit);
}
