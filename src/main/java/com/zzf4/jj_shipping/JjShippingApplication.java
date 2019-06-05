package com.zzf4.jj_shipping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.zzf4.jj_shipping.dao")
@EnableSwagger2//启用Swagger
public class JjShippingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JjShippingApplication.class, args);
    }

}
