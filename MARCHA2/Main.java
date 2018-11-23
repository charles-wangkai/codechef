import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int k = sc.nextInt();
			int[] leaves = new int[k];
			for (int i = 0; i < leaves.length; i++) {
				leaves[i] = sc.nextInt();
			}

			System.out.println(solve(leaves) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(int[] leaves) {
		int stem = 1;
		for (int leaf : leaves) {
			if (leaf > stem) {
				return false;
			}

			stem = (stem - leaf) * 2;
		}
		return stem == 0;
	}
}
