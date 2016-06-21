package com.dc.entity;

import java.sql.Timestamp;

/**
 * TaskInfo entity. @author MyEclipse Persistence Tools
 */

public class TaskInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String description;
	private Timestamp startTime;
	private Integer limitTime;
	private Timestamp actualEndTime;
	private String state;
	private ProjectInfo projectId;//多对一的任务和项目
	private PersonnelInfo personnelId;//多对一的任务和人员
	private ProjectStatus projectStatus;//多对一的任务和项目状态

	// Constructors

	public ProjectStatus getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(ProjectStatus projectStatus) {
		this.projectStatus = projectStatus;
	}

	/** default constructor */
	public TaskInfo() {
	}

	/** minimal constructor */
	public TaskInfo(String name, String description, Integer limitTime,
			String state) {
		this.name = name;
		this.description = description;
		this.limitTime = limitTime;
		this.state = state;
	}

	/** full constructor */
	public TaskInfo(String name, String description, Timestamp startTime,
			Integer limitTime, Timestamp actualEndTime, String state,
			ProjectInfo projectId, PersonnelInfo personnelId) {
		this.name = name;
		this.description = description;
		this.startTime = startTime;
		this.limitTime = limitTime;
		this.actualEndTime = actualEndTime;
		this.state = state;
		this.projectId = projectId;
		this.personnelId = personnelId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Integer getLimitTime() {
		return this.limitTime;
	}

	public void setLimitTime(Integer limitTime) {
		this.limitTime = limitTime;
	}

	public Timestamp getActualEndTime() {
		return this.actualEndTime;
	}

	public void setActualEndTime(Timestamp actualEndTime) {
		this.actualEndTime = actualEndTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ProjectInfo getProjectId() {
		return this.projectId;
	}

	public void setProjectId(ProjectInfo projectId) {
		this.projectId = projectId;
	}

	public PersonnelInfo getPersonnelId() {
		return this.personnelId;
	}

	public void setPersonnelId(PersonnelInfo personnelId) {
		this.personnelId = personnelId;
	}

}