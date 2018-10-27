import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S) ? "WIN" : "LOSE");
		}

		sc.close();
	}

	static boolean solve(String S) {
		return S.chars().filter(ch -> ch == '1').count() > S.chars().filter(ch -> ch == '0').count();
	}
}
