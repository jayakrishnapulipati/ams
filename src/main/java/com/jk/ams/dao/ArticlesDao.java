package com.jk.ams.dao;

import java.util.List;

import com.jk.ams.models.Articles;

public interface ArticlesDao {

	public List<Articles> getListOfArticles();

	public List<Articles> getPersonArticles(Integer personId);
	
	public void uploadFile(String fileName);
}
