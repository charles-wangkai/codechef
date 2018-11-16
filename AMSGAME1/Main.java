import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static int solve(int[] A) {
		return Arrays.stream(A).reduce(Main::gcd).getAsInt();
	}

	static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}
