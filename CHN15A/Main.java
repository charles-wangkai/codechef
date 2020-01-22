import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; ++tc) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] values = new int[N];
			for (int i = 0; i < values.length; ++i) {
				values[i] = sc.nextInt();
			}

			System.out.println(solve(values, K));
		}

		sc.close();
	}

	static int solve(int[] values, int K) {
		return (int) Arrays.stream(values).filter(x -> (x + K) % 7 == 0).count();
	}
}
