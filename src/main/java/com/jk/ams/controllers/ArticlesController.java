package com.jk.ams.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jk.ams.models.Articles;
import com.jk.ams.services.ArticlesService;

@RestController
public class ArticlesController {
	
	@Autowired ArticlesService articlesService;

	@RequestMapping(value = "/articles", method = RequestMethod.GET)
	public Object getArticles(){			
		List<Articles> articlesList = articlesService.getListOfArticles();
		System.out.println(articlesList);		
		return articlesList;
	}
	
	@RequestMapping(value = "/personArticles", method = RequestMethod.GET)
	public Object getPersonArticles( @RequestParam(value = "personId", required = true) Integer personId){
		System.out.println("person id : ===>"+personId);
		List<Articles> personArticles = articlesService.getPersonArtiles(personId);
		return personArticles;
	}
	
	/*@RequestMapping(value = "/{personId}/personArticles", method = RequestMethod.GET)
	public Object getPersonArticles(@PathVariable Integer personId){
		System.out.println("person id : ===>"+personId);
		List<Articles> personArticles = articlesService.getPersonArtiles(personId);
		return personArticles;
	}*/
	
	
}
