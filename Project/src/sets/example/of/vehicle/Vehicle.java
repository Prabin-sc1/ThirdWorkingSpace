package sets.example.of.vehicle;

import java.util.HashSet;
import java.util.Set;

public final class Vehicle {
	private final String name;
	private final double price;
	
	private Set<Vehicle> groundVehicle;

	public Vehicle(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.groundVehicle = new HashSet<>();
	}

	
	public String getName() {
		return name;
	}

	public Set<Vehicle> getGroundVehicle() {
		return new HashSet<>(groundVehicle);
	}


	


	public double getPrice() {
		return price;
	}
	
	public boolean addVehicle(Vehicle vehicle) {
		return this.groundVehicle.add(vehicle);
	}
	
	

}
