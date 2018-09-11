package com.orm.jpshibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.orm.jpshibernate.DAO.JAPTEST;

@SpringBootApplication
public class SpringJPAApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(SpringJPAApplication.class, args);
		JAPTEST j = ac.getBean(JAPTEST.class);
		System.out.println(j);
		j.testConnection();
	}
}
