import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int T1 = sc.nextInt();
			int T2 = sc.nextInt();
			int T3 = sc.nextInt();
			int T4 = sc.nextInt();

			System.out.println(solve(T1, T2, T3, T4));
		}

		sc.close();
	}

	static double solve(int T1, int T2, int T3, int T4) {
		return (double) T1 / (T1 + T2);
	}
}
