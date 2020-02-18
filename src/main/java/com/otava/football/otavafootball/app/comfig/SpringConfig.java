package com.otava.football.otavafootball.app.comfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.otava.football.otavafootball.app.comfig")
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.otava.football.otavafootball.app.comfig")
public class SpringConfig {

    @Value("${config.driver}")
    private String DRIVER_CLASS_NAME;

    @Value("${config.url}")
    private String URL;

    @Value("${config.user_name}")
    private String USER_NAME;

    @Value("${config.password}")
    private String PASSWORD;

    @Value("${config.package}")
    private String PACKAGE;

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName(DRIVER_CLASS_NAME);
        datasource.setUrl(URL);
        datasource.setUsername(USER_NAME);
        datasource.setPassword(PASSWORD);
        return datasource;
    }

}
