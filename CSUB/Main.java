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

	static long solve(String S) {
		int oneNum = (int) S.chars().filter(ch -> ch == '1').count();
		return (long) oneNum * (oneNum + 1) / 2;
	}
}
