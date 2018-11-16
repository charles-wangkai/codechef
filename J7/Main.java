import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int P = sc.nextInt();
			int S = sc.nextInt();

			System.out.printf("%.2f\n", solve(P, S));
		}

		sc.close();
	}

	static double solve(int P, int S) {
		return computeVolume(P, S, (P - Math.sqrt(P * P - 24 * S)) / 12);
	}

	static double computeVolume(int P, int S, double c) {
		return (S / 2.0 - c * (P / 4.0 - c)) * c;
	}
}
