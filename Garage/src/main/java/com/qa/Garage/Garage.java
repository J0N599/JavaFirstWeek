package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public List<String> billList(List<Vehicle> blist) {
		List<String> billList = blist.stream().map(v -> "£" + v.calculateBill(v)).collect(Collectors.toList());
		return billList;
	}

	public List<Vehicle> addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		return vehicleList;
	}

	public List<Vehicle> removeVehicle(Vehicle vehicle) {
		vehicleList.remove(vehicle);
		return vehicleList;
	}

	public int billVehicle(Vehicle vehicle) {
		return vehicle.calculateBill(vehicle);
	}

	public List<Vehicle> emptyGarage() {
		vehicleList.clear();
		return vehicleList;
	}
}

// public static List<Integer> tenMultiply(List<Integer> list) {
// List<Integer> multiplyList = new ArrayList<Integer>();
// for (int number : list) {
// multiplyList.add(number * 10);
// }
// return multiplyList;
// }