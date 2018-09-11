package com.orm.jpshibernate.DAO;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JAPTEST {

	@Autowired
	EntityManager s;

	public void testConnection() {

		System.out.println(s.isOpen());

	}
}
