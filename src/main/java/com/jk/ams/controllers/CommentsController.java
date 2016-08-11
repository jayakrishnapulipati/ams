package com.jk.ams.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jk.ams.models.Comments;
import com.jk.ams.services.CommentsService;

@RestController
public class CommentsController {

	@Autowired
	private CommentsService commentsService;
	
	@RequestMapping(value = "/articleComments", method = RequestMethod.GET)
	public Object getArticleComments(@RequestParam(value = "articleId", required = true) Integer articleId){
		List<Comments> articleComments = commentsService.findCommentsByArticleId(articleId);
		return articleComments;
	}
}
