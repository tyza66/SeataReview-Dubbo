package com.tyza66;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author: tyza66
 * Date: 2023/7/12 18:22
 * Github: https://github.com/tyza66
 **/

@SpringBootApplication
@MapperScan("com.tyza66.mapper")
public class OneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }
}
