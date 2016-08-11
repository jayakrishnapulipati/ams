package com.jk.ams.dao;

import java.util.List;

import com.jk.ams.models.Courses;

public interface CoursesDao {

	public List<Courses> getCourses();
	public List<Courses> findCourses(Integer userId);
}
