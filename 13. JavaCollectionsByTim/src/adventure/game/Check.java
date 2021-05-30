package adventure.game;

import java.util.*;

public class Check {
	private static Map<Integer, Location> locations = new HashMap<>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Map<String , Integer> tempExit = new HashMap<>();
		locations.put(0, new Location(0, "Outside the house",null));
		
		
		
		
		

		tempExit = new HashMap<>();
		
		tempExit.put("W", 5);
		/*
		 * map literals are still not available in Java which is a bit annoying, so as a
		 * result we really have to use repeated calls to add exit for each location
		 */
		//tempExit = new HashMap<>();
		tempExit.put("W", 5);
		tempExit.put("S", 4);
		tempExit.put("A", 2);
		tempExit.put("D", 3);
		locations.put(1, new Location(1, "Aagan",tempExit));

		tempExit.put("W", 5);
		locations.put(2, new Location(2, "You are in Kitchen ",tempExit));

		tempExit = new HashMap<>();
		tempExit.put("A", 1);
		locations.put(3, new Location(3, "You are in Hall",tempExit));

		tempExit = new HashMap<>();
		tempExit.put("W", 1);
		tempExit.put("A", 2);
		locations.put(4, new Location(4, "You in your Bedroom",tempExit));

		tempExit = new HashMap<>();
		tempExit.put("S", 1);
		tempExit.put("A", 2);
		locations.put(5, new Location(5, "You are in Guestroom",tempExit));

		Map<String, String> vocabulary = new HashMap<>();
		vocabulary.put("QUIT", "Q");
		vocabulary.put("LEFT", "A");
		vocabulary.put("RIGHT", "D");
		vocabulary.put("UP", "W");
		vocabulary.put("DOWN", "S");

		int loc = 1;
		while (true) {
			System.out.println(locations.get(loc).getDescription());
			tempExit.remove("S");

			if (loc == 0) {
				break;
			}
			Map<String, Integer> exits = locations.get(loc).getExits();
			System.out.println("Available exits are:");
			for (String out : exits.keySet()) {
				System.out.print(out + ", ");

			}
			System.out.println();
			
			String direction = s.nextLine().toUpperCase();
			
			if (direction.length() > 1) {
				String[] words = direction.split(" ");
				for (String word : words) {
					if (vocabulary.containsKey(word)) {
						direction = vocabulary.get(word);
						break;
					}
				}
			}
			if (exits.containsKey(direction)) {
				loc = exits.get(direction);
			} else {
				System.out.println("You cannot go in that direction.");
			}
			// loc = s.nextInt();

			if (!locations.containsKey(loc)) {
				System.out.println("You cannot go in that direction.");
			}
		}

	}

}
/*
 * immutable class is a great way to increase encapsulation and reduce errors even if you are going to allow external code to modify your class instances
 */



















