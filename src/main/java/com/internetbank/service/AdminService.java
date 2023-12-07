package com.internetbank.service;

import com.internetbank.pojo.Admin;
import com.internetbank.pojo.Result;

public interface AdminService {
    Admin getById(Integer id);

    void update(Admin admin);

    void insert(Admin admin);

    void delete(Integer id);
}
