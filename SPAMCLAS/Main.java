import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int minX = sc.nextInt();
			int maxX = sc.nextInt();
			int[] w = new int[N];
			int[] b = new int[N];
			for (int i = 0; i < N; i++) {
				w[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}

			System.out.println(solve(minX, maxX, w, b));
		}

		sc.close();
	}

	static String solve(int minX, int maxX, int[] w, int[] b) {
		int inputNum = maxX - minX + 1;
		int even = inputNum / 2;
		int odd = inputNum / 2;
		if (!isEven(inputNum)) {
			if (isEven(minX)) {
				even++;
			} else {
				odd++;
			}
		}

		for (int i = 0; i < w.length; i++) {
			if (isEven(w[i])) {
				if (isEven(b[i])) {
					even = inputNum;
					odd = 0;
				} else {
					even = 0;
					odd = inputNum;
				}
			} else {
				if (!isEven(b[i])) {
					int temp = even;
					even = odd;
					odd = temp;
				}
			}
		}

		return String.format("%d %d", even, odd);
	}

	static boolean isEven(int x) {
		return x % 2 == 0;
	}
}
