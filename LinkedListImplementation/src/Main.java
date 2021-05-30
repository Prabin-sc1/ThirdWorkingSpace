
public class Main {

	public static void main(String[] args) {

		MyLinkedList ll = new MyLinkedList(null);
		// ll.traverse(ll.getRoot());

//		String str = "My Name Is Prabin Kumar Shah but in java multiple inheritance is "
//				+ "only available by implementing several interfaces unlike in c "
//				+ "we can use multipe inheritance java child class is inheriting "
//				+ "from base or parent classes java has own garbage value collection"
//				+ " JVM is platform independent java has"
//				+ " thousand of built-in libraries multithreading or concurrency";

		String str = "".toUpperCase();
		String[] data = str.toUpperCase().split(" ");

		for (String s : data) {
			ll.addItem(new Node(s));

			//System.out.println(s);
		}
		ll.traverse(ll.getRoot());
	}

}
