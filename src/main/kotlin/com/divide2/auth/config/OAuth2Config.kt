package com.divide2.auth.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory
import java.security.KeyPair
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer
import org.springframework.core.io.ClassPathResource
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer



/**
 * @author bvvy
 * @date 2018/6/12
 */
@Configuration
@EnableAuthorizationServer
class OAuth2Config : AuthorizationServerConfigurerAdapter() {

//    @Bean
//    fun jwtAccessTokenConverter(): JwtAccessTokenConverter {
//        val converter = JwtAccessTokenConverter()
//        val keyPair = KeyStoreKeyFactory(
//                ClassPathResource("keystore.jks"), "foobar".toCharArray())
//                .getKeyPair("test")
//        converter.setKeyPair(keyPair)
//        return converter
//    }

    override fun configure(clients: ClientDetailsServiceConfigurer?) {
        clients!!.inMemory()
                .withClient("acme")
                .secret("acmesecret")
                .authorizedGrantTypes("authorization_code", "refresh_token",
                        "password").scopes("openid")
    }

//    override fun configure(endpoints: AuthorizationServerEndpointsConfigurer) {
//        endpoints.authenticationManager(authenticationManager).accessTokenConverter(
//                jwtAccessTokenConverter())
//    }

    override fun configure(oauthServer: AuthorizationServerSecurityConfigurer) {
        oauthServer.tokenKeyAccess("permitAll()").checkTokenAccess(
                "isAuthenticated()")
    }

}