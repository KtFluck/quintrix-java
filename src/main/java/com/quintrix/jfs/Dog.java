package com.quintrix.jfs;

import java.util.Objects;

public class Dog implements Comparable<Dog> {

	private int dogID;
	private String breed;
	private int age;
	private String color;

	SpecialDog specialDog; // composition - has-a ..."kitchen has a stove" if it "is a" then use
							// inharentance

	public static int NUM_OF_LEGS = 4;

	static {
		NUM_OF_LEGS = 3;
	}

	// default constructor, if this is not written a default like this is created
	public Dog() {
	}

	// alternate default constructor with values. input values are required when
	// calling. *Source, Gen constructor
	public Dog(String breed, int age, String color, int dogID) {
		super();
		this.breed = breed;
		this.age = age;
		this.color = color;
		this.dogID = dogID;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDogID() {
		return dogID;
	}

	public void setDogID(int dogID) {
		this.dogID = dogID;
	}

	void barking() {
	}

	void hungry() {
	}

	void sleeping() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(dogID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return dogID == other.dogID;
	}

	@Override
	public String toString() {
		return "Dog [dogID=" + dogID + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Dog d) {
		if (Integer.compare(getDogID(), d.getDogID()) == 0) {
			return Integer.compare(getAge(), d.getAge());
		} else {
			return Integer.compare(getDogID(), d.getDogID());
		}
	}

} // end Dog class