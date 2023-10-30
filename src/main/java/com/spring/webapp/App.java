package com.spring.webapp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.spring.webapp.dao.StudentDao;
import com.spring.webapp.entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	
    	Student student = new Student();
        
		student.setId(6);
		student.setCity("New England");
		student.setName("Jimmy Doe");
		
		// UPDATE
		int inserted = studentDao.update(student);
		
		System.out.println("inserted rows in the database are :- "+ inserted);
    	
    }
}
