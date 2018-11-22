import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int N = sc.nextInt();

			if (N == 0) {
				break;
			}

			int[] L = new int[N];
			for (int i = 0; i < L.length; i++) {
				L[i] = sc.nextInt();
			}

			System.out.println(solve(L));
		}

		sc.close();
	}

	static int solve(int[] L) {
		Arrays.sort(L);

		int result = 0;
		for (int i = 0; i < L.length; i++) {
			for (int j = i + 1; j < L.length; j++) {
				int index = Arrays.binarySearch(L, L[i] + L[j] + 1);
				if (index < 0) {
					index = -1 - index;
				}

				while (index > 0 && L[index - 1] > L[i] + L[j]) {
					index--;
				}

				result += L.length - index;
			}
		}
		return result;
	}
}
