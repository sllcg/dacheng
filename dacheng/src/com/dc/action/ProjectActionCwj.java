package com.dc.action;

import java.util.Map;

import com.dc.entity.ProjectInfo;
import com.dc.service.ProjectServiceCwj;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ProjectActionCwj extends ActionSupport{
	private ProjectInfo projectinfo;  
	private ProjectServiceCwj projectServiceCwj;
	public ProjectInfo getProjectinfo() {
		return projectinfo;
	}
	public void setProjectinfo(ProjectInfo projectinfo) {
		this.projectinfo = projectinfo;
	}
	public ProjectServiceCwj getProjectServiceCwj() {
		return projectServiceCwj;
	}
	public void setProjectServiceCwj(ProjectServiceCwj projectServiceCwj) {
		this.projectServiceCwj = projectServiceCwj;
	}
	
	//添加
	public String add() throws Exception {  
		
        this.projectServiceCwj.doCreateProject(projectinfo);  
        return "add";  
    }
	
	//删除
	public String delete() throws Exception {  
		
        this.projectServiceCwj.delete(projectinfo);  
        return "delete";  
    } 
	  
	//修改
	public String update() throws Exception {  
		
		this.projectServiceCwj.update(this.projectinfo);  
		return "update";  
	}  

	
	
	@SuppressWarnings("unchecked")  
	public String list() throws Exception {  
	          
		 Map request = (Map) ActionContext.getContext().get("request");   
		 request.put("list", this.projectServiceCwj.findAllProjects());  
	     return "list";  
	}
	
	
	
}
