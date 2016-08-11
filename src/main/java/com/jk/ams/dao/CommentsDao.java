package com.jk.ams.dao;

import java.util.List;

import com.jk.ams.models.Comments;

public interface CommentsDao {
	
	public List<Comments> findCommentsByArticleId(Integer articleId);
}
