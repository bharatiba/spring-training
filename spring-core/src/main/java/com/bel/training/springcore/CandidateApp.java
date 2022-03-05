package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class CandidateApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CandidateConfig.xml");
    	Candidate factory = (Candidate)applicationContext.getBean("cd1");
    	factory.display();    	
    	((ClassPathXmlApplicationContext) applicationContext).close();

    	
        System.out.println( "Hello World!" );
    }
}
