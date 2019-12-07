package com.basics.assignment;

import org.junit.Test;

import junit.framework.TestCase;

public class BirdTest extends TestCase {

	@Test
	public void testDuck() {
		Bird bird = new Duck();
		bird.sing();
		bird.walk();
		bird.fly();
		bird.swim();
	}

	@Test
	public void testChickenAndRooster() {

		Bird bird = new Chicken();
		bird.sing();
		bird.walk();
		bird.fly();
		bird.swim();
		Rooster rooster = new Rooster();
		Chicken chick = new Chicken(rooster);
		chick.singRooster();
		rooster.fly();
		rooster.swim();
		rooster.walk();
	}

	@Test
	public void testParrotNearRooster() {
		Bird bird = new ParrotNearRooster();
		bird.sing();
		bird.walk();
		bird.fly();
		bird.swim();
		bird.placesLived();
	}

	@Test
	public void testParrotWithDogs() {
		Bird bird = new ParrotWithDogs();
		bird.sing();
		bird.walk();
		bird.fly();
		bird.swim();
		bird.placesLived();
	}

	@Test
	public void testParrotWithCats() {
		Bird bird = new ParrotWithCats();
		bird.sing();
		bird.walk();
		bird.fly();
		bird.swim();
		bird.placesLived();
	}
}
