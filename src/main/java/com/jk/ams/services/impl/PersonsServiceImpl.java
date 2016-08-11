/**
 * 
 */
package com.jk.ams.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.ams.dao.PersonsDao;
import com.jk.ams.models.Persons;
import com.jk.ams.services.PersonsService;

/**
 * @author Jayakrishna
 *
 */

@Service("PersonsService")
public class PersonsServiceImpl implements PersonsService{

	@Autowired
	private PersonsDao personsDao;
	
	@Override
	public void addPerson(Persons persons) {
		personsDao.addPerson(persons);
	}

}
