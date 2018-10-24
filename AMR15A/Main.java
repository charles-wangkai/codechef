import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(solve(A) ? "READY FOR BATTLE" : "NOT READY");

		sc.close();
	}

	static boolean solve(int[] A) {
		return Arrays.stream(A).filter(x -> x % 2 == 0).count() > Arrays.stream(A).filter(x -> x % 2 != 0).count();
	}
}
