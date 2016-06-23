package com.dc.entity;

public class ProjectStatus implements java.io.Serializable{
	
	private Integer id;
	private String status;
	
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
	

}
