import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.print(solve(n));

		sc.close();
	}

	static String solve(int n) {
		if (n % 2 == 0) {
			return "NO";
		}

		int[] result = new int[n * 2];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				result[i] = i * 2 + 1;
				result[i + n] = i * 2 + 2;
			} else {
				result[i] = i * 2 + 2;
				result[i + n] = i * 2 + 1;
			}
		}

		return String.format("YES\n%s",
				Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
	}
}
