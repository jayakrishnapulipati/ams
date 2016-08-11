package com.jk.ams.dao;

import java.util.List;

import com.jk.ams.models.PersonCourses;

public interface PersonCoursesDao {

	public List<PersonCourses> findCoursesByPersonId(Integer personId);
}
