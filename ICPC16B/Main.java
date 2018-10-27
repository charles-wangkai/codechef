import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(solve(a) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int[] a) {
		int zeroCount = count(a, 0);
		int positiveOneCount = count(a, 1);
		int negativeOneCount = count(a, -1);
		int otherCount = a.length - zeroCount - positiveOneCount - negativeOneCount;

		return otherCount <= 1 && (otherCount == 0 || negativeOneCount == 0)
				&& (negativeOneCount <= 1 || positiveOneCount >= 1);
	}

	static int count(int[] a, int target) {
		return (int) Arrays.stream(a).filter(x -> x == target).count();
	}
}
