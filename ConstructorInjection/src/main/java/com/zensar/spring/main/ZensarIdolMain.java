package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.zensar.spring.performers.Juggler;
import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args)
	{
       ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
       Performer p = ctx.getBean("Pyare Mohan", Performer.class);
       p.perform();
       
       Performer p1=ctx.getBean("Veena", Performer.class);
       p1.perform();

	}

}
