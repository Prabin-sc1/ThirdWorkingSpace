import java.util.*;

/*
 * Aug 15 2:39
 */
public class Theatre {
	private final String name;
	private List<Seat> seats = new ArrayList<>();

	static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
		@Override
		public int compare(Seat seat1, Seat seat2) {
			if(seat1.getPrice() < seat2.getPrice()) {
				return -1;
			}else  if(seat1.getPrice() > seat2.getPrice()) {
				return 1;
			}else {
				return 0;
			}
		}
		
	};

	public Theatre(String name, int numRows, int seatsPerRow) {
		this.name = name;

		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				double price = 12.00;
				if ((row < 'E') && (seatNum >= 5 && seatNum <= 9)) {
					price = 14.00;
				} else if ((row > 'F') || (seatNum < 5 || seatNum > 9)) {
					price = 7.00;
				}
				Seat seat = new Seat(row + String.format("%02d", seatNum), price);
				seats.add(seat);
			}
		}

	}

	public String getName() {
		return name;
	}

//	public boolean reserveSeat(String seatNumber) {
//		int low = 0;
//		int high = seats.size()-1;
//		
//		while(low <= high) {
//			System.out.print(".");
//			int mid = (low + high) / 2;
//			Seat midVal = seats.get(mid);
//			int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//			if(cmp < 0) {
//				low = mid + 1;
//			}else if(cmp > 0) {
//				high = mid-1;
//			}else {
//				return seats.get(mid).reserve();
//			}
//		}
//		System.out.println("There is no seat "+seatNumber);
//		return false;
//	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber, 0);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);// null because we are gonna use in-built
																				// comparasion operation
		// The reason behind using binary search is binary search is the fastest way to
		// search element.
		// Over 1 Million data, we can find searched element in just 64 comparison
		if (foundSeat >= 0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("There's is no seat " + seatNumber);
			return false;
		}

//		for (Seat seat : seats) {
//			System.out.print(".");
//			if (seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//			}
//		}
//		if (requestedSeat == null) {
//			System.out.println("There is no seat " + seatNumber);
//			return false;
//		}
//		return requestedSeat.reserve();
	}

	public Collection<Seat> getSeats() {
		return seats;
	}

	public class Seat implements Comparable<Seat> {
		private final String seatNumber;
		// In this case Seat class has only field but could may have more than have one
		// field, at that situation we must use Comparable interface.
		// Computer can't identify which one to compare by own, so we must have to use
		// Comparable interface
		// If we not use Comparable interface then program can be completely
		// shambles(For complex class).

		/*
		 * BinarySearch used merge sort which is very efficient than bubble sort
		 */

		private double price;
		private boolean reserved = false;

		public Seat(String seatNumber, double price) {
			this.seatNumber = seatNumber;
			this.price = price;
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

		public boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved.");
				return true;
			} else {
				return false;
			}
		}

		public boolean cancel() {
			if (this.reserved) {
				this.reserved = false;
				System.out.println("Reservation of seat " + seatNumber + " cancelled");
				return true;
			} else {
				return false;
			}
		}

		public double getPrice() {
			return price;
		}

	}

}
