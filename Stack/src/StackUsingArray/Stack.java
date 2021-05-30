package StackUsingArray;

public class Stack {
	int[] s;
	int top = -1;
	
	public Stack() {
		super();
        s = new int[5];
	}

	public void push(int x) {
		if(top > 4) {
			System.out.println("stack overflow");
			return;
		}
		s[++top] = x;
		System.out.println("Inserted "+x);
	}
	
	public void pop() {
		if(top < 0) {
			System.out.println("stack is empty");
			return;
		}
		System.out.println("deleted "+s[top--]);
	}
	
	public void display() {
		if(top < 0) {
			System.out.println("stack is empty");
		}
		
		for(int i = top;i>=0;i--) {
			System.out.println(s[i]);
		}
	}

}
