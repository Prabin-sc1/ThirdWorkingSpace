package BusSeatBookingSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bus {
	private String name;
	private List<Seat> seats = new ArrayList<>();

	public Bus(String name, int numRows, int seatPerRows) {
		this.name = name;

		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row < lastRow; row++) {
			for (int numOfSeats = 1; numOfSeats < seatPerRows; numOfSeats++) {
				Seat seat = new Seat(row + String.format("%02d", numOfSeats));
				seats.add(seat);
			}

		}

	}

	public String getName() {
		return name;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		 
		int foundSeat = Collections.binarySearch(seats, requestedSeat,null);//null because we're going to used in-built comparison operation 
		
		if(foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		}else {
			System.out.println("There's not seat "+seatNumber);
			return false;
		}
		
		
//		for (Seat seat : seats) {
//			if (seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//
//			}
//		}
//		if (requestedSeat == null) {
//			System.out.println("There is no seat " + seatNumber);
//			return false;
//		}
//		return requestedSeat.reserve();
	}

	public void getSeats() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}

	private class Seat implements Comparable<Seat> {
		private final String seatNumber;
		private boolean reserved = false;

		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		private boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved.");
				return true;
			} else {
				System.out.println("Someone has already reserve");
				return false;
			}
		}

		private boolean cancel() {
			if (this.reserved) {
				this.reserved = false;
				System.out.println("Reservation of seat " + seatNumber + " cancelled.");
				return true;
			} else {
				return false;
			}
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

	}

}
