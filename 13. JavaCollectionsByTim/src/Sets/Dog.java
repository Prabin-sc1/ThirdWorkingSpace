package Sets;

public class Dog {
	private final String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Dog) {
			String objName = ((Dog) obj).getName();
			return this.name.contentEquals(objName);
		}
		return false;
	}
	
	

}
