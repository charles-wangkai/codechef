import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] C = new int[N];
		for (int i = 0; i < C.length; i++) {
			C[i] = sc.nextInt();
		}
		System.out.println(solve(C) ? "YES" : "NO");

		sc.close();
	}

	static boolean solve(int[] C) {
		return Arrays.stream(C).asLongStream().sum() == (long) C.length * (C.length + 1) / 2;
	}
}
