import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long N = sc.nextLong();
			long K = sc.nextLong();

			System.out.println(solve(N, K) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(long N, Long K) {
		return N / K % K != 0;
	}
}
