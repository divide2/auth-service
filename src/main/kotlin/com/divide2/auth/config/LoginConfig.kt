package com.divide2.auth.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import javax.sql.DataSource
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.authentication.AuthenticationManager



/**
 * Created by bvvy on 2018/3/18.
 * com.divide2.auth.config
 */
@Configuration
class LoginConfig(val dataSource: DataSource) : WebSecurityConfigurerAdapter() {

    @Bean
    override fun authenticationManagerBean(): AuthenticationManager {
        return super.authenticationManagerBean()
    }

    @Bean
    override fun userDetailsServiceBean(): UserDetailsService {
        return super.userDetailsServiceBean()
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        /*auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(passwordEncoder())
                .usersByUsernameQuery(
                        "select username,password,enabled from sys_user u where u.username = ?"
                )
                .authoritiesByUsernameQuery(
                        "select u.username,'ROLE_USER' from sys_user u where u.username = ?"
                )*/
        auth
                .inMemoryAuthentication()
                .withUser("john.carnell").password("password1").roles("USER")
                .and()
                .withUser("william.woodward").password("password2").roles("USER", "ADMIN");
    }


    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

}