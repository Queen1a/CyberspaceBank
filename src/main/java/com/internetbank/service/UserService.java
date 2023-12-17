package com.internetbank.service;

import com.internetbank.pojo.User;

public interface UserService {
    User getById(String id);

    void insert(User user);

    void update(User user);

    void delete(String id);
}
