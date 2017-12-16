package com.divide2.auth.security;

import com.divide2.auth.service.IUserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class JWTTokenEnhancer implements TokenEnhancer {

    @Resource
    private IUserService userServiceImpl;


    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {

        Map<String, Object> additionInfo = new HashMap<>();
        additionInfo.put("id", (userServiceImpl.getByUsername(oAuth2Authentication.getName())).getId());
        ((DefaultOAuth2AccessToken)oAuth2AccessToken).setAdditionalInformation(additionInfo);
        return oAuth2AccessToken;
    }
}
