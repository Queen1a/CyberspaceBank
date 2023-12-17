package com.internetbank.service.impl;

import com.internetbank.mapper.AdminMapper;
import com.internetbank.pojo.Admin;
import com.internetbank.service.AdminService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;
    @Override
    public Admin getById(Integer id) {
        return adminMapper.getById(id);
    }

    @Override
    public void update(Admin admin) {
        adminMapper.update(admin);
    }

    @Override
    public void insert(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public void delete(Integer id) {
        adminMapper.delete(id);
    }
}
