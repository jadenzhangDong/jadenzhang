package com.jadenzhang.springboottest.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name="test1DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.test1.hikari")
    public DataSource test1DataSource(){
        DataSourceProperties properties = this.test1DataSourceProperties();
        return createHikariDataSource(properties);
    }

    @Primary
    @Bean(name="test1DataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.test1")
    public DataSourceProperties test1DataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean(name="test2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.test2.hikari")
    public DataSource test2DataSource(){
        DataSourceProperties properties = this.test2DataSourceProperties();
        return createHikariDataSource(properties);
    }

    @Bean(name="test2DataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.test2")
    public DataSourceProperties test2DataSourceProperties(){
        return new DataSourceProperties();
    }


    private static HikariDataSource createHikariDataSource(
            DataSourceProperties properties){
        //创建hikariDataSource对象
        HikariDataSource build = properties.initializeDataSourceBuilder().
                type(HikariDataSource.class).build();
        if(StringUtils.hasText(properties.getName())){
            build.setPoolName(properties.getName());
        }
        return build;
    }
}
