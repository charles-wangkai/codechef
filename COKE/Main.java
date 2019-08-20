import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			int L = sc.nextInt();
			int R = sc.nextInt();
			int[] C = new int[N];
			int[] P = new int[N];
			for (int i = 0; i < N; i++) {
				C[i] = sc.nextInt();
				P[i] = sc.nextInt();
			}

			System.out.println(solve(C, P, M, K, L, R));
		}

		sc.close();
	}

	static int solve(int[] C, int[] P, int M, int K, int L, int R) {
		return IntStream.range(0, C.length).filter(i -> {
			int temperature = C[i];
			for (int j = 0; j < M; j++) {
				if (temperature > K + 1) {
					temperature--;
				} else if (temperature < K - 1) {
					temperature++;
				} else {
					temperature = K;
				}
			}

			return temperature >= L && temperature <= R;
		}).map(i -> P[i]).min().orElse(-1);
	}
}
