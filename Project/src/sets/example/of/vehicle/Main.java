package sets.example.of.vehicle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static Map<String, Vehicle> vehicle = new HashMap<>();
	private static Set<Vehicle> groundVehicle = new HashSet<>();

	public static void main(String[] args) {
		Vehicle car = new Vehicle("Toyota",5000000);
		vehicle.put(car.getName(), car);
		groundVehicle.add(car);
		
		car = new Vehicle("Buggati",155000000);
		vehicle.put(car.getName(), car);
		groundVehicle.add(car);

		car = new Vehicle("Lamborgini",50000000);
		vehicle.put(car.getName(), car);
		groundVehicle.add(car);
		
		Vehicle bike = new Vehicle("Honda",200000);
		vehicle.put(bike.getName(), bike);
		groundVehicle.add(bike);
		
		bike = new Vehicle("Bullet",800000);
		vehicle.put(bike.getName(), bike);
		groundVehicle.add(bike);
		
		
		
		bike = new Vehicle("FZ",400000);
		vehicle.put(bike.getName(), bike);
		groundVehicle.add(bike);
		
		bike = new Vehicle("Pulsar",500000);
		vehicle.put(bike.getName(), bike);
		groundVehicle.add(bike);
		
		System.out.println("Vehicle:");
		for(Vehicle bus: groundVehicle) {
			System.out.println("  "+bus.getName());
			
		}
		
		
		

	}

}
