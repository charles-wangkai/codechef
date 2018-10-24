import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int quantity = sc.nextInt();
			int price = sc.nextInt();

			System.out.printf("%.6f\n", solve(quantity, price));
		}

		sc.close();
	}

	static double solve(int quantity, int price) {
		return (quantity > 1000 ? 0.9 : 1.0) * quantity * price;
	}
}
