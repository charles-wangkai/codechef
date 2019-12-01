import java.util.ArrayList;
import java.util.List;
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

	static String solve(int[] A) {
		List<String> ranges = new ArrayList<>();
		int length = 1;
		for (int i = 1; i <= A.length; i++) {
			if (i < A.length && A[i] - A[i - 1] == 1) {
				length++;
			} else {
				if (length >= 3) {
					ranges.add(String.format("%d...%d", A[i - length], A[i - 1]));
				} else {
					for (int j = i - length; j < i; j++) {
						ranges.add(String.valueOf(A[j]));
					}
				}

				length = 1;
			}
		}

		return String.join(",", ranges);
	}
}
