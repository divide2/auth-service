package com.divide2.auth.service;

import com.divide2.auth.model.User;

public interface IUserService {

    void save(User user);

    User getByUsername(String username);


}
