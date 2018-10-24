import java.util.Scanner;

public class Main {
	static final int[] NOTES = { 100, 50, 10, 5, 2, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static int solve(int N) {
		int result = 0;
		for (int i = 0; i < NOTES.length; i++) {
			result += N / NOTES[i];
			N %= NOTES[i];
		}
		return result;
	}
}
