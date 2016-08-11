/**
 * 
 */
package com.jk.ams.services;

import java.util.List;

import com.jk.ams.models.Comments;

/**
 * @author Jayakrishna
 *
 */
public interface CommentsService {
	
	public List<Comments> findCommentsByArticleId(Integer articleId); 
}
