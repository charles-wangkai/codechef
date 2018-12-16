import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String s = sc.next();

			System.out.println(solve(s) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(String s) {
		return IntStream.range(0, s.length() / 2)
				.allMatch(i -> Arrays.asList("AB", "BA").contains(s.substring(i * 2, i * 2 + 2)));
	}
}
