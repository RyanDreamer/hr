package com.hr.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.hr.dao.IInsertCatDao;
import com.hr.dao.impl.InsetCatDaoImpl;
import com.hr.entity.Category;

public class InsetCatDaoImplTest {

	@Test
	public void testInsertCat() {
		List<Object> params = new ArrayList<Object>();
		Category cat;
		IInsertCatDao insert = new InsetCatDaoImpl();
		
		cat = new Category(1,"科技",2);
		params.add(cat);
		cat = new Category(2,"文学",1);
		params.add(cat);
		insert.insertCat(params);
		
	}

}
