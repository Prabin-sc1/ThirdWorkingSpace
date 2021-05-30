package Sets;

import java.util.HashSet;
import java.util.Set;

/*
 * Aug 27, 8:00 PM, Thu
 */
public abstract class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	private final BodyTypes bodyType;
	
	public enum BodyTypes {
		STAR,
		PLANET,
		DWARF_PLANET,
		MOON,
		COMET,
		ASTEROID
	}
/*
 * why enum?
 * 1.because we get compile time error instead of run time error, this was really great ( runtime errors makes your mind completely shambles )
 */
	public HeavenlyBody(String name, double orbitalPeriod,BodyTypes bodyType) {
		super();
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
		this.bodyType = bodyType;
	}

	public String getName() {
		return name;
	}

	public BodyTypes getBodyType() {
		return bodyType;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public boolean addSatellite(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
		// instead of returning our objects, we're going to create a new to object and
		// return it so there can be no weird things happening with our own object and
		// just for security reasons.
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

//		System.out.println("obj.getClass() is " + obj.getClass());
//		System.out.println("this.getClass() is " + this.getClass());
//
//		if ((obj == null) || (obj.getClass() != this.getClass())) {
//			return false;
//		}
		
		if(obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody) obj;
			if(this.name.equals(theObject.getName())) {
				return this.bodyType == theObject.getBodyType();
			}
		}
		return false;
//		String objName = ((HeavenlyBody) obj).getName();
//		return this.name.equals(objName);
	}

	@Override
	public final int hashCode() {
		//return super.hashCode();
		return this.name.hashCode() + 57 + this.bodyType.hashCode();
		//return 0;
	}

	@Override
	public String toString() {
		return this.name + ": "+this.bodyType + ", " + this.orbitalPeriod;
	}
	
	public static final class Key{
		private String name;
		private BodyTypes bodyType;
		
		private Key(String name, BodyTypes bodyTypes) {
			this.name= name;
			this.bodyType = bodyType;
		}

		public String getName() {
			return name;
		}

		public BodyTypes getBodyType() {
			return bodyType;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.name.hashCode() + 57 +this.bodyType.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Key key = (Key) obj;
			if(this.name.equals(key.getName())) {
				return(this.bodyType == key.getBodyType());
			}
			return false;
		}
		/*
		 * Remaining part are skipped for some while, after some better understanding  of HashMap from other lecturer, obviously i return back 
		 * and fulfill remaining part of code .(Sep1 Lecture no. 19 by Tim)
		 */
		
		
	}
	
	

}
