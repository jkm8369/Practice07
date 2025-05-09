package com.javaex.ex03;

public class Cat implements Soundable {

	private String sound;

	public Cat() {
		super();
	}

	public Cat(String sound) {
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
		return this.sound;
	}

}
