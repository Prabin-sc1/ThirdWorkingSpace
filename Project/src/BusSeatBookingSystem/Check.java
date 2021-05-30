package BusSeatBookingSystem;

public class Check {

	public static void main(String[] args) {
		Bus bus = new Bus("Janakpur",8,4);
		bus.getSeats();
		

		bus.reserveSeat("B02");
		bus.reserveSeat("B02");
			
		

	}

}
