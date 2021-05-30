package input.output;
import java.util.LinkedHashMap;
import java.util.Map;

public class Location {
	private final int LocationId;
	private final String description;
	private final Map<String, Integer> exits;

	public Location(int locationId, String description, Map<String, Integer> exits) {
		super();
		LocationId = locationId;
		this.description = description;
		if (exits != null) {
			this.exits = new LinkedHashMap<>(exits);
		} else {
			this.exits = new LinkedHashMap<>();
		}
		this.exits.put("Q", 0);
	}

	public int getLocationId() {
		return LocationId;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		// return exits;
		return new LinkedHashMap<>(exits);
		/*
		 * reason behind doing this is that instead of just returning the exits map and
		 * creating a new HashMap and passing out exits in the constructor on line 28
		 * now we've seen that use of the constructor before with the lists it does the
		 * same thing here, so in other words a new HashMap is created that has all the
		 * makings of the exits map now the reasons that this would be useful technique
		 * doing that here is that nothing outside of that class can change exits, so
		 * the getter returns copy of the the exits so if calling program wants to add
		 * or remove mappings from it and the exits mapping field won't be affected
		 * that's really important there so although we don't be using the location
		 * class as a key in the map, we use that later to show some ways to make your
		 * classes immutable and returning immutable object to getter in this way is one
		 * of the technique here to make sure that works
		 */

//	public void addExit(String direction, int location) {
//		exits.put(direction, location);
//	}

//regular expression are pretty cool things
		/*
		 * Strategies for creating immutable class Don't create setter We've done that
		 * so point two is done with us as well we do have references to immutable
		 * object the exits map and we've removed our exits as method that might
		 * modified the map and we also change the constructor and getter exits so that
		 * we're not sharing references to the map looking at that point We didn't
		 * defined the class as final but we defined all are variables so it's not just
		 * overriding methods that can prevent our class from being immutable, adding
		 * new methods that expose our map will also do so and obviously hence
		 * instructions should really read here on part three is probably more accurate
		 * to say don't allow a class to be sub classed and that's actually where the
		 * two recommendations were achieved as we saw in the previous section making a
		 * class final prevents it from being sub class so the more sophisticated
		 * approach of making the constructor private also prevents the class from being
		 * sub classes as well okay .
		 */
	}
	protected void addExit(String direction , int location) {
		exits.put(direction, location);
	}

}
