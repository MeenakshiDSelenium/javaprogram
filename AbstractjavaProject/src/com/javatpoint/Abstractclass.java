package com.javatpoint;

public abstract class Abstractclass {
	private String name;
	public Abstractclass(String name) {
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Abstractclass ab=new Abstractclass("name meenakshi") {
			
		};
		System.out.println(ab.getName());

	}

}
