package com.springcore.Emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing 
{

	
	
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Emp/empConfig.xml");
		Employee e=(Employee) context.getBean("emp1");
		System.out.println(e);
		
		
	}

}
