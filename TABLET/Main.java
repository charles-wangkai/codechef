import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			int[] W = new int[N];
			int[] H = new int[N];
			int[] P = new int[N];
			for (int i = 0; i < N; i++) {
				W[i] = sc.nextInt();
				H[i] = sc.nextInt();
				P[i] = sc.nextInt();
			}

			System.out.println(solve(W, H, P, B));
		}

		sc.close();
	}

	static String solve(int[] W, int[] H, int[] P, int B) {
		OptionalInt maxArea = IntStream.range(0, W.length).filter(i -> B >= P[i]).map(i -> W[i] * H[i]).max();
		return maxArea.isPresent() ? String.valueOf(maxArea.getAsInt()) : "no tablet";
	}
}
