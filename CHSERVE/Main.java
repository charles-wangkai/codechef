import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int P1 = sc.nextInt();
			int P2 = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(P1, P2, K));
		}

		sc.close();
	}

	static String solve(int P1, int P2, int K) {
		return (P1 + P2) / K % 2 == 0 ? "CHEF" : "COOK";
	}
}
