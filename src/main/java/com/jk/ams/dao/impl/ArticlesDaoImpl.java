package com.jk.ams.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jk.ams.dao.ArticlesDao;
import com.jk.ams.models.Articles;
import com.jk.ams.models.Images;

@Repository("ArticlesDao")
public class ArticlesDaoImpl implements ArticlesDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Articles> getListOfArticles() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("FROM Articles");
		List<Articles> articlesList = query.list();
		return articlesList;
	}

	@Override
	public List<Articles> getPersonArticles(Integer personId) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("Select pc FROM Articles pc where pc.personId = :personId");
		query.setParameter("personId", personId);
		List<Articles> personArticles = query.list();
		return personArticles;
	}

	@Override
	public void uploadFile(String fileName) {
		// TODO Auto-generated method stub
		Images images = new Images();
		images.setImageRelativePath(fileName);
		sessionFactory.openSession().save(images);
	}

}
