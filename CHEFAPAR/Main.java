import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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
		int firstZeroIndex = Arrays.stream(A).boxed().collect(Collectors.toList()).indexOf(0);
		return (int) Arrays.stream(A).filter(x -> x == 0).count() * 1000
				+ ((firstZeroIndex < 0) ? 0 : (A.length - firstZeroIndex)) * 100;
	}
}
