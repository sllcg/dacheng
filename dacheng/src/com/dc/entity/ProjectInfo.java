package com.dc.entity;

import java.sql.Timestamp;
import java.util.Set;

import org.apache.struts2.ServletActionContext;

/**
 * ProjectInfo entity. @author MyEclipse Persistence Tools
 */

public class ProjectInfo implements java.io.Serializable {

	// Fields
	//需求更改：项目优先级，项目什么时候
	private Integer id;    //项目id
	private String name;   //项目名
	private Timestamp startTime;  //开始时间
	private Timestamp foreEndTime;  //预计结束时间
	private String clien;   //委托方
	private Set<TaskInfo> taskInfos;//一对多的项目和任务
	private Set<PersonnelInfo> personnelInfos;//一对多的项目和人员
	private Set<ProjectStatus> projectStatus;  //一对多的项目和阶段

	// Constructors

	/** default constructor */
	public ProjectInfo() {
	}

	/** minimal constructor */
	public ProjectInfo(String name, String clien) {
		this.name = name;
		this.clien = clien;
	}

	/** full constructor */
	public ProjectInfo(String name, Timestamp startTime,
			Timestamp foreEndTime, String clien, Set<TaskInfo> taskInfos,
			Set<PersonnelInfo> personnelInfos,Set<ProjectStatus> projectStatus) {
		this.name = name;
		this.startTime = startTime;
		this.foreEndTime = foreEndTime;
		this.clien = clien;
		this.taskInfos=taskInfos;
		this.personnelInfos=personnelInfos;
		this.projectStatus=projectStatus;
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

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getForeEndTime() {
		return this.foreEndTime;
	}

	public void setForeEndTime(Timestamp foreEndTime) {
		this.foreEndTime = foreEndTime;
	}

	public String getClien() {
		return this.clien;
	}

	public void setClien(String clien) {
		this.clien = clien;
	}
		

	public Set<TaskInfo> getTaskInfos() {
		return taskInfos;
	}

	public void setTaskInfos(Set<TaskInfo> taskInfos) {
		this.taskInfos = taskInfos;
	}

	public Set<PersonnelInfo> getPersonnelInfos() {
		return personnelInfos;
	}

	public void setPersonnelInfos(Set<PersonnelInfo> personnelInfos) {
		this.personnelInfos = personnelInfos;
	}

	public Set<ProjectStatus> getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(Set<ProjectStatus> projectStatus) {
		this.projectStatus = projectStatus;
	}
	
	

}