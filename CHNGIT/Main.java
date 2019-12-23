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
		Map<Integer, Integer> valueToCount = new HashMap<>();
		for (int value : A) {
			valueToCount.put(value, valueToCount.getOrDefault(value, 0) + 1);
		}

		return A.length - valueToCount.values().stream().mapToInt(x -> x).max().getAsInt();
	}
}
