package com.dc.service;

import java.util.List;

import com.dc.entity.ProjectInfo;



public interface ProjectServiceCwj {
	public void doCreateProject(ProjectInfo projectinfo);  
	public void delete(ProjectInfo projectinfo);  
	public void update(ProjectInfo projectinfo); 
	public List<ProjectInfo> findAllProjects();
	public ProjectInfo findProjectById(int id);

}
