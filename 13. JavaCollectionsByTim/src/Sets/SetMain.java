package Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 7:26, Aug 29
 * Fast
 */
public class SetMain {

	public static void main(String[] args) {
		Set<Integer> squares = new HashSet<>();
		Set<Integer>cubes = new HashSet<>();
		
		for(int i = 1; i<=100; i++) {
			squares.add(i*i);
			cubes.add(i*i*i);
		}
		System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes." );
		
		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		System.out.println("Union contains "+union.size()+" elements.");
		
		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes);
		System.out.println("Intersection contains "+intersection.size()+" elements.");
		
		for(int i : intersection) {
			System.out.println(i+" is square of "+Math.sqrt(i)+" and cube of "+Math.cbrt(i));
		}
		
		
		System.out.println();
		
		for(int i : union) {
			System.out.println(i+" is square of "+Math.sqrt(i)+" and cube of "+Math.cbrt(i));
		}
		
		System.out.println();
		
		
		Set<String> myName = new HashSet<>();
		String[] myNameIs = "my name is prabin kumar shah".split(" ");
		myName.addAll(Arrays.asList(myNameIs));
		
		for(String s : myName) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Set<String> myBrotherName = new HashSet<>();
		String[] myBrotherNameIs = "my name is subhash kumar shah".split(" ");
		myBrotherName.addAll(Arrays.asList(myBrotherNameIs));
		
		for(String s : myBrotherName) {
			System.out.println(s);
		}
		
		Set<String> nature = new HashSet<>();
		Set<String> divine = new HashSet<>();
		
		//String[] natureWords = {"all", "nature" ,"is", "but", "art", "unknown", "to", "thee"};
		String[] natureWords = "all nature is but art unknown to thee".split(" ");
		nature.addAll(Arrays.asList(natureWords));
		
		//String[] divineWords = { " to ","err" ,"is" ,"human", "to", "forgive", "divine"};
		String[] divineWords = " to err is human to forgive divine".split(" ");
		divine.addAll(Arrays.asList(divineWords));
		
		
		System.out.println("nature - divine");
		Set<String> diff1 = new HashSet<>(nature);
		diff1.removeAll(divine);
		printSet(diff1);
		

		System.out.println("divine - nature");
		Set<String> diff2 = new HashSet<>(divine);
		diff2.removeAll(nature);
		printSet(diff2);
		
		Set<String> unionTest = new HashSet<>(nature);
		unionTest.addAll(divine);
		
		Set<String> intersectionTest = new HashSet<>(nature);
		intersectionTest.retainAll(divine);
		
		System.out.println("Symmetric difference");//complement of (A and B)
		unionTest.removeAll(intersectionTest);
		printSet(unionTest);
		
		if(nature.containsAll(divine)) {
			System.out.println("divine is subset of nature");
		}
		
		if(nature.containsAll(intersectionTest)) {
			System.out.println("intersection is subset of nature");
		}
		
		if(divine.containsAll(intersectionTest)) {
			System.out.println("intersection is subset of divine");
		}
		
		

	}
		
		private static void printSet(Set<String> set) {
			System.out.print("\t");
			for(String s : set) {
				System.out.print(s+" ");
			}
			System.out.println();
			
			
		}
		
		
		
	}

