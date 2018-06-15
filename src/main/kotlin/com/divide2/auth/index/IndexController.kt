package com.divide2.auth.index

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

    @RequestMapping("/login")
    fun index(redirectUri: String?): String {
        return "redirect:/?redirectUri=$redirectUri"
    }
}

