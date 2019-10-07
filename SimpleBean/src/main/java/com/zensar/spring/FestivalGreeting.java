package com.zensar.spring;

public class FestivalGreeting implements Greeting {

	
	public FestivalGreeting() {
     System.out.println("FestivalGreeting is created");	

	}
	@Override
	public String Greet() {
		return "Life is beautiful!!";
		
	}

}
