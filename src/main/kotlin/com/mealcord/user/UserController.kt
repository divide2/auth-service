package com.mealcord.user

import org.hibernate.validator.constraints.Length
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.constraints.NotEmpty


@RestController
class UserController(val userService: UserService) {


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