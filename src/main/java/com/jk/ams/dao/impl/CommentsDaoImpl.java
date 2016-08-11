/**
 * 
 */
package com.jk.ams.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jk.ams.dao.CommentsDao;
import com.jk.ams.models.Comments;

/**
 * @author Jayakrishna
 *
 */

@Repository("CommentsDao")
public class CommentsDaoImpl implements CommentsDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	/* (non-Javadoc)
	 * @see com.jk.ams.dao.CommentsDao#findCommentsByArticleId(java.lang.Integer)
	 */
	@Override
	public List<Comments> findCommentsByArticleId(Integer articleId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("Select pc FROM Comments pc where pc.articleId = :articleId");
		query.setParameter("articleId", articleId);
		List<Comments> articleComments = query.list();
		return articleComments;
	}

}
