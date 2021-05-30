package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "a compiled high level, object oriented, platform independent language");
		languages.put("Python",
				"an interpreted, object-oriented, platform independent language with dynamic semantics");
		languages.put("C++", "object-oriented programming language");
		languages.put("C", "Structured programming language");
		languages.put("JavaScript", "Scripting language");

		if (languages.containsKey("Java")) {
			System.out.println(languages.get("Java"));
		} else {
			languages.put("Java", "Multithreading available");
			System.out.println(languages.get("Java"));
		}

		System.out.println(
				"--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--");

		languages.remove("C");
		System.out.println(languages.replace("C++", "virtual keyword is used"));
		for (String key : languages.keySet()) { // iterating through loop
			System.out.println(key + " : " + languages.get(key));
		}

	}

}
