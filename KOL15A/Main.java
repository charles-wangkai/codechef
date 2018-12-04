import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();

			System.out.println(solve(S));
		}

		sc.close();
	}

	static int solve(String S) {
		return S.chars().filter(Character::isDigit).map(ch -> ch - '0').sum();
	}
}
