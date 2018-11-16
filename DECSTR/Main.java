import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int K = sc.nextInt();

			System.out.println(solve(K));
		}

		sc.close();
	}

	static String solve(int K) {
		String result = "";
		int offset = 0;
		while (K > 0) {
			result = (char) ('a' + offset) + result;

			if (result.length() > 1 && result.charAt(0) > result.charAt(1)) {
				K--;
			}

			offset = (offset + 1) % 26;
		}
		return result;
	}
}
