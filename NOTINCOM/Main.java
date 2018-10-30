import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] A = readArray(sc, N);
			int[] B = readArray(sc, M);

			System.out.println(solve(A, B));
		}

		sc.close();
	}

	static int[] readArray(Scanner sc, int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static int solve(int[] A, int[] B) {
		Set<Integer> setB = Arrays.stream(B).boxed().collect(Collectors.toSet());
		return (int) Arrays.stream(A).filter(x -> setB.contains(x)).count();
	}
}
