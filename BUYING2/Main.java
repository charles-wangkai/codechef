import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A, X));
		}

		sc.close();
	}

	static int solve(int[] A, int X) {
		int sum = Arrays.stream(A).sum();
		int min = Arrays.stream(A).min().getAsInt();

		int totalNumber = sum / X;
		int maxNumber = (sum - min) / X;

		return (maxNumber == totalNumber) ? -1 : totalNumber;
	}
}
