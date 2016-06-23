package com.dc.serviceImpl;

import com.dc.dao.DaoStatiProSyx;
import com.dc.service.ServiceStatiProSyx;

public class ServiceImplStatiProSyx implements ServiceStatiProSyx {
	
	private DaoStatiProSyx daoStatiProSyx;

	@Override
	public int getAllProject() {
		// TODO Auto-generated method stub
		
		return daoStatiProSyx.getAllProject();
	}

	public DaoStatiProSyx getDaoStatiProSyx() {
		return daoStatiProSyx;
	}

	public void setDaoStatiProSyx(DaoStatiProSyx daoStatiProSyx) {
		this.daoStatiProSyx = daoStatiProSyx;
	}
	
	

}
