import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] P = new int[N];
			for (int i = 0; i < P.length; i++) {
				P[i] = sc.nextInt();
			}

			System.out.println(solve(P));
		}

		sc.close();
	}

	static long solve(int[] P) {
		int min = Arrays.stream(P).min().getAsInt();
		return (Arrays.stream(P).asLongStream().sum() - min) * min;
	}
}
