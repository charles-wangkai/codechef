import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int lengthN = sc.nextInt();
			int[] N = readArray(sc, lengthN);
			int lengthF = sc.nextInt();
			int[] F = readArray(sc, lengthF);

			System.out.println(solve(N, F) ? "Yes" : "No");
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

	static boolean solve(int[] N, int[] F) {
		Set<Integer> setN = Arrays.stream(N).boxed().collect(Collectors.toSet());

		return Arrays.stream(F).allMatch(x -> setN.contains(x));
	}
}
