package com.orm.ORMPro.DAO;

import java.sql.Date;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.orm.ORMPro.entity.Employee;

@Component
@Transactional
public class MyCmponnet {

	@Autowired
	SessionFactory localSessionFactoryBean;

	public void testConnection() {
		localSessionFactoryBean.getCurrentSession().save(new Employee(1, "DDDD", new Date(2018, 6, 6)));
		localSessionFactoryBean.getCurrentSession().save(new Employee(2, "DDDD", new Date(2018, 6, 6)));
		localSessionFactoryBean.getCurrentSession().save(new Employee(3, "DDDD", new Date(2018, 6, 6)));
		localSessionFactoryBean.getCurrentSession().save(new Employee(4, "DDDD", new Date(2018, 6, 6)));
		localSessionFactoryBean.getCurrentSession().save(new Employee(5, "DDDD", new Date(2018, 6, 6)));
		localSessionFactoryBean.getCurrentSession().save(new Employee(6, "DDDD", new Date(2018, 6, 6)));
		localSessionFactoryBean.getCurrentSession().createQuery("from Employee").getResultList()
				.forEach(System.out::println);
		System.out.println(localSessionFactoryBean.isOpen());
		System.out.println(localSessionFactoryBean.openSession().isConnected());
	}
}
