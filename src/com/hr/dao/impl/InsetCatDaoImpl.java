package com.hr.dao.impl;

import java.util.List;

import com.hr.dao.IInsertCatDao;
import com.hr.util.BaseDao;

public class InsetCatDaoImpl implements IInsertCatDao {

	@Override
	public int insertCat(List<Object> params) {
		// TODO Auto-generated method stub
		
		BaseDao baseDao = new BaseDao();
		int result=0;
		String sql = "insert into cms_category(pid,name,sort) values(?,?,?)";
		
		result = baseDao.executeUpdate(sql, params);
		System.out.println("成功执行插入操作，"+result+"行受影响");
		return 0;
	}

}
