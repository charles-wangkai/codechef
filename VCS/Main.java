import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			int[] ignored = readArray(sc, M);
			int[] tracked = readArray(sc, K);

			System.out.println(solve(N, ignored, tracked));
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

	static String solve(int N, int[] ignored, int[] tracked) {
		Set<Integer> ignoredSet = Arrays.stream(ignored).boxed().collect(Collectors.toSet());
		Set<Integer> trackedSet = Arrays.stream(tracked).boxed().collect(Collectors.toSet());

		int bothNum = (int) IntStream.rangeClosed(1, N).filter(i -> ignoredSet.contains(i) && trackedSet.contains(i))
				.count();
		int neitherNum = (int) IntStream.rangeClosed(1, N)
				.filter(i -> !ignoredSet.contains(i) && !trackedSet.contains(i)).count();

		return String.format("%d %d", bothNum, neitherNum);
	}
}
