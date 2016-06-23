package com.dc.entity;

import java.sql.Timestamp;
import java.util.Set;

import org.apache.struts2.ServletActionContext;

/**
 * ProjectInfo entity. @author MyEclipse Persistence Tools
 */

public class ProjectInfo implements java.io.Serializable {

	// Fields
	//������ģ���Ŀ���ȼ�����Ŀʲôʱ��
	private Integer id;    //��Ŀid
	private String name;   //��Ŀ��
	private Timestamp startTime;  //��ʼʱ��
	private Timestamp foreEndTime;  //Ԥ�ƽ���ʱ��
	private String clien;   //ί�з�
	private Set<TaskInfo> taskInfos;//һ�Զ����Ŀ������
	private Set<PersonnelInfo> personnelInfos;//һ�Զ����Ŀ����Ա
	private Set<ProjectStatus> projectStatus;  //һ�Զ����Ŀ�ͽ׶�

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