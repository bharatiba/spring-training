package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class EmployeeApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("EmployeeConfig.xml");
    	Employee factory = (Employee)applicationContext.getBean("emp1");
    	factory.display();
    	
    	((ClassPathXmlApplicationContext) applicationContext).close();
        //System.out.println( "Hello World!" );
    }
}
