package com.zensar.spring;

public class AnniversaryGreeting implements Greeting {
public AnniversaryGreeting() {
System.out.println("Anniversary is created");
}
	@Override
	public String Greet() {
		return "Happy 1 month Anniversary";
	}

}
