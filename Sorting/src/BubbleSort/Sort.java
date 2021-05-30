package BubbleSort;

public class Sort {

	public static void main(String[] args) {
		int a[] = { 12, 31, 93, 52, 9 };
		int s = a.length;
		boolean isSorted = true;

		for (int i = 0; i < s - 1; i++) {
			for (int j = 0; j < s - 1 - i; j++) {
				if (a[j + 1] < a[j]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					isSorted = false;

				}
			}
			if (isSorted)
				break;

		}
		for (int item : a) {
			System.out.print(item + " ");
		}

	}

}
