/**
 * 
 */
package com.jk.ams.models;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Jayakrishna
 *
 */

@Entity
@Table(name = "comments")
@XmlAccessorType(XmlAccessType.FIELD)
public class Comments {
	
	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@XmlElement
	private Integer id;
	
	@Column(name = "person_id", nullable = false)
	@XmlElement
	private Integer personId;
	
	@Column(name = "article_id", nullable = false)
	@XmlElement
	private Integer articleId;
	
	@Column(name = "comment_desc", nullable = false)
	@XmlElement
	private String commentDescription;
	
	@Column(name = "status", nullable = false)
	@XmlElement
	private Integer status;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the personId
	 */
	public Integer getPersonId() {
		return personId;
	}

	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	/**
	 * @return the articleId
	 */
	public Integer getArticleId() {
		return articleId;
	}

	/**
	 * @param articleId the articleId to set
	 */
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	/**
	 * @return the commentDescription
	 */
	public String getCommentDescription() {
		return commentDescription;
	}

	/**
	 * @param commentDescription the commentDescription to set
	 */
	public void setCommentDescription(String commentDescription) {
		this.commentDescription = commentDescription;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
