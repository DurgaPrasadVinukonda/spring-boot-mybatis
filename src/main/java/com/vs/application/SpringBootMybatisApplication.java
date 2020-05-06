package com.vs.application;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.vs.model.Users;


// WE need to mapp the model class to the cureent class
@MappedTypes(Users.class)
// To scan for the class we use the mapper scan 
@MapperScan("com.vs.mapper")
@ComponentScan(basePackages= {"com.vs.controller"})
@SpringBootApplication
public class SpringBootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}

}
