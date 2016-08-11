package com.jk.ams.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.ams.dao.CommentsDao;
import com.jk.ams.models.Comments;
import com.jk.ams.services.CommentsService;

@Service("CommentsService")
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	private CommentsDao commentsDao;
	
	
	@Override
	public List<Comments> findCommentsByArticleId(Integer articleId) {
		// TODO Auto-generated method stub
		return commentsDao.findCommentsByArticleId(articleId);
	}

}
