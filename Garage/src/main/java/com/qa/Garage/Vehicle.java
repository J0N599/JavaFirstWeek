package com.qa.Garage;

public abstract class Vehicle {

	String name;

	String colour;

	String terrain;

	int topSpeed;

	int capacity;

	abstract void drive();

	abstract void park();

	abstract void maintainance();

	abstract void refuel();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String toString() {
		return name + " " + colour + " " + terrain + " " + topSpeed + " " + capacity + " ";
	}

	public int calculateBill(Vehicle v) {
		if (v instanceof Car) {
			int price = v.topSpeed * 10;
			return price;
		}
		if (v instanceof Boat) {
			int price = v.topSpeed * 100;
			return price;
		}
		if (v instanceof Motorcycle) {
			int price = v.topSpeed * 20;
			return price;
		}
		if (v instanceof Plane) {
			int price = v.topSpeed * 1000;
			return price;
		} else {
			return 0;
		}
	}
}
