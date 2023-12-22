package com.internetbank.service.impl;

import com.internetbank.mapper.DepositMapper;
import com.internetbank.pojo.Deposit;
import com.internetbank.service.DepositService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DepositServiceImpl implements DepositService {

    @Resource
    private DepositMapper depositMapper;

    @Override
    public List<Deposit> getById(String id) {
        return depositMapper.getById(id);
    }

    @Override
    public void insert(Deposit deposit) {
        depositMapper.insert(deposit);
    }
}
