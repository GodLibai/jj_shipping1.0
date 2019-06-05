package com.zzf4.jj_shipping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration //标记这是一个配置
public class SwaggerConfig {

    public ApiInfo createA(){
        ApiInfo info=new ApiInfoBuilder().title("锦江航运").
                contact( new Contact("宗哥项目组","http://ejj.jjshipping.cn","18137797731@163.com")).
                description("锦江航运项目的数据接口信息").build();
        return info;
    }
    @Bean//创建对象  修饰方法 方法的返回值必须是引用类型  对象存储在IOC容器
    public Docket createDocket(){
       Docket docket=new Docket(DocumentationType.SWAGGER_2).apiInfo(createA()).select().
               apis(RequestHandlerSelectors.basePackage("com.zzf4.jj_shipping.Controller")).build();
       return docket;

    }
}
