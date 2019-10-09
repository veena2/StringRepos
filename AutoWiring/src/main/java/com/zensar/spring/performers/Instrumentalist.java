package com.zensar.spring.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.zensar.spring.instruments.Instrument;

@Component("Neil")
public class Instrumentalist implements Performer {

	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
	@Value("Inkem Inkem kawle")
	private String song;
	
	@Override
	public void perform() {

		System.out.println("Instrumentalist is playing a song: "+song );
	    instrument.play();

	}

}
