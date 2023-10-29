package com.spring.webapp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.webapp.dao.StudentDao;
import com.spring.webapp.entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/webapp/config.xml");
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	
    	Student student = new Student();
        
		student.setId(6);
		student.setCity("Miami");
		student.setName("Jack Doe");
		
		int inserted = studentDao.insert(student);
		
		System.out.println("inserted rows in the database are :- "+ inserted);
    	
    }
}
