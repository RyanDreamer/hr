package com.hr.dao;

import java.util.List;

import com.hr.entity.UserInfo;


public interface IUserInfoDao {
	/**
	 *查询所有用户的信息
	 * @param params
	 * @return
	 */
	public List<UserInfo> findUser(List<Object> params);
}
