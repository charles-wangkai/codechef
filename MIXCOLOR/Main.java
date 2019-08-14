import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static int solve(int[] A) {
		Map<Integer, Integer> colorToCount = new HashMap<>();
		for (int color : A) {
			colorToCount.put(color, colorToCount.getOrDefault(color, 0) + 1);
		}

		return colorToCount.values().stream().mapToInt(count -> count - 1).sum();
	}
}
