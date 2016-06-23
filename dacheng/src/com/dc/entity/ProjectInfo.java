package com.dc.entity;

import java.sql.Timestamp;
import java.util.Set;

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
	private Set<FileInfo> fileIds;//����Ӧ����һ�Զ� ��Ŀ���ļ� 
	private Set<TaskInfo> taskInfos;//һ�Զ����Ŀ������
	private Set<PersonnelInfo> personnelInfos;//һ�Զ����Ŀ����Ա

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
			Timestamp foreEndTime, String clien, Set<FileInfo> fileIds, Set<TaskInfo> taskInfos,
			Set<PersonnelInfo> personnelInfos) {
		this.name = name;
		this.startTime = startTime;
		this.foreEndTime = foreEndTime;
		this.clien = clien;
		this.fileIds = fileIds;
		this.taskInfos=taskInfos;
		this.personnelInfos=personnelInfos;
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
		
	public Set<FileInfo> getFileIds() {
		return fileIds;
	}

	public void setFileIds(Set<FileInfo> fileIds) {
		this.fileIds = fileIds;
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
	

}