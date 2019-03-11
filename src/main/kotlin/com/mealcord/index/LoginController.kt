package com.mealcord.index

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Controller
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/login")
class LoginController(restTemplateBuilder: RestTemplateBuilder) {
    val restTemplate = restTemplateBuilder.build()

    @GetMapping("/github/code")
    fun githubLoginCode(callbackData: AuthCallbackData) {
        val headers = HttpHeaders()
        headers.add("Accept", "application/json")
        val params = LinkedMultiValueMap<String, String>()
        params.add("code", callbackData.code)
        params.add("state", callbackData.state)

    }

}

data class AuthCallbackData(val code: String, val state: String)
data class AccessCallbackData(val access_token: String, val scope: String, val token_type: String)
