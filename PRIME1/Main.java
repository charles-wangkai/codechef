import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			if (tc != 0) {
				System.out.println();
			}
			System.out.println(solve(m, n));
		}

		sc.close();
	}

	static String solve(int m, int n) {
		return String.join("\n", IntStream.rangeClosed(m, n).filter(Main::isPrime).mapToObj(String::valueOf)
				.collect(Collectors.toList()));
	}

	static boolean isPrime(int x) {
		if (x < 2) {
			return false;
		}

		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
