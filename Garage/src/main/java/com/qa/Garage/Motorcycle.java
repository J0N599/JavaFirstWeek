package com.qa.Garage;

public class Motorcycle extends Vehicle {

	boolean helmet;

	public Motorcycle(String name, String colour, String terrain, int topSpeed, int capacity, boolean helmet) {

		this.name = name;
		this.colour = colour;
		this.terrain = terrain;
		this.topSpeed = topSpeed;
		this.capacity = capacity;
		this.helmet = helmet;
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub

	}

	@Override
	void park() {
		// TODO Auto-generated method stub

	}

	@Override
	void maintainance() {
		// TODO Auto-generated method stub

	}

	@Override
	void refuel() {
		// TODO Auto-generated method stub

	}

	public boolean isHelmet() {
		return helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	public String toString() {
		return super.toString() + helmet;
	}
}
