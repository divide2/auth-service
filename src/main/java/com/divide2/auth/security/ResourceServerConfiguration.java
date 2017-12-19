package com.divide2.auth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


/**
 * @author  bvvy
 * 定义资源授权
 */
@Deprecated
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {



    @Override
    public void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/signUp").permitAll();
    }
}
