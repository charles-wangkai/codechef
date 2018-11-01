import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	static String[] DAY_NAMES = { "mon", "tues", "wed", "thurs", "fri", "sat", "sun" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int W = sc.nextInt();
			String S = sc.next();

			System.out.println(String.join(" ",
					Arrays.stream(solve(W, S)).mapToObj(String::valueOf).collect(Collectors.toList())));
		}

		sc.close();
	}

	static int[] solve(int W, String S) {
		int[] result = new int[7];
		int startDay = Arrays.asList(DAY_NAMES).indexOf(S);
		for (int i = 0; i < W; i++) {
			result[(startDay + i) % result.length]++;
		}
		return result;
	}
}
