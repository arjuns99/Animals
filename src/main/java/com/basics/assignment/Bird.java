package com.basics.assignment;

abstract public class Bird extends Animal {
	public boolean fly() {
		System.out.println("I am flying");
		return true;
	}

	@Override
	public boolean walk() {
		System.out.println("Cannot walk");
		return false;
	}

	public boolean sing() {
		System.out.println("Can sing");
		return true;
	}

	public boolean swim() {
		System.out.println("Cannot swim");
		return false;
	}

	abstract public void placesLived();
}

class Duck extends Bird {

	@Override
	public boolean sing() {
		System.out.println("Quack, quack");
		return true;
	}

	public void placesLived() {
		// TODO Auto-generated method stub
	}
}
