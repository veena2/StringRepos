package com.zensar.spring.performers;

import java.util.Map;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer {

	private Map<Instrument,String> instrumentSongMap;
	
	
	public Map<Instrument, String> getInstrumentSongMap() {
		return instrumentSongMap;
	}


	public void setInstrumentSongMap(Map<Instrument, String> instrumentSongMap) {
		this.instrumentSongMap = instrumentSongMap;
	}


	@Override
	public void perform()
	{
		System.out.println("Instrumentalist is playing a song: ");
		for (Map.Entry<Instrument, String> me: instrumentSongMap.entrySet())  
		{
			System.out.println("Song:" +me.getValue()+" played by instrument:  " );
			me.getKey().play();


		}
         } 
	
	}


