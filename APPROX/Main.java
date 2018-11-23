import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int K = sc.nextInt();

			System.out.println(solve(K));
		}

		sc.close();
	}

	static String solve(int K) {
		StringBuilder result = new StringBuilder();
		int numerator = 103993;
		int denominator = 33102;
		for (int i = 0; i < K + 1; i++) {
			if (i == 1) {
				result.append(".");
			}

			result.append(numerator / denominator);
			numerator = numerator % denominator * 10;
		}
		return result.toString();
	}
}
