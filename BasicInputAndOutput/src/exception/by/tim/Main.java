package exception.by.tim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	/*
	 * LBYL - LookBeforeYouLeap
	 * EAFP - EasyToAskForForgivenessThanPermission
	 */

	public static void main(String[] args) {
		int x = 9;
		int y = 0;
		
		System.out.println(divideLBYL(x,y));
		System.out.println(divideEAFP(x,y));
//		System.out.println(divide(x,y));
//		int p = getIntLBYL();
//		System.out.println("p Is "+p);
		int a = getIntEAFP();
		System.out.println(a);
	}
	
	private static int getIntLBYL() {
		Scanner s = new Scanner(System.in);
		boolean isValid = true;
		System.out.print("Enter an integer: ");
		String input = s.next();
		for(int i = 0; i < input.length(); i++) {
			if(!Character.isDigit(input.charAt(i))) {
				isValid = false;
				break;
			}
		}
		if(isValid) {
			return Integer.parseInt(input);
		}
		return 0;
	}
	
	private static int getIntEAFP() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		try {
			return s.nextInt();
		}catch(InputMismatchException e) {
			return 0;
		}
	}
	
	private static int divideLBYL(int x , int y) {
		if(y != 0) {
			return x/y;
		}else {
			return 0;
		}
	}
	
	private static int divideEAFP(int x , int y) {
		try {
			return x/y;
		}catch(Exception e) {
			
			
			return 0;
		}
	}
	
	private static int divide(int x, int y) {
		return x/y;
	}

}

