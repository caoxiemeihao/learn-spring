package com.caoxie.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.caoxie.Student;

public class Test {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		
		System.out.println(student);
	}
}