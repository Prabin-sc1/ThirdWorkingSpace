import java.util.*;

public class ParenthesisMatching {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many parenthesis that you wanna check:");
		int t = s.nextInt();
		s.nextLine();

		while (t-- != 0) { // t times looping
			System.out.println("Please Enter String of parentthesis..");
			String str = s.nextLine();
			Stack<Character> stack = new Stack<>();

			boolean isBalanced = true;

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				
				if (ch == '(' || ch == '{' || ch == '[') {
					stack.push(ch);
					continue;
				}
				if(stack.isEmpty()) {
					isBalanced=false;
					break;
				}
				if (ch == ')') {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						isBalanced = false;
						break;
					}
				}
				if (ch == '}') {
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						isBalanced = false;
						break;
					}
				}
				if (ch == ']') {
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						isBalanced = false;
						break;
					}
				}
			}
			if (!stack.isEmpty()) {
				isBalanced = false;
			}

			if (isBalanced) {
				System.out.println("Balanced");
			} else {
				System.out.println("Not balanced");
			}

		}

	}

}
