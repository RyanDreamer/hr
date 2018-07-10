package com.hr.entity;

import com.sun.jmx.snmp.Timestamp;

public class Article {
	Integer id;
	Integer cid;
	String title;
	String author;
	String thumb;
	String show;
	Integer views;
	Timestamp time;
	String content;
	String keywords;
	String description;
	/**
	 * @param id
	 * @param cid
	 * @param title
	 * @param author
	 * @param thumb
	 * @param show
	 * @param views
	 * @param time
	 * @param content
	 * @param keywords
	 * @param description
	 */
	public Article(Integer id, Integer cid, String title, String author, String thumb, String show, Integer views,
			Timestamp time, String content, String keywords, String description) {
		super();
		this.id = id;
		this.cid = cid;
		this.title = title;
		this.author = author;
		this.thumb = thumb;
		this.show = show;
		this.views = views;
		this.time = time;
		this.content = content;
		this.keywords = keywords;
		this.description = description;
	}
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
	 * @return the cid
	 */
	public Integer getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the thumb
	 */
	public String getThumb() {
		return thumb;
	}
	/**
	 * @param thumb the thumb to set
	 */
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	/**
	 * @return the show
	 */
	public String getShow() {
		return show;
	}
	/**
	 * @param show the show to set
	 */
	public void setShow(String show) {
		this.show = show;
	}
	/**
	 * @return the views
	 */
	public Integer getViews() {
		return views;
	}
	/**
	 * @param views the views to set
	 */
	public void setViews(Integer views) {
		this.views = views;
	}
	/**
	 * @return the time
	 */
	public Timestamp getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Timestamp time) {
		this.time = time;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the keywords
	 */
	public String getKeywords() {
		return keywords;
	}
	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
