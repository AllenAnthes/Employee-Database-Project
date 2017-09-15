package com.allen.empdb.config;

import com.auth0.spring.security.api.JwtWebSecurityConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Value(value = "https://dbproto.auth0.com/")
    private String apiAudience;
    @Value(value = "empDbPrototype")
    private String issuer;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        JwtWebSecurityConfigurer
                .forRS256(apiAudience, issuer)
                .configure(http)
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "api/employees/login").permitAll()
                .antMatchers(HttpMethod.GET, "api/employees/**").permitAll()
                .antMatchers(HttpMethod.POST, "api/employees/**").hasAuthority("access:table")
                .antMatchers(HttpMethod.PUT, "api/employees/**").hasAuthority("access:table")
                .antMatchers(HttpMethod.DELETE, "api/employees/**").hasAuthority("access:table")
                .antMatchers(HttpMethod.GET, "api/users/**").hasAuthority("access:admin")
                .antMatchers(HttpMethod.POST, "api/users/**").hasAuthority("access:admin")
                .antMatchers(HttpMethod.PUT, "api/users/**").hasAuthority("access:admin")
                .antMatchers(HttpMethod.DELETE, "api/users/**").hasAuthority("access:admin")
                .anyRequest().authenticated();
    }
}