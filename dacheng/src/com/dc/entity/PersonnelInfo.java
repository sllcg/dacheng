package com.dc.entity;

import java.util.Set;

/**
 * PersonnelInfo entity. @author MyEclipse Persistence Tools
 */

public class PersonnelInfo implements java.io.Serializable {

	// Fields
	//添加联系方式字段
	private Integer id;
	private String name;
	private String position;
	private Integer seniority;
	private RoleInfo role;//多对一的人员和角色
	private String state;
	private ProjectInfo projectId;//多对一的人员和项目
	private Set<TaskInfo> taskInfos;//一对多的任务和人员

	// Constructors

	/** default constructor */
	public PersonnelInfo() {
	}

	/** minimal constructor */
	public PersonnelInfo(String name, String position, Integer seniority,
			RoleInfo role, String state) {
		this.name = name;
		this.position = position;
		this.seniority = seniority;
		this.role = role;
		this.state = state;
	}

	/** full constructor */
	public PersonnelInfo(String name, String position, Integer seniority,
			RoleInfo role, String state, ProjectInfo projectId,Set<TaskInfo> taskInfos) {
		this.name = name;
		this.position = position;
		this.seniority = seniority;
		this.role = role;
		this.state = state;
		this.projectId = projectId;
		this.taskInfos=taskInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getSeniority() {
		return this.seniority;
	}

	public void setSeniority(Integer seniority) {
		this.seniority = seniority;
	}

	public RoleInfo getRole() {
		return this.role;
	}

	public void setRole(RoleInfo role) {
		this.role = role;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ProjectInfo getProjectId() {
		return projectId;
	}

	public void setProjectId(ProjectInfo projectId) {
		this.projectId = projectId;
	}

	public Set<TaskInfo> getTaskInfos() {
		return taskInfos;
	}

	public void setTaskInfos(Set<TaskInfo> taskInfos) {
		this.taskInfos = taskInfos;
	}
	

}