import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int G = sc.nextInt();
			for (int game = 0; game < G; game++) {
				int I = sc.nextInt();
				int N = sc.nextInt();
				int Q = sc.nextInt();

				System.out.println(solve(I, N, Q));
			}
		}

		sc.close();
	}

	static int solve(int I, int N, int Q) {
		return (N % 2 != 0 && I != Q) ? (N / 2 + 1) : (N / 2);
	}
}
