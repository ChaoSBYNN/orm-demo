package org.example.orm.demos.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Driver;

//@Configuration
//@EnableTransactionManagement
public class HibernateConfig {

//    @Bean
//    public DataSource dataSource() {
//        HikariDataSource dataSource = new HikariDataSource();
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test_user");
//        dataSource.setDriverClassName(Driver.class.getName());
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;
//    }

//    @Bean
//    public LocalSessionFactoryBean localSessionFactoryBean() {
//        Properties properties = new Properties();
//        properties.put(AvailableSettings.SHOW_SQL, true);
//        properties.put(AvailableSettings.FORMAT_SQL, true);
//
//        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        factoryBean.setHibernateProperties(properties);
//        factoryBean.setMappingResources("hibernate/mapping/User.hbm.xml");
//
//        return factoryBean;
//    }

}
