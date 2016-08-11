package com.jk.ams.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jk.ams.dao.PersonsDao;
import com.jk.ams.models.Persons;

@Repository("PersonsDao")
public class PersonsDaoImpl implements PersonsDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addPerson(Persons persons) {
		sessionFactory.openSession().save(persons);
	}

}
