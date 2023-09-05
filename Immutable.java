package com.example.demo;

public final class Immutable {
	private String name;

	public String getName() {
		return name;
	}
	public Immutable(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
		Immutable im = new  Immutable("Alkaria");
		
		System.out.println(im.getName());
		
	}

}
