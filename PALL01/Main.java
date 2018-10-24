import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N) ? "wins" : "losses");
		}

		sc.close();
	}

	static boolean solve(int N) {
		return N == Integer.parseInt(new StringBuilder(String.valueOf(N)).reverse().toString());
	}
}
