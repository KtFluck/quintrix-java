package com.quintrix.jfs;

public class Dog {

	String name;
	String breed;
	int age;
	String color;

	public Dog() {

		name = "Spot";
		breed = "Pug";
		age = 1;
		color = "Black & White";

	}

	public Dog(String n, String b, int a, String c) {

		name = n;
		breed = b;
		age = a;
		color = c;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return ("named " + getName() + "." + "\nHis breed is a " + getBreed() + ", his age is " + getAge()
				+ " years old, and his color is " + getColor() + ".");
	}

	public static void main(String[] args) {
		Dog katiesDog = new Dog();
		System.out.println("Katie's dog is " + katiesDog.toString());
	}

}
