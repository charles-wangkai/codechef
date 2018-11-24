import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int DS = sc.nextInt();
			int DT = sc.nextInt();
			int D = sc.nextInt();

			System.out.println(solve(DS, DT, D));
		}

		sc.close();
	}

	static double solve(int DS, int DT, int D) {
		int[] sorted = Arrays.asList(DS, DT, D).stream().mapToInt(x -> x).sorted().toArray();
		return Math.max(0, sorted[2] - sorted[0] - sorted[1]);
	}
}
