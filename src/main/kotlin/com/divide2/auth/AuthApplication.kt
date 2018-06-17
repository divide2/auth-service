package com.divide2.auth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


/**
 * Created by bvvy on 2018/3/17.
 * com.divide2
 */


@SpringBootApplication
@RestController
@EnableAuthorizationServer
@EnableResourceServer
@EnableOAuth2Client
class AuthApplication

fun main(args: Array<String>) {
    runApplication<AuthApplication>(*args)
}