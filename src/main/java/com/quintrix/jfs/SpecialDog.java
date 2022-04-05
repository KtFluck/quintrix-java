package com.quintrix.jfs;

//extends class as interface, variables are declared but not defined in an interface
public class SpecialDog extends Dog {

	private String origin;

	public SpecialDog(String origin) {
		super();
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void fight() {

	}

}
