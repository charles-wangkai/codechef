import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Long> solutions = buildSolutions();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long a = sc.nextLong();
			long b = sc.nextLong();

			System.out.println(solve(a, b));
		}

		sc.close();
	}

	static List<Long> buildSolutions() {
		List<Long> solutions = new ArrayList<>();
		for (int i = 1; i <= 100000; i++) {
			long square = (long) i * i;

			if (String.valueOf(square).chars().allMatch(ch -> ch == '0' || ch == '1' || ch == '4' || ch == '9')) {
				solutions.add(square);
			}
		}
		return solutions;
	}

	static int pow(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

	static boolean isSquare(long n) {
		int root = (int) Math.round(Math.sqrt(n));
		return (long) root * root == n;
	}

	static int solve(long a, long b) {
		int beginIndex = Collections.binarySearch(solutions, a);
		if (beginIndex < 0) {
			beginIndex = -1 - beginIndex;
		}

		int endIndex = Collections.binarySearch(solutions, b);
		if (endIndex < 0) {
			endIndex = -1 - endIndex - 1;
		}

		return endIndex - beginIndex + 1;
	}
}
