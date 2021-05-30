import java.util.Scanner;
//French Mathematician Edouward Lucas
public class TOH {

	int TOH(int n, char S, char A, char D) {
		if (n == 1) {
			System.out.println("\nMove disc " + n + " " + S + " to " + D);
			return 0;
		}
		TOH(n - 1, S, D, A);
		System.out.println("\nMove disc " + n + " " + S + " to " + D);
		return TOH(n - 1, A, S, D);

	}

	public static void main(String[] args) {
		TOH tower = new TOH();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of disc");
		int n = s.nextInt();
		tower.TOH(n, 'S', 'A', 'D');
	}
}
