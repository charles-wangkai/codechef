import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S) ? "Good" : "Bad");
		}

		sc.close();
	}

	static boolean solve(String S) {
		return S.contains("010") || S.contains("101");
	}
}
