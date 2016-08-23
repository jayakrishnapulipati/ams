package com.jk.ams.services;

import java.util.List;

import com.jk.ams.models.Articles;
import com.jk.ams.models.Images;

public interface ArticlesService {

	public List<Articles> getListOfArticles();
	
	public List<Articles> getPersonArtiles(Integer personId);
	
	public void uploadFile(Images images);
}
