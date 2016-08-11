package com.jk.ams.models;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Calendar;

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

import org.apache.commons.lang.time.DateFormatUtils;

@Entity
@Table(name = "articles")
@XmlAccessorType(XmlAccessType.FIELD)
public class Articles {

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@XmlElement
	
	//@JsonIgnore for not to include in the JSON response.
	private Integer id;

	@Column(name = "article_name", nullable = false)
	@XmlElement
	private String articleName;

	@Column(name = "article_description", nullable = false)
	@XmlElement
	private String articleDescription;

	@Column(name = "article_status", nullable = false)
	@XmlElement
	private Integer articleStatus;

	@Column(name = "created_date", nullable = false)
	@XmlElement
	private Calendar createdDate;

	@Column(name = "updated_date", nullable = false)
	@XmlElement
	private Calendar updatedDate;

	@Column(name = "person_id", nullable = false)
	@XmlElement
	private Integer personId;

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
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the articleName
	 */
	public String getArticleName() {
		return articleName;
	}

	/**
	 * @param articleName
	 *            the articleName to set
	 */
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	/**
	 * @return the articleDescription
	 */
	public String getArticleDescription() {
		return articleDescription;
	}

	/**
	 * @param articleDescription
	 *            the articleDescription to set
	 */
	public void setArticleDescription(String articleDescription) {
		this.articleDescription = articleDescription;
	}

	/**
	 * @return the articleStatus
	 */
	public Integer getArticleStatus() {
		return articleStatus;
	}

	/**
	 * @param articleStatus
	 *            the articleStatus to set
	 */
	public void setArticleStatus(Integer articleStatus) {
		this.articleStatus = articleStatus;
	}

	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return DateFormatUtils.format(createdDate, "yyyy-MM-dd");
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
	 */
	public void setCreatedDate(Calendar createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the updatedDate
	 */
	public String getUpdatedDate() {
		return DateFormatUtils.format(updatedDate, "yyyy-MM-dd");
	}

	/**
	 * @param updatedDate
	 *            the updatedDate to set
	 */
	public void setUpdatedDate(Calendar updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * @return the personId
	 */
	public Integer getPersonId() {
		return personId;
	}

	/**
	 * @param personId
	 *            the personId to set
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}
