package com.zensar.spring.main;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("performers.xml");
	    Performer p = ctx.getBean("Neil", Performer.class);
	    p.perform();
	    ConfigurableApplicationContext cfgCtx=(ConfigurableApplicationContext) ctx;
	    cfgCtx.close();
	}

}
