package com.example.priefilterpostfilter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        var uds = new InMemoryUserDetailsManager();
        var user1 = User.withUsername("john")
                .password("12345")
                .roles("ADMIN")
                .build();
        var user2 = User.withUsername("mary")
                .password("12345")
                .roles("USER")
                .build();
        uds.createUser(user1);
        uds.createUser(user2);
        return uds;
    }
}
