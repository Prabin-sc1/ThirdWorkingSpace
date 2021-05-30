package input.output;

import java.util.*;

public class Check {
	// private static Map<Integer, Location> locations = new HashMap<>();
	private static Locations locations = new Locations();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		Map<String, String> vocabulary = new HashMap<>();
		vocabulary.put("QUIT", "Q");
		vocabulary.put("LEFT", "A");
		vocabulary.put("RIGHT", "D");
		vocabulary.put("UP", "W");
		vocabulary.put("DOWN", "S");

		int loc = 1;
		while (true) {
			System.out.println(locations.get(loc).getDescription());
			//tempExit.remove("S");

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
			

			if (!locations.containsKey(loc)) {
				System.out.println("You cannot go in that direction.");
			}
		}

	}

}
/*
 * immutable class is a great way to increase encapsulation and reduce errors
 * even if you are going to allow external code to modify your class instances
 */
