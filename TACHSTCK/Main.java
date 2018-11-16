import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int D = sc.nextInt();
		int[] L = new int[N];
		for (int i = 0; i < L.length; i++) {
			L[i] = sc.nextInt();
		}
		System.out.println(solve(L, D));

		sc.close();
	}

	static int solve(int[] L, int D) {
		Arrays.sort(L);

		int result = 0;
		int index = 0;
		while (index + 1 < L.length) {
			if (L[index + 1] - L[index] <= D) {
				result++;
				index += 2;
			} else {
				index++;
			}
		}
		return result;
	}
}
