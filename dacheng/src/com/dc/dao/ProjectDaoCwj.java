package com.dc.dao;

import java.util.List;

import com.dc.entity.ProjectInfo;

public interface ProjectDaoCwj {
	public void doCreateProject(ProjectInfo projectinfo);  
	public void removeProject(ProjectInfo projectinfo);  
	public void updateProject(ProjectInfo projectinfo);
	public List<ProjectInfo> findAllProjects();
	public ProjectInfo findProjectById(int id);

}
