package com.example.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http,
	                                               @Qualifier("corsConfigurationSource") CorsConfigurationSource corsConfig) throws Exception {
	    http.csrf(csrf -> csrf.disable())
	        .cors(cors -> cors.configurationSource(corsConfig))
	        .authorizeHttpRequests(auth -> auth
	            // ✅ allow endpoints under /auth/*
	            .requestMatchers("/auth/**").permitAll()
	            .anyRequest().authenticated()
	        );

	    return http.build();
}
}