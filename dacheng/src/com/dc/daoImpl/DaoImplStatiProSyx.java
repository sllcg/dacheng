package com.dc.daoImpl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.dc.dao.DaoStatiProSyx;
@Transactional
public class DaoImplStatiProSyx extends HibernateDaoSupport implements DaoStatiProSyx {
	
	
	@Resource
    public void setSessionFacotry(SessionFactory sessionFacotry) {  
        super.setSessionFactory(sessionFacotry);  
    } 
	
	private Session getCurrentSession(){
			return super.getHibernateTemplate().getSessionFactory().getCurrentSession();
		
	}
	
	
	
	private SessionFactory sessionFactory;

	@Override
	public int getAllProject() {     //��ȡ����Ŀ��
		// TODO Auto-generated method stub
		
		String hsql="from ProjectInfo";
		int proCount=this.getCurrentSession().createQuery(hsql).list().size();
		System.out.println("proCount:"+proCount);
		return proCount;
	}

	@Override
	public int getAllTaskFOP(int projectid) {    //��ȡ������Ŀ����������
		// TODO Auto-generated method stub
		String hsql="from TaskInfo ti where ti.projectId="+projectid;
		int taskConnFOP=this.getCurrentSession().createQuery(hsql).list().size();
		System.out.println("taskConnFOP:"+taskConnFOP);
		return taskConnFOP;
	}

	@Override
	public int getAllStatusFOP(int projectid) {   //��ȡһ����Ŀ��ȫ���׶�
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
