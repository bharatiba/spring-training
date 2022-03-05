package com.bel.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class BookApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BookConfig.xml");
    	Book factory = (Book)applicationContext.getBean("book1");
    	factory.display();    	
    	((ClassPathXmlApplicationContext) applicationContext).close();

    	
        System.out.println( "Hello World!" );
    }
}
