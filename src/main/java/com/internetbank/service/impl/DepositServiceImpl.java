package com.internetbank.service.impl;

import com.internetbank.mapper.DepositMapper;
import com.internetbank.pojo.Deposit;
import com.internetbank.service.DepositService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DepositServiceImpl implements DepositService {

    @Resource
    private DepositMapper depositMapper;

    @Override
    public Deposit getById(String id) {
        return depositMapper.getById(id);
    }

    @Override
    public Deposit insert(Deposit deposit) {
        return depositMapper.insert(deposit);
    }
}
