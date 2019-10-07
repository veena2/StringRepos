package com.zensar.spring.performers;

public class Juggler implements Performer {
private int beanBagx;
public Juggler()
{
System.out.println("No Arg Construdtor of Juggler");
}

	public Juggler(int beanBagx) {
	super();
	this.beanBagx = beanBagx;
	System.out.println("Parameterized Construdtor of Juggler");

}

	@Override
	public void perform() {
		System.out.println("Juggler juggling beanBags: " +beanBagx);

	}

	

}
