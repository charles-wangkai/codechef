import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] v = new int[N];
			for (int i = 0; i < v.length; i++) {
				v[i] = sc.nextInt();
			}

			System.out.println(solve(v));
		}

		sc.close();
	}

	static int solve(int[] v) {
		Arrays.sort(v);

		return IntStream.range(0, v.length - 1).map(i -> v[i + 1] - v[i]).min().getAsInt();
	}
}
