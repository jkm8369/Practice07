package com.javaex.ex03;

public class Sparrow implements Soundable {

	private String sound;

	public Sparrow() {
		super();
	}

	public Sparrow(String sound) {
		super();
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String sound() {
		return sound;
	}
	

}
