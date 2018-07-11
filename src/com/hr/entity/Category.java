package com.hr.entity;

import java.io.Serializable;

public class Category implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer id;
	Integer pid;
	String name;
	Integer sort;
	/**
	 * @param id
	 * @param pid
	 * @param name
	 * @param sort
	 */
	public Category(Integer id, Integer pid, String name, Integer sort) {
		super();
		this.id = id;
		this.pid = pid;
		this.name = name;
		this.sort = sort;
	}
	
	
	/**
	 * @param pid
	 * @param name
	 * @param sort
	 */
	public Category(Integer pid, String name, Integer sort) {
		super();
		this.pid = pid;
		this.name = name;
		this.sort = sort;
	}


	/**
	 * 
	 */
	public Category() {
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
	 * @return the pid
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sort
	 */
	public Integer getSort() {
		return sort;
	}
	/**
	 * @param sort the sort to set
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	
	
}
