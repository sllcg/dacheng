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
	
@Override
	public int getAllTaskFOP(int projectid) {
		// TODO Auto-generated method stub
		return daoStatiProSyx.getAllTaskFOP(projectid);
	}

/******************************************************************************************************/
	public DaoStatiProSyx getDaoStatiProSyx() {
		return daoStatiProSyx;
	}

	public void setDaoStatiProSyx(DaoStatiProSyx daoStatiProSyx) {
		this.daoStatiProSyx = daoStatiProSyx;
	}
	
	

}
