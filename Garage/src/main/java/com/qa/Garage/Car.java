package com.qa.Garage;

public class Car extends Vehicle {

	String interiorMaterial;

	boolean fourWheelDrive;

	public Car(String name, String colour, String terrain, int topSpeed, int capacity, String interiorMaterial,
			boolean fourWheelDrive) {

		this.name = name;
		this.colour = colour;
		this.terrain = terrain;
		this.topSpeed = topSpeed;
		this.capacity = capacity;
		this.interiorMaterial = interiorMaterial;
		this.fourWheelDrive = fourWheelDrive;

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

	public String getInteriorMaterial() {
		return interiorMaterial;
	}

	public void setInteriorMaterial(String interiorMaterial) {
		this.interiorMaterial = interiorMaterial;
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	public String toString() {
		return super.toString() + interiorMaterial + " " + fourWheelDrive;
	}
}
