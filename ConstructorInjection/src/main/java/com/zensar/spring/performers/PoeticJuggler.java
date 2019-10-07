package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler
{
	private Poem poem;
	public PoeticJuggler() 
	{
		System.out.println("No-arg constructor of PoeticJuggler");
	}
	public PoeticJuggler(int beanBagx, Poem poem) {
		super(beanBagx);
		this.poem = poem;
		System.out.println("Parameterized constructor of PoeticJuggler");

	}
	@Override
	public void perform() {
		super.perform();
		System.out.println("While reciting a poem...");
		poem.recite();
	}

}
