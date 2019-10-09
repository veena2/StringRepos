package com.zensar.spring.performers;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class Instrumentalist implements Performer 
{
private Properties instrumentsSongProps;


public Properties getInstrumentsSongProps() {
	return instrumentsSongProps;
}


public void setInstrumentsSongProps(Properties instrumentsSongProps) {
	this.instrumentsSongProps = instrumentsSongProps;
}


@Override
public void perform() {

	System.out.println("Instrumentalist is playing song");
	Enumeration instruments = instrumentsSongProps.keys();
	while (instruments.hasMoreElements()) {
		String instrumentName = (String) instruments.nextElement();
		String song = instrumentsSongProps.getProperty(instrumentName);
		System.out.println(song+  " by: " +instrumentName);
	}
}


}


