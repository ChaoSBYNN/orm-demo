package org.example.orm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@MapperScan("org.example.orm")
public class OrmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmDemoApplication.class, args);
    }

}
