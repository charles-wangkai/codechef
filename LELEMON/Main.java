import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] P = readArray(sc, m);
			int[][] bottles = new int[n][];
			for (int i = 0; i < bottles.length; i++) {
				int Ci = sc.nextInt();
				bottles[i] = readArray(sc, Ci);
			}

			System.out.println(solve(P, bottles));
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

	static int solve(int[] P, int[][] bottles) {
		int[] counts = new int[bottles.length];
		for (int Pi : P) {
			counts[Pi]++;
		}

		int result = 0;
		for (int i = 0; i < bottles.length; i++) {
			Arrays.sort(bottles[i]);

			int drinkNum = Math.min(counts[i], bottles[i].length);
			for (int j = bottles[i].length - 1; j >= bottles[i].length - drinkNum; j--) {
				result += bottles[i][j];
			}
		}
		return result;
	}
}
