import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] apples = new int[N];
			for (int i = 0; i < apples.length; i++) {
				apples[i] = sc.nextInt();
			}

			System.out.println(solve(apples));
		}

		sc.close();
	}

	static int solve(int[] apples) {
		return (int) Arrays.stream(apples).distinct().count();
	}
}
