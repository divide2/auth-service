package com.divide2.auth.index

import com.divide2.auth.config.ClientResources
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Controller
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/login")
class LoginController(restTemplateBuilder: RestTemplateBuilder,
                      val github: ClientResources) {
    val restTemplate = restTemplateBuilder.build()

    @GetMapping("/github/code")
    fun githubLoginCode(callbackData: AuthCallbackData) {
        val headers = HttpHeaders()
        headers.add("Accept", "application/json")
        val params = LinkedMultiValueMap<String, String>()
        params.add("client_id", github.client.clientId)
        params.add("client_secret", github.client.clientSecret)
        params.add("code", callbackData.code)
        params.add("state", callbackData.state)
        println(params)
//        params.add("redirect_uri", "$redirectUri/access")
//        val requestEntity = HttpEntity<MultiValueMap<String, String>>(params, headers)
//        val accessData = restTemplate.postForObject<AccessCallbackData>(accessUrl, requestEntity)
//        this.getUserInfo(accessData)
//        return "redirect:$redirectFrontUrl?token=${accessData?.access_token}"
    }

}

data class AuthCallbackData(val code: String, val state: String)
data class AccessCallbackData(val access_token: String, val scope: String, val token_type: String)
