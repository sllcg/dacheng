package com.dc.entity;

public class ProjectStatus implements java.io.Serializable{
	
	private Integer id;
	private String status;
	private ProjectInfo projectInfo;
	
	public ProjectStatus(){
		
	}
	public ProjectStatus(String status){
		this.status=status;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ProjectInfo getProjectInfo() {
		return projectInfo;
	}
	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}
	
	

}
