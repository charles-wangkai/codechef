import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			String S = sc.next();

			System.out.println(solve(S));
		}

		sc.close();
	}

	static int solve(String S) {
		return S.length() - Math.max(Math.max(count(S, 'R'), count(S, 'G')), count(S, 'B'));
	}

	static int count(String S, char target) {
		return (int) S.chars().filter(ch -> ch == target).count();
	}
}
