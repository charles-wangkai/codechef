import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int P = sc.nextInt();
			int[] problems = new int[N];
			for (int i = 0; i < problems.length; i++) {
				problems[i] = sc.nextInt();
			}

			System.out.println(solve(problems, P) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int[] problems, int P) {
		return Arrays.stream(problems).filter(problem -> problem >= P / 2).count() == 1
				&& Arrays.stream(problems).filter(problem -> problem <= P / 10).count() == 2;
	}
}
