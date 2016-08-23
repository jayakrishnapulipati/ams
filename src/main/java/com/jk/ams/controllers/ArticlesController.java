package com.jk.ams.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jk.ams.dto.FileUpload;
import com.jk.ams.models.Articles;
import com.jk.ams.services.ArticlesService;
import com.jk.ams.utils.Constants;
import com.jk.ams.utils.FileUploadHelper;

@RestController
public class ArticlesController {
	@Autowired
	ArticlesService articlesService;

	@RequestMapping(value = "/articles", method = RequestMethod.GET)
	public Object getArticles() {
		List<Articles> articlesList = articlesService.getListOfArticles();
		System.out.println(articlesList);
		return articlesList;
	}

	@RequestMapping(value = "/personArticles", method = RequestMethod.GET)
	public Object getPersonArticles(@RequestParam(value = "personId", required = true) Integer personId) {
		System.out.println("person id : ===>" + personId);
		List<Articles> personArticles = articlesService.getPersonArtiles(personId);
		return personArticles;
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public Object upload(HttpServletRequest request, @RequestBody FileUpload fileUpload) {
		String filePath = request.getSession().getServletContext().getRealPath("") + "/resources/articleImages/";
		String fileName = FileUploadHelper.uploadFile(filePath, fileUpload);

		System.out.println("Received file: " + fileName);
		Map<String, String> map = new HashMap<String, String>();
		if (fileName != null) {
			try {
				articlesService.uploadFile(fileName);
				map.put("success", Constants.uploadSuccess);
				map.put("filePath", filePath + fileName);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				map.put("error", Constants.uploadError);
			}

		}

		return map;

	}
}
