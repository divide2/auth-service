package com.divide2.auth.controller;

import com.divide2.auth.model.po.User;
import com.divide2.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final IUserService userServiceImpl;

    @Autowired
    public UserController(IUserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/signup")
    public void signUp(User user) {
        userServiceImpl.save(user);
    }

}
