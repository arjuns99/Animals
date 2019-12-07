package com.basics.assignment;

class Caterpillar extends Bird {
	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean sing() {
		return false;
	}

	@Override
	public boolean swim() {
		return false;
	}

	void state() {
		System.out.println("Cannot fly");
		System.out.println("Can walk(crawl)");
	}

	@Override
	public void placesLived() {
		// TODO Auto-generated method stub
	}
}

class Butterfly extends Caterpillar {
	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean sing() {
		return false;
	}

	@Override
	public boolean swim() {
		return false;
	}

	@Override
	public void state() {
		System.out.println("A butterfly can fly ");
		System.out.println("A butterfly does not make a sound");
	}

	public void beforeTransform() {
		Caterpillar cat = new Caterpillar();
		cat.state();
	}

	public void afterTransform() {
		Caterpillar cat = new Butterfly();
		cat.state();
	}
}
