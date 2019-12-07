package com.basics.assignment;

public class AnimalsCount {
	Bird[] birds = new Bird[] { new Duck(), new Chicken(new Rooster()), new Rooster(), new ParrotWithDogs(),
			new ParrotWithCats(), new ParrotNearRooster() };
	SeaAnimals[] seaAnimals = { new Shark(), new Clownfish(), new Dolphin() };
	Caterpillar[] caterPillar = { new Caterpillar(), new Butterfly() };

	public int countFly() {
		int totalFly = 0;
		for (Bird bird : birds) {
			if (bird.fly()) {
				totalFly = totalFly + 1;
			}
		}

		for (SeaAnimals seaAnimals : seaAnimals) {
			if (seaAnimals.fly()) {
				totalFly = totalFly + 1;
			}
		}

		for (Caterpillar caterPillar : caterPillar) {
			if (caterPillar.fly()) {
				totalFly = totalFly + 1;
			}
		}
		return totalFly;
	}

	public int countWalk() {
		int totalWalk = 0;
		for (Bird bird : birds) {
			if (bird.walk()) {
				totalWalk = totalWalk + 1;
			}
		}

		for (SeaAnimals seaAnimals : seaAnimals) {
			if (seaAnimals.walk()) {
				totalWalk = totalWalk + 1;
			}
		}

		for (Caterpillar caterPillar : caterPillar) {
			if (caterPillar.walk()) {
				totalWalk = totalWalk + 1;
			}
		}
		return totalWalk;
	}

	public int countSing() {
		int totalSing = 0;
		for (Bird bird : birds) {
			if (bird.sing()) {
				totalSing = totalSing + 1;
			}
		}

		for (SeaAnimals seaAnimals : seaAnimals) {
			if (seaAnimals.sing()) {
				totalSing = totalSing + 1;
			}
		}

		for (Caterpillar caterPillar : caterPillar) {
			if (caterPillar.sing()) {
				totalSing = totalSing + 1;
			}
		}
		return totalSing;
	}

	public int countSwim() {
		int totalSwim = 0;
		for (Bird bird : birds) {
			if (bird.swim()) {
				totalSwim = totalSwim + 1;
			}
		}

		for (SeaAnimals seaAnimals : seaAnimals) {
			if (seaAnimals.swim()) {
				totalSwim = totalSwim + 1;
			}
		}

		for (Caterpillar caterPillar : caterPillar) {
			if (caterPillar.swim()) {
				totalSwim = totalSwim + 1;
			}
		}
		return totalSwim;
	}
}
