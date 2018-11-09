import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			int S = sc.nextInt();
			Swap[] swaps = new Swap[S];
			for (int i = 0; i < swaps.length; i++) {
				int index1 = sc.nextInt();
				int index2 = sc.nextInt();

				swaps[i] = new Swap(index1, index2);
			}

			System.out.println(solve(N, X, swaps));
		}

		sc.close();
	}

	static int solve(int N, int X, Swap[] swaps) {
		int coin = X;
		for (Swap swap : swaps) {
			if (swap.index1 == coin) {
				coin = swap.index2;
			} else if (swap.index2 == coin) {
				coin = swap.index1;
			}
		}
		return coin;
	}
}

class Swap {
	int index1;
	int index2;

	Swap(int index1, int index2) {
		this.index1 = index1;
		this.index2 = index2;
	}
}