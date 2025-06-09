package com.tka.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.Classroom;




public class ClassroomDao {
	public Session session=null;
	public static Session getSession() 
	{
		
			
			Configuration cfg=new Configuration();
			
			cfg.configure(); // checks the hibernate.cfg.xml
			// System.out.println(3);
			cfg.addAnnotatedClass(Classroom.class);
			SessionFactory factory=cfg.buildSessionFactory();
			
			Session session=factory.openSession();
			System.out.println("session created");
		return session;
	}
	void addclassroom(Classroom classroom)
	{
		session=getSession();
		session.save(classroom);
		session.beginTransaction().commit();
		
	}
	
	void updateclassroom(Classroom classroom)
	{
		session=getSession();
		session.update(classroom);
		session.beginTransaction().commit();
		
	}
	
	void deleteclassroom(Classroom classroom)
	{
		session=getSession();
		session.delete(classroom);
		session.beginTransaction().commit();
		
	}
	
	
	public static void main(String[] args) 
	{
		ClassroomDao classroomDao= new ClassroomDao();
//		Classroom classroom = new Classroom(1,"J2EE", 30);
//		classroomDao.addclassroom(classroom);
		
//		Classroom classroom1 = new Classroom("Python", 20);
//		classroomDao.addclassroom(classroom1);
		
//		Classroom classroom2 = new Classroom("JAVA", 25);
//		classroomDao.addclassroom(classroom2);
		
		Classroom classroom3 = new Classroom("Python", 20);
		classroomDao.deleteclassroom(classroom3);
		
	}

}
