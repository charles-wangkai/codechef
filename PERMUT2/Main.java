import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int[] permutation = new int[n];
			for (int i = 0; i < permutation.length; i++) {
				permutation[i] = sc.nextInt();
			}
			System.out.println(solve(permutation) ? "ambiguous" : "not ambiguous");
		}

		sc.close();
	}

	static boolean solve(int[] permutation) {
		return IntStream.range(0, permutation.length)
				.allMatch(i -> permutation[i] == i + 1 || permutation[permutation[i] - 1] == i + 1);
	}
}
