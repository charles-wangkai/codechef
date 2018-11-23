import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] banknotes = new int[n];
			for (int i = 0; i < banknotes.length; i++) {
				banknotes[i] = sc.nextInt();
			}

			System.out.println(solve(banknotes, m) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(int[] banknotes, int m) {
		int n = banknotes.length;
		for (int code = 0; code < (1 << n); code++) {
			boolean used[] = decode(code, n);

			if (IntStream.range(0, n).filter(i -> used[i]).map(i -> banknotes[i]).sum() == m) {
				return true;
			}
		}
		return false;
	}

	static boolean[] decode(int code, int size) {
		boolean[] result = new boolean[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = code % 2 == 1;
			code >>= 1;
		}
		return result;
	}
}
