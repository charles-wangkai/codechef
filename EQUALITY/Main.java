import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			long[] a = new long[N];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextLong();
			}

			System.out.println(
					String.join(" ", Arrays.stream(solve(a)).mapToObj(String::valueOf).toArray(String[]::new)));
		}

		sc.close();
	}

	static int[] solve(long[] a) {
		long sum = Arrays.stream(a).sum() / (a.length - 1);
		return Arrays.stream(a).mapToInt(x -> (int) (sum - x)).toArray();
	}
}
