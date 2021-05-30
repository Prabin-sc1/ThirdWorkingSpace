package Sets;
//aug 31
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Best-performing implementation of a set interface is HashSet class and that uses hashes to store the items
 * now this is just like a HashMap class that we looked at and in fact the HashSet implementation currently uses a HashMap.
 * 
 * Set can implemented using a map and it's not hard to work out that you can actually use the corresponding map object and
 * use only the keys ignoring the values so this is what HashSet does and whenever an element is added  to the set it becomes
 * a key in the underlying HashMap and a dummy object is stored as the value so sets can be useful because operations on them
 * are very fast and if you're dealing with the mathematical notion of a set then the java collection set types really allow 
 * the usual set operation such as union and intersection which is pretty cool 
 */


public class Main {
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		HeavenlyBody temp = new Planet("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
	   
		temp = new Planet("Saturn", 148);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
	   
		temp = new Planet("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new Moon("Moon",27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon);
		
		tempMoon = new Moon("Deimos",2);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon);
		
		tempMoon = new Moon("Phobos",21);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon);
		
		temp = new Moon("Jupiter", 1888);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		

		tempMoon = new Moon("aaa",21);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("bbb",21);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("ccc",21);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addSatellite(tempMoon);
		
		temp = new Planet("Venus", 150);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new Planet("Pluto", 288);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new Planet("Neptune", 140);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new Planet("Mars", 1886);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new Planet("Uranus", 184);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		System.out.println("Planets:");
		
		for(HeavenlyBody planet : planets) {
			System.out.println("\t"+planet.getName());
		}
		
		System.out.println();
		HeavenlyBody body = solarSystem.get("Earth");
		System.out.println("Moon of "+ body.getName());
		for(HeavenlyBody jupiterMoon : body.getSatellites()) {
			System.out.println("\t"+jupiterMoon.getName());
		}
		
		Set<HeavenlyBody> moons = new HashSet<>();
		for(HeavenlyBody planet : planets) {
			moons.addAll(planet.getSatellites());
		}
		
		System.out.println();
		System.out.println("All Moon");
		for(HeavenlyBody moon : moons) {
			System.out.println("\t"+moon.getName());
		}
		
		HeavenlyBody pluto = new DwarfPlanet("Pluto",45);
		planets.add(pluto);
		
	    for(HeavenlyBody planet : planets) {
	    	System.out.println(planet);
	    	//System.out.println(planet.getName()+" : "+planet.getOrbitalPeriod());
	    }
	    
	    
		
		/*
		 * By oracle standard documentation, set cannot contain duplicates, but here we can't put two key with same name
		 * This is because the two java objects do not compare equal so the set is happy to accept both of them,
		 * and if we use them as keys in a map same thing will happen as well as we will have two entries in a map
		 * so this is why the equals method has to be overwritten our heavenly body class now the reason that they 
		 * don't compare equal is  because the base object class from which all other classes are derived just defines
		 * a very simple equals method that performs what is known as referential 
		 */
		
	    
	    
	    
		
		
		
		
		
		
		
		
	   
	   
	}
}
