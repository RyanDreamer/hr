package com.hr.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.hr.dao.IUserInfoDao;
import com.hr.dao.impl.UserInfoImpl;
import com.hr.entity.UserInfo;

public class UserInfoImplTest {
	
	private IUserInfoDao userDao;

	@Test
	public void testFindUser() {
		userDao = new UserInfoImpl();
		List<UserInfo> userList;
		List<Object> params = null;
		userList = userDao.findUser(params);
		
		//打印第一个元素的名字
		System.out.println(userList.get(0).getName());
		
		System.out.println(userList);
	}

}
