import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; ++tc) {
			int N = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int[] F = new int[N];
			for (int i = 0; i < F.length; ++i) {
				F[i] = sc.nextInt();
			}

			System.out.println(solve(F, a, b, c));
		}

		sc.close();
	}

	static long solve(int[] F, int a, int b, int c) {
		return Arrays.stream(F).mapToLong(x -> (long) Math.abs(x - a) + Math.abs(x - b) + c).min().getAsLong();
	}
}
