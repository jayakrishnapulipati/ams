package com.jk.ams.services;

import java.util.List;

import com.jk.ams.models.PersonCourses;

public interface PersonCoursesService {

	public List<PersonCourses> findCoursesByPersonId(Integer personId);
}
