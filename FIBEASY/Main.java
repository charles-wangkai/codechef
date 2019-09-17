import java.util.Scanner;

public class Main {
	static int cycle = findCycle();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			long N = sc.nextLong();

			System.out.println(solve(N));
		}
		sc.close();
	}

	static int findCycle() {
		int cycle = 1;
		int curr = 1;
		int next = 1;
		while (!(curr == 0 && next == 1)) {
			int nextNext = (curr + next) % 10;

			curr = next;
			next = nextNext;
			cycle++;
		}

		return cycle;
	}

	static int solve(long N) {
		int curr = 0;
		int next = 1;
		for (int i = (int) (((1L << (Long.toBinaryString(N).length() - 1)) % cycle)) - 1; i > 0; i--) {
			int nextNext = (curr + next) % 10;

			curr = next;
			next = nextNext;
		}

		return curr;
	}
}
