package com.basics.assignment;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AnimalsCountTest extends TestCase {
	AnimalsCount animalCnt = new AnimalsCount();

	@Test
	public void testCountFly() {
		System.out.println("Total animal that fly " + animalCnt.countFly());
		Assert.assertNotNull(animalCnt.countFly());
	}

	@Test
	public void testCountWalk() {
		System.out.println("Total animal that walk " + animalCnt.countWalk());
		Assert.assertNotNull(animalCnt.countWalk());
	}

	@Test
	public void testCountSing() {
		System.out.println("Total animal that sing " + animalCnt.countSing());
		Assert.assertNotNull(animalCnt.countSing());
	}

	@Test
	public void testCountSwim() {
		System.out.println("Total animal that swim " + animalCnt.countSwim());
		Assert.assertNotNull(animalCnt.countSwim());
	}

}
