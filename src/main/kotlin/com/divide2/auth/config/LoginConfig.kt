package com.divide2.auth.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer
import javax.sql.DataSource

/**
 * Created by bvvy on 2018/3/18.
 * com.divide2.auth.config
 */
@Configuration
class LoginConfig(val dataSource: DataSource) : WebSecurityConfigurerAdapter() {


    override fun configure(http: HttpSecurity) {
        http
                .csrf().disable()
                .httpBasic()
                .and().formLogin()
                .and().logout()
                .and()
                .authorizeRequests()
                .antMatchers("/", "/login/**", "/v1/join").permitAll()
                .anyRequest()
                .authenticated()
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(passwordEncoder())
                .usersByUsernameQuery(
                        "select username,password,enabled from sys_user u where u.username = ?"
                )
                .authoritiesByUsernameQuery(
                        "select u.username,'ROLE_USER' from sys_user u where u.username = ?"
                )
    }


    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

}