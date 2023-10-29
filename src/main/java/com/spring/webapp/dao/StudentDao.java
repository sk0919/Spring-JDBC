/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.spring.webapp.dao;

import java.util.List;

import com.spring.webapp.entities.Student;

/**
 *
 * @author Sumit Mishra
 */
public interface StudentDao {
    
	
	public int insert(Student student);

	public int update(Student student);

	public int delete(int studentId);

	public Student fetch(int studentId);
	
	public List<Student> fetchAll();
	
}
