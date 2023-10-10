package com.hertever.shriganeshkisanvitaran.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import java.util.Optional;

@Configuration
@EnableMongoAuditing
public class AuditingConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        // Implement your logic to provide the current user or system
        // For example, you can obtain the currently authenticated user from Spring Security
        return () -> Optional.of("system"); // Return "system" as an example
    }
}