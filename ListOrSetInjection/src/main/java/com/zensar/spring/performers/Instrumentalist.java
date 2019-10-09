package com.zensar.spring.performers;

import java.util.List;
import java.util.Set;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {
	private Set<Instrument> instruments;
	private String song;
	
	
	public Set<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
	}

	public Instrumentalist() {
		System.out.println("Instrumentalist is created");
	}
	
	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");

	}

	@Override
	public void perform() {

		System.out.println("Instrumentalist is playing a song: "+song );
		for(Instrument i:instruments)
		{
			i.play();
		}
	}

}
