package com.basics.assignment;

class ParrotWithDogs extends Bird {

	public void placesLived() {
		System.out.println("Lives with Dogs in a house");
	}

	@Override
	public boolean sing() {
		System.out.println("Woof, woof");
		return true;
	}
}

class ParrotWithCats extends Bird {
	public void placesLived() {
		System.out.println("Lives with Cats in a house");
	}

	@Override
	public boolean sing() {
		System.out.println("Meow");
		return true;
	}
}

class ParrotNearRooster extends Bird {
	public void placesLived() {
		System.out.println("Lives near Rooster on a farm");
	}

	@Override
	public boolean sing() {
		System.out.println("Cock-a-doodle-doo");
		return true;
	}
}