package com.example.homework002.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSources = new DriverManagerDataSource();
        dataSources.setDriverClassName("org.postgresql.Driver");
        dataSources.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSources.setUsername("postgres");
        dataSources.setPassword("1234");

        return dataSources;
    }

}

