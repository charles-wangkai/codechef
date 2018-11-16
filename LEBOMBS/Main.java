import java.util.Scanner;
import java.util.stream.IntStream;

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
		return (int) IntStream.range(0, S.length()).filter(i -> S.charAt(i) == '0' && (i == 0 || S.charAt(i - 1) == '0')
				&& (i == S.length() - 1 || S.charAt(i + 1) == '0')).count();
	}
}
