package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")
public class FestivalGreeting implements Greeting {

	
	public FestivalGreeting() {
     System.out.println("FestivalGreeting is created");	

	}
	@Override
	public String Greet() {
		return "Life is beautiful!!";
		
	}

}
