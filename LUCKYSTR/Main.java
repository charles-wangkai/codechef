import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int N = sc.nextInt();
		String[] A = readArray(sc, K);
		String[] B = readArray(sc, N);
		System.out.println(solve(A, B));

		sc.close();
	}

	static String[] readArray(Scanner sc, int size) {
		String[] result = new String[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.next();
		}
		return result;
	}

	static String solve(String[] A, String[] B) {
		return String.join("\n",
				Arrays.stream(B).map(
						Bi -> (Bi.length() >= 47 || Arrays.stream(A).anyMatch(Ai -> Bi.contains(Ai))) ? "Good" : "Bad")
						.collect(Collectors.toList()));
	}
}
