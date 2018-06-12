package com.amumu.user.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	
	private final static SessionFactory FACTORY=buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		 Configuration cfg=new Configuration().configure(); //实例化配置
	     ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();//生成服务登记
	      return cfg.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return FACTORY;
	}

	public static Session openSession() {
		return FACTORY.openSession();
	}
	
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
	}
	

	
}
