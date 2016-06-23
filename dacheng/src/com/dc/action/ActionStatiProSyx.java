package com.dc.action;

import com.dc.service.ServiceStatiProSyx;
import com.opensymphony.xwork2.ActionSupport;


public class ActionStatiProSyx extends ActionSupport {
	private ServiceStatiProSyx serviceStatiProSyx;
	private int proConnt;

	public String getConnPor(){
		proConnt=serviceStatiProSyx.getAllProject();
		System.out.println("123");
		System.out.println(proConnt);
		return SUCCESS;
	}
	/*******************************get and set******************************************/
	public ServiceStatiProSyx getServiceStatiProSyx() {
		return serviceStatiProSyx;
	}

	public void setServiceStatiProSyx(ServiceStatiProSyx serviceStatiProSyx) {
		this.serviceStatiProSyx = serviceStatiProSyx;
	}
	public int getProConnt() {
		return proConnt;
	}
	public void setProConnt(int proConnt) {
		this.proConnt = proConnt;
	}
	
	
}
