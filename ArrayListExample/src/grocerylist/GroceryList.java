package grocerylist;

import java.util.ArrayList;

public class GroceryList {
	ArrayList<String> groceryList = new ArrayList<>();

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void setGroceryList(ArrayList<String> groceryList) {
		this.groceryList = groceryList;
	}

	public void add(String item) {
		groceryList.add(item);

	}

	public void printList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + "." + groceryList.get(i));
		}
	}

	public void modify(String oldItem, String newItem) {
		int pos = findItem(oldItem);
		if (pos >= 0) {
			modify(pos, newItem);
			System.out.println("Grocery item " + oldItem + " has been modified.");

		}
	}

	private void modify(int position, String newItem) {
		groceryList.set(position, newItem);
	}

	public void remove(String item) {
		int pos = findItem(item);
		if (pos >= 0) {
			remove(pos);
		}
	}

	private void remove(int position) {
		// String theItem = groceryList.get(position);
		groceryList.remove(position);
	}

	private int findItem(String searchItem) {
		// boolean exists = groceryList.contains(searchItem);
//	 int pos = groceryList.indexOf(searchItem);
//	 if(pos >= 0) {
//		 return groceryList.get(pos);
//	 }
//	 return null;

		return groceryList.indexOf(searchItem);
	}

	public boolean onFile(String searchItem) {
		int pos = findItem(searchItem);
		if (pos >= 0) {
			return true;
		}
		return false;
	}

}
