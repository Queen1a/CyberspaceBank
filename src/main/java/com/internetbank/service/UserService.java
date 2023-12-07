package com.internetbank.service;

import com.internetbank.pojo.User;

public interface UserService {
    User getById(Integer id);

    void insert(User user);

    void update(User user);

    void delete(Integer id);
}
