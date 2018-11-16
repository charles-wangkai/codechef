import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();

			System.out.println(solve(N, A, B));
		}

		sc.close();
	}

	static int solve(int N, int A, int B) {
		int oneNumA = Integer.bitCount(A);
		int oneNumB = Integer.bitCount(B);

		int resultOneNum = oneNumA + oneNumB;
		int bits = N;
		while (resultOneNum > bits) {
			resultOneNum -= 2;
			bits--;
		}

		return Integer.parseInt(repeat('1', resultOneNum) + repeat('0', N - resultOneNum), 2);
	}

	static String repeat(char ch, int count) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < count; i++) {
			result.append(ch);
		}
		return result.toString();
	}
}
