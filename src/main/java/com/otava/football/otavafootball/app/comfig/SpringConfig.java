package com.otava.football.otavafootball.app.comfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("com.otava.football.otavafootball.app")
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.otava.football.otavafootball.app")
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
    public DataSource dataSource() {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName(DRIVER_CLASS_NAME);
        datasource.setUrl(URL);
        datasource.setUsername(USER_NAME);
        datasource.setPassword(PASSWORD);
        return datasource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityMnagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(PACKAGE);
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(additionalProperties());
        return em;
    }

    private Properties additionalProperties() {
        Properties properties = new Properties();
//        properties.setProperty("hibernate.hbm2ddl.auto", "none");
        properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
//        properties.setProperty("javax.persistence.sql-load-script-source", "data.sql");
        return properties;
    }

}
