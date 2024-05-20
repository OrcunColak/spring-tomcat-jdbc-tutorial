package com.colak.springconnectionpooltutorial.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatJDBCConfig {

    @Bean
    public DataSource dataSource(DataSourceProperties properties) {
        DataSource dataSource = new DataSource();
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());
        dataSource.setMaxActive(20);
        dataSource.setInitialSize(10);
        dataSource.setMaxWait(20000);
        return dataSource;
    }
}