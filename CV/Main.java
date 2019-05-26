import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			String s = sc.next();

			System.out.println(solve(s));
		}

		sc.close();
	}

	static int solve(String s) {
		return (int) IntStream.range(0, s.length() - 1).filter(i -> !isVowel(s.charAt(i)) && isVowel(s.charAt(i + 1)))
				.count();
	}

	static boolean isVowel(char letter) {
		return "aeiou".indexOf(letter) >= 0;
	}
}
