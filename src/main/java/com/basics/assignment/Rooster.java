package com.basics.assignment;

class Chicken extends Bird {
	Rooster rooster;

	public Chicken() {
	}

	public Chicken(Rooster rooster) {
		this.rooster = rooster;
	}

	@Override
	public boolean sing() {
		System.out.println("Cluck, cluck");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("Chicken cannot fly");
		return false;
	}

	public void singRooster() {
		rooster.sing();
	}

	public void placesLived() {
	}

}

class Rooster extends Bird {

	@Override
	public boolean sing() {
		System.out.println("Cock-a-doodle-doo");
		return true;
	}

	public void placesLived() {
		// TODO Auto-generated method stub

	}
}
