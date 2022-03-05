package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DeveloperApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DeveloperConfig.xml");
    	Developer factory = (Developer)applicationContext.getBean("d1");
    	factory.display();    	
    	((ClassPathXmlApplicationContext) applicationContext).close();

    	
        System.out.println( "Hello World!" );
    }
}
