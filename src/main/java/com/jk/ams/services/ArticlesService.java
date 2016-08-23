package com.jk.ams.services;

import java.util.List;

import com.jk.ams.models.Articles;

public interface ArticlesService {

	public List<Articles> getListOfArticles();
	
	public List<Articles> getPersonArtiles(Integer personId);
	
	public void uploadFile(String fileName);
}
