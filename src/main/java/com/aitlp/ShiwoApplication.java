package com.aitlp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan({"com.aitlp.*.dao"})
@EnableSwagger2
public class ShiwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiwoApplication.class, args);
    }

}
