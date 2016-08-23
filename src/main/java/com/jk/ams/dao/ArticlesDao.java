package com.jk.ams.dao;

import java.util.List;

import com.jk.ams.models.Articles;
import com.jk.ams.models.Images;

public interface ArticlesDao {

	public List<Articles> getListOfArticles();

	public List<Articles> getPersonArticles(Integer personId);
	
	public void uploadFile(Images images);
}
