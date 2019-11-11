import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long N = sc.nextLong();

			System.out.println(solve(N) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(long N) {
		int exponent10 = 0;
		while (N % 10 == 0) {
			exponent10++;
			N /= 10;
		}

		int exponent2 = 0;
		while (N % 2 == 0) {
			exponent2++;
			N /= 2;
		}

		return N == 1 && exponent10 >= exponent2;
	}
}
