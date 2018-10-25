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
		int result = (int) Math.floor(Math.sqrt(N * 2));
		while (result * (result + 1) / 2 > N) {
			result--;
		}
		return result;
	}
}
