package com.tyza66;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.tyza66.mapper")
public class TwoApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(TwoApplication.class,args);
    }
}
