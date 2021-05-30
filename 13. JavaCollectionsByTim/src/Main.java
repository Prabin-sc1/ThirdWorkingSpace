import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("QFX",12,15);
		
		if(theatre.reserveSeat("D11")) {
			System.out.println("please pay");
		}else {
			System.out.println("seat is already reserved");
		}
	
		List<Theatre.Seat> reversedSeats = new ArrayList<>(theatre.getSeats());
		Collections.reverse(reversedSeats);
		printList(reversedSeats);
		
		List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
		priceSeats.add(theatre.new Seat("B00",13.00));
		priceSeats.add(theatre.new Seat("A00",13.00));
		Collections.sort(priceSeats,Theatre.PRICE_ORDER);
		printList(priceSeats);

		
		
	}
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.print(" "+seat.getSeatNumber()+" "+seat.getPrice());
		}
		System.out.println();
		System.out.println("================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================");
		
	}
	
 
}
