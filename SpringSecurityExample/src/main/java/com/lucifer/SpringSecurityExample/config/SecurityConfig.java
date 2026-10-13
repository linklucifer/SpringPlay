package com.lucifer.SpringSecurityExample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/* In this class we are going to modify the default filters given by the Spring Security */

@Configuration
@EnableWebSecurity  // this annotation will help us to enable our own security filters
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

//           disabling the csrf using lambda expressions
        httpSecurity.csrf(customizer -> customizer.disable());

//        it will preserve the login session inside the same window but when you try to log-in in other window the access will be denied
//        and, you have to authenticate yourself again in that particular window
        httpSecurity.authorizeHttpRequests(request -> request.anyRequest().authenticated());

//        by doing this you will get a new login form to logged-in in the new window
//        httpSecurity.formLogin(Customizer.withDefaults());

//        it will give you the access in the postman also
        httpSecurity.httpBasic(Customizer.withDefaults());

//        making our HTTP stateless so that we don't have to worry about the sessionIDs. To use this you have to disable the form login.
//        if you don't disable then you will get the form again and again but can be accessible in postman. SessionID will be keep changing and if you
//        try to log-in in the new window it will ask you to  login again.
        httpSecurity.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

/*
//        the above code was using Lambda expressions. Now we see how it actually works BTS using normal code
//        disabling the csrf. And this is how it is working behind the scene
        Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
            @Override
            public void customize(CsrfConfigurer<HttpSecurity> customizer) {
                customizer.disable();
            }
        };
 */

        return httpSecurity.build();
    }
}
