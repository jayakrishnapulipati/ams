/**
 * 
 */
package com.jk.ams.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jk.ams.dao.PersonCoursesDao;
import com.jk.ams.models.Courses;
import com.jk.ams.models.PersonCourses;

/**
 * @author Jayakrishna
 *
 */
@Repository("PersonCoursesDao")
public class PersonCoursesDaoImpl implements PersonCoursesDao {

	/* (non-Javadoc)
	 * @see com.jk.ams.dao.PersonCoursesDao#findCoursesByPersonId(java.lang.Integer)
	 */
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public List<PersonCourses> findCoursesByPersonId(Integer personId) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("Select pc FROM PersonCourses pc where pc.personId = :personId");
		query.setParameter("personId", personId);
		List<PersonCourses> personCoursesList = query.list();
		return personCoursesList;
	}

}
