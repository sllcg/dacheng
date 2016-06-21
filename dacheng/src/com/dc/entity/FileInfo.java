package com.dc.entity;

/**
 * FileInfo entity. @author MyEclipse Persistence Tools
 */

public class FileInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String fileName;
	private String storageAddress;
	private ProjectInfo projectId;//多对一的文件和项目

	// Constructors

	public ProjectInfo getProjectId() {
		return projectId;
	}

	public void setProjectId(ProjectInfo projectId) {
		this.projectId = projectId;
	}

	/** default constructor */
	public FileInfo() {
	}

	/** minimal constructor */
	public FileInfo(String fileName) {
		this.fileName = fileName;
	}

	/** full constructor */
	public FileInfo(String fileName, String storageAddress) {
		this.fileName = fileName;
		this.storageAddress = storageAddress;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStorageAddress() {
		return this.storageAddress;
	}

	public void setStorageAddress(String storageAddress) {
		this.storageAddress = storageAddress;
	}

}