import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String s = sc.next();

			System.out.println(solve(s));
		}

		sc.close();
	}

	static int solve(String s) {
		int aCount = (int) s.chars().filter(ch -> ch == 'a').count();

		return Math.min(aCount, s.length() - aCount);
	}
}
