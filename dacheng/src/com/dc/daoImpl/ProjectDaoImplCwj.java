package com.dc.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dc.dao.ProjectDaoCwj;
import com.dc.entity.ProjectInfo;

public class ProjectDaoImplCwj extends HibernateDaoSupport implements ProjectDaoCwj {
	
	@Override
	public void doCreateProject(ProjectInfo projectinfo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(projectinfo); 
	}

	@Override
	public List<ProjectInfo> findAllProjects() {
		// TODO Auto-generated method stub
        String hql = "from project_info u order by u.id asc";  
        List<ProjectInfo> list = this.getHibernateTemplate().find(hql);  
        return list; 
	}

	@Override
	public void removeProject(ProjectInfo projectinfo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(projectinfo); 
		
	}

	@Override
	public void updateProject(ProjectInfo projectinfo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(projectinfo);
		
	}

	@Override
	public ProjectInfo findProjectById(int id) {
		// TODO Auto-generated method stub
		ProjectInfo projectinfo = null;  
        projectinfo = (ProjectInfo) this.getHibernateTemplate().get(ProjectInfo.class, id);  
        return projectinfo;
	}

}
