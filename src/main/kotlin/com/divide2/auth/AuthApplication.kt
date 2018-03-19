package com.divide2.auth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

/**
 * Created by bvvy on 2018/3/17.
 * com.divide2
 */


@SpringBootApplication
@RestController
class AuthApplication {

    @GetMapping("/user")
    fun user(user: Principal): Principal {
        return user
    }


}


fun main(args: Array<String>) {
    runApplication<AuthApplication>(*args)
}