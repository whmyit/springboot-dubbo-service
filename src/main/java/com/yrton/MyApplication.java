package com.yrton;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.yrton.dao")//将项目中对应的mapper类的路径加进来就可以了
@ImportResource(value = {"classpath:providers.xml"}) // 使用 providers.xml 配置；
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}
}
