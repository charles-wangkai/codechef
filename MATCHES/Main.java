import java.util.Scanner;

public class Main {
	static final int[] MATCH_NUMS = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(solve(A, B));
		}

		sc.close();
	}

	static int solve(int A, int B) {
		return String.valueOf(A + B).chars().map(ch -> MATCH_NUMS[ch - '0']).sum();
	}
}
