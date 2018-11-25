import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static final String[] DAY_NAMES = { "saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String S = sc.next();
			String E = sc.next();
			int L = sc.nextInt();
			int R = sc.nextInt();

			System.out.println(solve(S, E, L, R));
		}

		sc.close();
	}

	static String solve(String S, String E, int L, int R) {
		int startIndex = Arrays.asList(DAY_NAMES).indexOf(S);
		int[] durations = IntStream.rangeClosed(L, R)
				.filter(d -> DAY_NAMES[(startIndex + d - 1) % DAY_NAMES.length].equals(E)).toArray();

		if (durations.length == 0) {
			return "impossible";
		} else if (durations.length >= 2) {
			return "many";
		} else {
			return String.valueOf(durations[0]);
		}
	}
}
