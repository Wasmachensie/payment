package com.nuyoah.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/18/12:18
 * @Description:
 * Swagger2Config
 */
@Configuration
@EnableSwagger2//代表这是一个Swagger2的配置类
public class Swagger2Config {

    @Bean
    //
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                .title("微信支付接口文档")
                .build());
    }
}
