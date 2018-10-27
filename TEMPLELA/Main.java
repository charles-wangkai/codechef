import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		for (int tc = 0; tc < S; tc++) {
			int N = sc.nextInt();
			int[] H = new int[N];
			for (int i = 0; i < H.length; i++) {
				H[i] = sc.nextInt();
			}

			System.out.println(solve(H) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(int[] H) {
		return H.length % 2 != 0
				&& IntStream.range(0, (H.length + 1) / 2).allMatch(i -> H[i] == H[H.length - 1 - i] && H[i] == i + 1);
	}
}
