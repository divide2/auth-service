package com.divide2.auth.controller;

import com.divide2.auth.model.po.User;
import com.divide2.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/v1/admin/user")
public class UserController {

    private final IUserService userServiceImpl;

    @Autowired
    public UserController(IUserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @RequestMapping("/signUp")
    public void signUp(User user) {
        userServiceImpl.save(user);
    }

    @RequestMapping("/userInfo")
    public Principal user(Principal principal) {
        return principal;
    }
}
