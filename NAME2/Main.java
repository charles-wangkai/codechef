import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String M = sc.next();
			String W = sc.next();

			System.out.println(solve(M, W) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String M, String W) {
		return (M.length() <= W.length()) ? isSubsequence(M, W) : isSubsequence(W, M);
	}

	static boolean isSubsequence(String x, String y) {
		int beginIndex = 0;
		for (char ch : x.toCharArray()) {
			int index = y.indexOf(ch, beginIndex);
			if (index < 0) {
				return false;
			}

			beginIndex = index + 1;
		}
		return true;
	}
}
