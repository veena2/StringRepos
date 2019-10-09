package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zensar.spring.Greeting;
import com.zensar.spring.config.GreetingConfig;

public class SpringMain {

	public static void main(String[] args)
	{
//creating the object of Spring Ioc Container
		ApplicationContext ctx = new AnnotationConfigApplicationContext(GreetingConfig.class);
		Greeting g = ctx.getBean("festival", Greeting.class);
		//System.out.println(g.Greet());
		
		Greeting g1 = ctx.getBean("anniversaryGreeting", Greeting.class);
		//System.out.println(g1.Greet());
	}

}
