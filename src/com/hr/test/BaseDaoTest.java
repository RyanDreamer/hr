package com.hr.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hr.util.BaseDao;

public class BaseDaoTest {

	@Test
	public void testGetConnection() {
		BaseDao baseDao = new BaseDao();
		if (baseDao.getConnection() == null) {
			System.out.println("����ʧ��");
		}
		else {
			System.out.println("���ݿ�������");
		}
	}

}
