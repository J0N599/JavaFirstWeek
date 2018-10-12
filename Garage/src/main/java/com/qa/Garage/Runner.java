package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	static Garage bigGarage = new Garage();

	static Vehicle car1 = new Car("Toyota", "Red", "Land", 100, 5, "Leather", false);
	static Vehicle boat1 = new Boat("Speedboat", "Blue", "Sea", 50, 4, "Rotor", false);
	static Vehicle plane1 = new Plane("Boeing", "White", "Sky", 200, 200, 12, 200);
	static Vehicle motorcycle1 = new Motorcycle("Yamaha", "Black", "Land", 120, 2, true);
	static Vehicle boat2 = new Boat("Galleon", "Brown", "Sea", 20, 70, "Sail", false);
	static Vehicle car2 = new Car("Audi", "Silver", "Land", 90, 8, "Sweade", true);

	static Vehicle planeToBeAdded = new Plane("Jet", "Silver", "Sky", 500, 50, 6, 150);

	public static List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public static void main(String[] args) {

		vehicleList.add(car1);
		vehicleList.add(boat1);
		vehicleList.add(plane1);
		vehicleList.add(motorcycle1);
		vehicleList.add(boat2);
		vehicleList.add(car2);

		System.out.println("Vehicle List: ");

		bigGarage.setVehicleList(vehicleList);

		bigGarage.getVehicleList().forEach(System.out::println);

		System.out.println("-----------------------------------");

		System.out.println("Bill Amounts: ");

		bigGarage.billList(vehicleList).forEach(System.out::println);

		System.out.println("-----------------------------------");

		System.out.println("Updated List (Added): ");

		bigGarage.addVehicle(planeToBeAdded).forEach(System.out::println);

		System.out.println("-----------------------------------");

		System.out.println("Updated List (Remove): ");

		bigGarage.removeVehicle(car1).forEach(System.out::println);

		System.out.println("-----------------------------------");

		System.out.println("Repair Bill: ");

		System.out.println("£" + bigGarage.billVehicle(car1));

		System.out.println("-----------------------------------");

		System.out.println("Empty Garage: ");

		System.out.println(bigGarage.emptyGarage());

		System.out.println("-----------------------------------");

	}
}
