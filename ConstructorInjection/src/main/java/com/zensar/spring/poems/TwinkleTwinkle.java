package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem {
	
	private static final String LINES[]= {
			"Twinkle Twinkle Little Star",
			 "How I wonder What you Are",
			 "Up above the world so high",
			 };
	
	@Override
	public void recite() 
	{
		for(String s:LINES)
		{
			System.out.println(s);
		}
	}

}
