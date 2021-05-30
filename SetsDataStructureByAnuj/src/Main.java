import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<>();
		a.add(43);
		a.add(75);
		a.add(8);
		
		Set<Integer> b = new HashSet<>();
		b.add(4);
		b.add(94);
		b.add(43);
		
		a.retainAll(b);
		System.out.println(a);


	}

}
