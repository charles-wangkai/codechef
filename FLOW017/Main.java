import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			System.out.println(solve(A, B, C));
		}

		sc.close();
	}

	static int solve(int A, int B, int C) {
		return Arrays.asList(A, B, C).stream().sorted().collect(Collectors.toList()).get(1);
	}
}
