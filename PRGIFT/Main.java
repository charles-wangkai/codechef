import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(solve(a, k) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(int[] a, int k) {
		return !(k == 0 && Arrays.stream(a).allMatch(x -> x % 2 == 0))
				&& Arrays.stream(a).filter(x -> x % 2 == 0).count() >= k;
	}
}
