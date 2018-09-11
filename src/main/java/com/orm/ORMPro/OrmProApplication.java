package com.orm.ORMPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import com.orm.ORMPro.DAO.MyCmponnet;

@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
public class OrmProApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(OrmProApplication.class, args);
		MyCmponnet c = ac.getBean(MyCmponnet.class);
		c.testConnection();
	}
}
