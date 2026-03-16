package ru.job4j.bmb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class AppConfig {
        @Value("${telegram.bot.name}")
        private String botName;}

