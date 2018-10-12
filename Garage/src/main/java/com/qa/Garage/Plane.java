package com.qa.Garage;

public class Plane extends Vehicle {

	int flightLength;

	int wingSpan;

	public Plane(String name, String colour, String terrain, int topSpeed, int capacity, int flightLength,
			int wingSpan) {

		this.name = name;
		this.colour = colour;
		this.terrain = terrain;
		this.topSpeed = topSpeed;
		this.capacity = capacity;
		this.flightLength = flightLength;
		this.wingSpan = wingSpan;
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

	public int getFlightLength() {
		return flightLength;
	}

	public void setFlightLength(int flightLength) {
		this.flightLength = flightLength;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String toString() {
		return super.toString() + flightLength + " " + wingSpan;
	}

}
