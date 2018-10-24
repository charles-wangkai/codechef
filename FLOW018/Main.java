import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static long solve(int N) {
		return LongStream.rangeClosed(1, N).reduce(1, (x, y) -> x * y);
	}
}
