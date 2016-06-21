package com.dc.entity;

/**
 * RoleInfo entity. @author MyEclipse Persistence Tools
 */

public class RoleInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String role;
	//一对多的角色和人员

	// Constructors

	/** default constructor */
	public RoleInfo() {
	}

	/** full constructor */
	public RoleInfo(String role) {
		this.role = role;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}