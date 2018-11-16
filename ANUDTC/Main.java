import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static String solve(int N) {
		return String.format("%c %c %c", represent(360 % N == 0), represent(N <= 360),
				represent(N * (N + 1) / 2 <= 360));
	}

	static char represent(boolean b) {
		return b ? 'y' : 'n';
	}
}
