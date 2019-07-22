import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			String S = sc.next();
			String R = sc.next();

			System.out.println(solve(S, R) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(String S, String R) {
		return S.chars().filter(ch -> ch == '1').count() == R.chars().filter(ch -> ch == '1').count();
	}
}
