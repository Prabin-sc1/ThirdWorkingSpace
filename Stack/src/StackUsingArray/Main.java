package StackUsingArray;

import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static Stack stack = new Stack();
	public static void main(String[] args) {
	   boolean quit = false;
	   while(!quit) {
		   System.out.println("Enter your choice");
		   int choice = s.nextInt();
		   s.nextLine();
		   
		   switch(choice) {
		   case 1:
			   System.out.println("Enter the elements");
			   int c =  s.nextInt();
			   s.nextLine();
			  stack.push(c);
			  break;
		   case 2:
			   stack.pop();
			   break;
			   
		   case 3:
			   stack.display();
			   break;
			   
			  
		   }
	   }

	}

}
