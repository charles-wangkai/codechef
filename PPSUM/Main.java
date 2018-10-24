import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int D = sc.nextInt();
			int N = sc.nextInt();

			System.out.println(solve(D, N));
		}

		sc.close();
	}

	static int solve(int D, int N) {
		int result = N;
		for (int i = 0; i < D; i++) {
			result = result * (result + 1) / 2;
		}
		return result;
	}
}
