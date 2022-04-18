package com.nuyoah.payment.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: 8Nuyoah
 * @Date: 2022/04/18/13:35
 * @Description:
 */
@Configuration
@MapperScan("com.nuyoah.payment.mapper")
@EnableTransactionManagement//启用事务管理
public class MybatisPlusConfig {
}
