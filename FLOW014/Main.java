import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			double hardness = sc.nextDouble();
			double carbon = sc.nextDouble();
			double tensile = sc.nextDouble();

			System.out.println(solve(hardness, carbon, tensile));
		}

		sc.close();
	}

	static int solve(double hardness, double carbon, double tensile) {
		boolean condition1 = hardness > 50;
		boolean condition2 = carbon < 0.7;
		boolean condition3 = tensile > 5600;

		if (condition1 && condition2 && condition3) {
			return 10;
		} else if (condition1 && condition2) {
			return 9;
		} else if (condition2 && condition3) {
			return 8;
		} else if (condition1 && condition3) {
			return 7;
		} else if (condition1 || condition2 || condition3) {
			return 6;
		} else {
			return 5;
		}
	}
}
