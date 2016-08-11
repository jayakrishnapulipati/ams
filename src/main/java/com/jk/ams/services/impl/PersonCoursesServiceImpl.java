package com.jk.ams.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.ams.dao.PersonCoursesDao;
import com.jk.ams.models.PersonCourses;
import com.jk.ams.services.PersonCoursesService;

@Service("PersonCoursesService")
public class PersonCoursesServiceImpl implements PersonCoursesService {

	@Autowired
	private PersonCoursesDao personCoursesDao;
	
	@Override
	public List<PersonCourses> findCoursesByPersonId(Integer personId) {
		// TODO Auto-generated method stub
		return personCoursesDao.findCoursesByPersonId(personId);
	}

}
