package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("StudentConfig.xml");
    	Student factory = (Student)applicationContext.getBean("s1");
    	factory.display();    	
    	((ClassPathXmlApplicationContext) applicationContext).close();

    	
        System.out.println( "Hello World!" );
    }
}
