package com.mslfox.testcontainers.config;

import com.mslfox.testcontainers.sevice.DevProfile;
import com.mslfox.testcontainers.sevice.ProductionProfile;
import com.mslfox.testcontainers.sevice.SystemProfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${netology.profile.dev}")
    private boolean isDev;
    @Bean
    public SystemProfile getProfile() {
        return isDev ?
                new DevProfile() : new ProductionProfile();
    }
}
