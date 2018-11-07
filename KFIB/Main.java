import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static final int MOD_DIVISOR = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(solve(N, K));

		sc.close();
	}

	static int solve(int N, int K) {
		if (N <= K) {
			return 1;
		}

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < K; i++) {
			queue.offer(1);
		}

		int current = K;
		for (int i = 0; i < N - K - 1; i++) {
			queue.offer(current);
			int next = subtractMod(addMod(current, current), queue.poll());

			current = next;
		}
		return current;
	}

	static int addMod(int x, int y) {
		return (x + y) % MOD_DIVISOR;
	}

	static int subtractMod(int x, int y) {
		return (x - y + MOD_DIVISOR) % MOD_DIVISOR;
	}
}
