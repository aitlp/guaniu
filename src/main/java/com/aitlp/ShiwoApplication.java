package com.aitlp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan({"com.aitlp.shi.dao"})

public class ShiwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiwoApplication.class, args);
    }

}
