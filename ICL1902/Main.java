import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			System.out.println(solve(N));
		}

		sc.close();
	}

	static int solve(int N) {
		int result = 0;
		while (N != 0) {
			int root = (int) Math.round(Math.sqrt(N));
			if (root * root > N) {
				root--;
			}

			N -= root * root;
			result++;
		}
		return result;
	}
}
