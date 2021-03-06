package com.bozkurt.turkninja.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="Article")
public class Article {
	@Id
	@GeneratedValue
	private long id;
	private String header;
	private String content;
	private String subcontent;
	@ManyToOne
	@JoinColumn(name="developer_id")
	private Developer developer;
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	private Date createDate;
	private Date lastUpdated; 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getSubcontent() {
		return getContent().substring(0,(getContent().length()-1) /2) ;
	}
	public void setSubcontent(String subcontent) {
		this.subcontent = subcontent;
	}

	


}
