import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] elements = new int[N];
			for (int i = 0; i < elements.length; i++) {
				elements[i] = sc.nextInt();
			}

			System.out.println(solve(elements, K));
		}

		sc.close();
	}

	static String solve(int[] elements, int K) {
		return (Arrays.stream(elements).map(x -> x % 2).sum() % 2 == 0 && K == 1) ? "odd" : "even";
	}
}
