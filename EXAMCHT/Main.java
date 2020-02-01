import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; ++tc) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(solve(A, B));
		}

		sc.close();
	}

	static int solve(int A, int B) {
		int diff = Math.abs(A - B);
		if (diff == 0) {
			return -1;
		}

		int result = 0;
		for (int i = 1; i * i <= diff; ++i) {
			if (diff % i == 0) {
				++result;

				if (diff / i != i) {
					++result;
				}
			}
		}

		return result;
	}
}
