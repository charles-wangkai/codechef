import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();

			System.out.println(solve(X, Y, Z) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int X, int Y, int Z) {
		int[] diffs = IntStream.of(X, Y, Z).sorted().toArray();
		return diffs[0] + diffs[1] == diffs[2];
	}
}
