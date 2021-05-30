package com.kirantech.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class PersistanceConfiguration {
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder=DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/Conference_app");
        builder.username("postgres");
        builder.password("P@ss3993");
        System.out.println("Custom datasource bean is created..");
        return builder.build();
    }
}
