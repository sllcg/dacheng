package com.dc.text;

import com.dc.dao.DaoStatiProSyx;

import junit.framework.TestCase;

public class MainText extends TestCase{
	private DaoStatiProSyx daoStatiProSyx;
	
	public void text01(){
		System.out.println("123");
	}

	public DaoStatiProSyx getDaoStatiProSyx() {
		return daoStatiProSyx;
	}

	public void setDaoStatiProSyx(DaoStatiProSyx daoStatiProSyx) {
		this.daoStatiProSyx = daoStatiProSyx;
	}

}
