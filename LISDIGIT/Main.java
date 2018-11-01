import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[] LIS = new int[n];
			for (int i = 0; i < LIS.length; i++) {
				LIS[i] = sc.nextInt();
			}

			System.out.println(solve(LIS));
		}

		sc.close();
	}

	static int solve(int[] LIS) {
		return Arrays.stream(LIS).reduce(0, (result, element) -> result * 10 + element);
	}
}
