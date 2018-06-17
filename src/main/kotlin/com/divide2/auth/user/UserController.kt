package com.divide2.auth.user

import org.hibernate.validator.constraints.Length
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.web.bind.annotation.*
import java.security.Principal
import java.util.HashMap
import javax.validation.constraints.NotEmpty


@RestController
class UserController(val userService: UserService) {

    @PostMapping(value = ["/user"])
    fun user(user: OAuth2Authentication,type: String): Map<String, Any> {
        val userInfo = HashMap<String, Any>()
        userInfo["user"] = user.userAuthentication.principal
        userInfo["authorities"] = AuthorityUtils.authorityListToSet(user.userAuthentication.authorities)
        println(type)
        return userInfo
    }

    @PostMapping("/v1/join")
    fun join(@RequestBody joinDto: JoinDto) {

        val user = User(
                password = joinDto.password,
                nickname = joinDto.account,
                phone = joinDto.account,
                username = joinDto.account,
                enabled = true)
        userService.save(user)
    }

}


data class JoinDto(
        @NotEmpty
        val account: String,

        @NotEmpty
        @Length(min = 8, max = 30)
        val password: String

)