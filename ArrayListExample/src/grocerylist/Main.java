package grocerylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static GroceryList list = new GroceryList();
	
	public static void main(String[] args) {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		
		while(!quit) {
			System.out.println("Enter your choice");
			 choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				list.printList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				quit = true;
				break;
				
			case 7:
				processArrayList();
				break;
				default:
					System.out.println("Invalid choice");
			}
			
		}
		

	}
	
	private static void printInstructions() {
		System.out.println("Enter:\n"+"\t0.to print instructions\n"+"\t1.to print list\n"+"\t2.to add item\n"+"\t3.to mdify item\n"+"\t4.to remove item\n"+"\t5.to search item\n"+"\t6.to quit");
	}
	private static void addItem() {
		System.out.print("Enter item:");
		String item = sc.nextLine();
		list.add(item);
	}
	private static void modifyItem() {
		System.out.println("enter name");
		String index = sc.nextLine();
		System.out.println("enter another item");
		String newItem = sc.nextLine();
		list.modify(index, newItem);
		
	}
	
	private static void removeItem() {
		System.out.println("enter index");
		String i = sc.nextLine();
		list.remove(i);
	}
	private static void searchItem() {
		System.out.println("Item that you wanna search");
		String item = sc.nextLine();
		if(list.onFile(item)) {
			System.out.println("Found "+item+" in your grocery list");
		}else {
			System.out.println(item+" not in your grocery list");
		}
	
	}
	private static void processArrayList() {
		ArrayList<String> newArrayList =  new ArrayList<>();
		newArrayList.addAll(list.getGroceryList());
		
		String[] myArray = new String[list.getGroceryList().size()];
		myArray = list.getGroceryList().toArray(myArray);
	}

}
