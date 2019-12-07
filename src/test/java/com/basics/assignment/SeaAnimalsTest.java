package com.basics.assignment;

import org.junit.Test;

import junit.framework.TestCase;

public class SeaAnimalsTest extends TestCase {

	@Test
	public void testShark() {
		SeaAnimals seaAnimals = new Shark();
		testData(seaAnimals);
	}

	@Test
	public void testClownfish() {
		SeaAnimals seaAnimals = new Clownfish();
		testData(seaAnimals);
	}

	@Test
	public void testDolphin() {
		SeaAnimals seaAnimals = new Dolphin();
		testData(seaAnimals);
	}

	private void testData(SeaAnimals seaAnimals) {
		seaAnimals.fly();
		seaAnimals.sing();
		seaAnimals.swim();
		seaAnimals.walk();
		seaAnimals.behaviour();
		seaAnimals.size();
	}

}
