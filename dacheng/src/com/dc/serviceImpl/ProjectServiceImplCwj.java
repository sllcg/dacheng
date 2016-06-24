package com.dc.serviceImpl;

import java.util.List;

import com.dc.dao.ProjectDaoCwj;
import com.dc.entity.ProjectInfo;
import com.dc.service.ProjectServiceCwj;

public class ProjectServiceImplCwj implements ProjectServiceCwj {

	private ProjectDaoCwj dao;
	
	public ProjectDaoCwj getDao() {
		return dao;
	}

	public void setDao(ProjectDaoCwj dao) {
		this.dao = dao;
	}

	@Override
	public void doCreateProject(ProjectInfo projectinfo) {
		// TODO Auto-generated method stub
		this.dao.doCreateProject(projectinfo);  
	}

	@Override
	public List<ProjectInfo> findAllProjects() {
		// TODO Auto-generated method stub
        return this.dao.findAllProjects();  

	}

	@Override
	public void delete(ProjectInfo projectinfo) {
		// TODO Auto-generated method stub
		this.dao.removeProject(projectinfo); 
	}

	@Override
	public void update(ProjectInfo projectinfo) {
		// TODO Auto-generated method stub
	    this.dao.updateProject(projectinfo);  
	}

	@Override
	public ProjectInfo findProjectById(int id) {
		// TODO Auto-generated method stub
        return this.dao.findProjectById(id);	
    }
}
