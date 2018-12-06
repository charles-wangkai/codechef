import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] H = readArray(sc, N);
			int[] K = readArray(sc, N);

			System.out.println(solve(H, K));
		}

		sc.close();
	}

	static int[] readArray(Scanner sc, int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static int solve(int[] H, int[] K) {
		int maxH = Arrays.stream(H).max().getAsInt();
		int[] fillNums = new int[maxH * 2 + 1];
		Arrays.fill(fillNums, -1);
		fillNums[0] = 0;

		Queue<Integer> queue = new LinkedList<>();
		queue.offer(0);
		while (!queue.isEmpty()) {
			int head = queue.poll();

			for (int k : K) {
				int next = head + k;
				if (next < fillNums.length && fillNums[next] == -1) {
					fillNums[next] = fillNums[head] + 1;
					queue.offer(next);
				}
			}
		}

		return Arrays.stream(H).map(h -> fillNums[h * 2]).sum();
	}
}
