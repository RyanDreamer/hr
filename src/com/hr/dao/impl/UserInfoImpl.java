package com.hr.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hr.dao.IUserInfoDao;
import com.hr.entity.UserInfo;
import com.hr.util.BaseDao;

public class UserInfoImpl implements IUserInfoDao {
	
	private BaseDao baseDao;
	
	@Override
	public List<UserInfo> findUser(List<Object> params) {
		// TODO Auto-generated method stub
		baseDao = new BaseDao();
		String sql = "select id,name,password,sex,birthday,phone from userinfo";
		List<UserInfo> userList = new ArrayList<UserInfo>();
		ResultSet rs = baseDao.executeQuery(sql, params);
		
		try {
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String sex = rs.getString("sex");
				Date birthday = rs.getDate("birthday");
				String phone = rs.getString("phone");
				
				UserInfo user = new UserInfo(id, name, password, sex, birthday, phone);
				userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}

}
