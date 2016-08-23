package com.jk.ams.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.ams.dao.ArticlesDao;
import com.jk.ams.models.Articles;
import com.jk.ams.services.ArticlesService;

@Service("ArticlesService")
public class ArticlesServiceImpl implements ArticlesService {

	@Autowired
	private ArticlesDao articlesDao;
	

	@Override
	public List<Articles> getListOfArticles() {
		// TODO Auto-generated method stub

		return articlesDao.getListOfArticles();
	}


	@Override
	public List<Articles> getPersonArtiles(Integer personId) {
		// TODO Auto-generated method stub
		return articlesDao.getPersonArticles(personId);
	}


	@Override
	public void uploadFile(String fileName) {
		// TODO Auto-generated method stub
		articlesDao.uploadFile(fileName);
	}

}
