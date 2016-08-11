package com.jk.ams.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.ams.dao.CoursesDao;
import com.jk.ams.models.Courses;
import com.jk.ams.services.CoursesService;

@Service("CoursesService")
public class CoursesServiceImpl implements CoursesService {

	@Autowired
	private CoursesDao coursesDao;
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return coursesDao.getCourses();
	}

	@Override
	public List<Courses> findCourses(Integer userId) {
		// TODO Auto-generated method stub
		return coursesDao.findCourses(userId);
	}

}
