package com.basics.assignment;

abstract public class SeaAnimals {
	public boolean swim() {
		System.out.println("I am swimming");
		return true;
	}

	public boolean sing() {
		return false;
	}

	public boolean walk() {
		return false;
	}

	public boolean fly() {
		return false;
	}

	abstract void size();

	abstract void behaviour();
}

class Shark extends SeaAnimals {
	@Override
	public void size() {
		System.out.println("Sharks are large and grey");
	}

	@Override
	public void behaviour() {
		System.out.println("Sharks eat other fish");
	}
}

class Clownfish extends SeaAnimals {
	@Override
	public void size() {
		System.out.println("Clownfish are small and colourful (orange)");
	}

	@Override
	public void behaviour() {
		System.out.println("Clownfish make jokes");
	}
}

class Dolphin extends SeaAnimals {
	@Override
	public boolean swim() {
		System.out.println("Dolphins can swim");
		return true;
	}

	@Override
	void size() {
		// TODO Auto-generated method stub

	}

	@Override
	void behaviour() {
		// TODO Auto-generated method stub

	}
}
