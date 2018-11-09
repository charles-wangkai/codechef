import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int[] x = new int[N];
			for (int i = 0; i < x.length; i++) {
				x[i] = sc.nextInt();
			}

			System.out.println(solve(x, A, B));
		}

		sc.close();
	}

	static double solve(int[] x, int A, int B) {
		return computeProb(x, A) * computeProb(x, B);
	}

	static double computeProb(int[] x, int target) {
		return (double) Arrays.stream(x).filter(element -> element == target).count() / x.length;
	}
}
