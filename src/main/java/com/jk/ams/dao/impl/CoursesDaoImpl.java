package com.jk.ams.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jk.ams.dao.CoursesDao;
import com.jk.ams.models.Courses;
import com.jk.ams.models.PersonCourses;

@Repository("CoursesDao")
public class CoursesDaoImpl implements CoursesDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Courses> getCourses() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Courses");
		List<Courses> coursesList = query.list();
		return coursesList;
	}

	@Override
	public List<Courses> findCourses(Integer userId) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("Select c FROM PersonCourses pc,Courses c where c.id = pc.courseId and  pc.personId = :userId");
		query.setParameter("userId", userId);
		List<Courses> coursesList = query.list();
		return coursesList;
	}

	

}
