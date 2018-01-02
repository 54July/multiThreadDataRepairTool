package com.breeze.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.breeze.framework.config.C3p0DataSourceProperties;

/**
 * 程序启动入口
 * @author JuanChensh
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)//开启自动配置
@EnableConfigurationProperties(C3p0DataSourceProperties.class)
@MapperScan(value = "com.breeze.framework.mapper")//扫描mapper包
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
