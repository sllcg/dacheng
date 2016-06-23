package com.dc.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dc.service.ServiceStatiProSyx;
import com.opensymphony.xwork2.ActionSupport;


public class ActionStatiProSyx extends ActionSupport {
	private ServiceStatiProSyx serviceStatiProSyx;
	private int proConnt;
	private int taskconnt;

	public String getConnPor(){  //��ȡȫ������Ŀ��
		proConnt=serviceStatiProSyx.getAllProject();
		System.out.println("123");
		System.out.println(proConnt);
		return SUCCESS;
	}
	
	public String getTaskConnFOP(){  //��ȡһ����Ŀ��ȫ������
		HttpServletRequest request=ServletActionContext.getRequest();
		String id=request.getParameter("projectid");
		int projectid=Integer.parseInt(id);
		taskconnt=serviceStatiProSyx.getAllTaskFOP(projectid);
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

	public int getTaskconnt() {
		return taskconnt;
	}

	public void setTaskconnt(int taskconnt) {
		this.taskconnt = taskconnt;
	}
}
