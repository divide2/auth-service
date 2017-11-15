package com.divide2.auth.controller;

import com.divide2.auth.model.User;
import com.divide2.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.time.LocalDateTime;

@RestController
public class UserController {

    @Autowired
    private IUserService userServiceImpl;
    
    @RequestMapping("/signUp")
    public void signUp(User user) {
        userServiceImpl.save(user);
    }

    @RequestMapping("/userInfo")
    public Principal user(Principal principal) {
        return principal;
    }
}
