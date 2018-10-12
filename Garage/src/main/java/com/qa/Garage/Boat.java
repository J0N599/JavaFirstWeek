package com.qa.Garage;

public class Boat extends Vehicle {

	String movementType;

	boolean radar;

	public Boat(String name, String colour, String terrain, int topSpeed, int capacity, String movementType,
			boolean radar) {

		this.name = name;
		this.colour = colour;
		this.terrain = terrain;
		this.topSpeed = topSpeed;
		this.capacity = capacity;
		this.movementType = movementType;
		this.radar = radar;
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

	public String getMovementType() {
		return movementType;
	}

	public void setMovementType(String movementType) {
		this.movementType = movementType;
	}

	public boolean isRadar() {
		return radar;
	}

	public void setRadar(boolean radar) {
		this.radar = radar;
	}

	public String toString() {
		return super.toString() + movementType + " " + radar;
	}
}
