package com.jk.ams.services;

import java.util.List;

import com.jk.ams.models.Courses;

public interface CoursesService {	
	
	public List<Courses> getCourses();
	public List<Courses> findCourses(Integer userId);
}
