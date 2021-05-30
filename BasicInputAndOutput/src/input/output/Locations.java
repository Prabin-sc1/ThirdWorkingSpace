package input.output;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Locations implements Map<Integer, Location> {
	private static Map<Integer, Location> locations = new LinkedHashMap<>();

	public static void main(String[] args) throws IOException {
		//
		// try (BufferedWriter locFile = new BufferedWriter(new
		// FileWriter("locations.txt"));
		// BufferedWriter dirFile = new BufferedWriter(new
		// FileWriter("directions.txt"))) {
		// for (Location location : locations.values()) {
		// locFile.write(location.getLocationId() + "," + location.getDescription() +
		// "\n");
		// for (String direction : location.getExits().keySet()) {
		//
		// if(!direction.equalsIgnoreCase("Q")) {
		// dirFile.write(location.getLocationId() + "," + direction + "," +
		// location.getExits().get(direction)
		// + "\n");
		// }
		// }
		// }
		//
		// }
		// // FileWriter locFile = null;
		// // try {
		// // locFile = new FileWriter("locations.txt");
		// // for(Location location : locations.values()) {
		// //
		// // locFile.write(location.getLocationId()+ ",
		// "+location.getDescription()+"\n");
		// //
		// // }
		// //
		// // }finally {
		// // System.out.println("You are in finally block");
		// // if(locFile != null) {
		// // System.out.println("Closing locFile");
		// // locFile.close();
		// // }
		// //
		// // }

		try (DataOutputStream locFile = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("locations.dat")))) {

			for (Location location : locations.values()) {
				locFile.writeInt(location.getLocationId());
				locFile.writeUTF(location.getDescription());
				System.out
						.println("Writing locations: " + location.getLocationId() + " : " + location.getDescription());
				System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
				locFile.write(location.getExits().size() - 1);

				for (String direction : location.getExits().keySet()) {
					if (!direction.equalsIgnoreCase("Q")) {
						System.out.println("\t\t" + direction + ", " + location.getExits().get(direction));
						locFile.writeUTF(direction);
						locFile.writeInt(location.getExits().get(direction));
					}
				}
			}

		}
	}

	static {
		try (DataInputStream locFile = new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))){
			while(true) {
				Map<String, Integer> exits = new LinkedHashMap<>();
				int locId = locFile.readInt();
				String description = locFile.readUTF();
				int numExits = locFile.readInt();
				System.out.println("Read Location "+locId+" : "+description);
				System.out.println("Found "+numExits + " exits");
				for(int i = 0;i<numExits;i++) {
					String direction = locFile.readUTF();
					int destination = locFile.readInt();
					exits.put(direction, destination);
					System.out.println("\t\t"+direction+","+destination);
				}
				locations.put(locId, new Location(locId,description,exits));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	// try (Scanner s = new Scanner(new BufferedReader(new
	// FileReader("locations.txt")))) {
	// // s = new Scanner(new FileReader("locations.txt"));
	// s.useDelimiter(",");
	// while (s.hasNextLine()) {
	// int loc = s.nextInt();
	// s.skip(s.delimiter());
	// String description = s.nextLine();
	// System.out.println("Imported map: " + loc + ": " + description);
	// Map<String, Integer> tempExit = new HashMap<>();
	// locations.put(loc, new Location(loc, description, tempExit));
	// }
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	//
	// // now the read code for exits
	//
	// try (BufferedReader dirFile = new BufferedReader(new
	// FileReader("directions.txt"))) {
	// // s = new Scanner(new BufferedReader(new FileReader("directions.txt")));
	// // s.useDelimiter(",");
	// String input;
	// while ((input = dirFile.readLine()) != null) {
	// // int loc = s.nextInt();
	// // s.skip(s.delimiter());
	// // String direction = s.next();
	// // s.skip(s.delimiter());
	// // String dest = s.nextLine();
	// // int destination = Integer.parseInt(dest);
	// // String input = s.nextLine();
	//
	// String[] data = input.split(",");
	// int loc = Integer.parseInt(data[0]);
	// String direction = data[1];
	// int destination = Integer.parseInt(data[2]);
	//
	// System.out.println(loc + ": " + direction + ": " + destination);
	// Location location = locations.get(loc);
	// location.addExit(direction, destination);
	// }
	// } catch (IOException e) {
	// e.printStackTrace();
	//
	// }
	// Map<String, Integer> tempExit = new HashMap<>();
	// locations.put(0, new Location(0, "Outside the house", null));
	//
	// tempExit = new HashMap<>();
	//
	// tempExit.put("W", 5);
	// /*
	// * map literals are still not available in Java which is a bit annoying, so as
	// a
	// * result we really have to use repeated calls to add exit for each location
	// */
	// // tempExit = new HashMap<>();
	// tempExit.put("W", 5);
	// tempExit.put("S", 4);
	// tempExit.put("A", 2);
	// tempExit.put("D", 3);
	// locations.put(1, new Location(1, "Aagan", tempExit));
	//
	// tempExit.put("W", 5);
	// locations.put(2, new Location(2, "You are in Kitchen ", tempExit));
	//
	// tempExit = new HashMap<>();
	// tempExit.put("A", 1);
	// locations.put(3, new Location(3, "You are in Hall", tempExit));
	//
	// tempExit = new HashMap<>();
	// tempExit.put("W", 1);
	// tempExit.put("A", 2);
	// locations.put(4, new Location(4, "You in your Bedroom", tempExit));
	//
	// tempExit = new HashMap<>();
	// tempExit.put("S", 1);
	// tempExit.put("A", 2);
	// locations.put(5, new Location(5, "You are in Guestroom", tempExit));



	@Override
	public int size() {

		return locations.size();
	}

	@Override
	public boolean isEmpty() {

		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {

		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {

		return locations.containsValue(value);
	}

	@Override
	public Location get(Object key) {

		return locations.get(key);
	}

	@Override
	public Location put(Integer key, Location value) {

		return locations.put(key, value);
	}

	@Override
	public Location remove(Object key) {

		return locations.remove(key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {

	}

	@Override
	public void clear() {
		locations.clear();

	}

	@Override
	public Set<Integer> keySet() {

		return locations.keySet();
	}

	@Override
	public Collection<Location> values() {

		return locations.values();
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {

		return locations.entrySet();
	}

}
//shift write 0 fill operator >>>
