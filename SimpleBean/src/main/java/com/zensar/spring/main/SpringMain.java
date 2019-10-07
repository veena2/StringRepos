package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zensar.spring.Greeting;

public class SpringMain {

	public static void main(String[] args)
	{
//creating the object of Spring Ioc Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("greetings.xml");
		Greeting g = ctx.getBean("festival", Greeting.class);
		//System.out.println(g.Greet());
		Greeting g1 = ctx.getBean("festival", Greeting.class);
		//System.out.println(g1.Greet());
	}

}
