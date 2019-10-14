import java.util.Scanner;
import java.util.stream.IntStream;

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

	static int solve(int[] P) {
		return (int) IntStream.range(0, P.length)
				.filter(i -> IntStream.range(Math.max(0, i - 5), i).allMatch(j -> P[j] > P[i])).count();
	}
}
