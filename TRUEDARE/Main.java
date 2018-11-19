import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int[] Tr = readArray(sc);
			int[] Dr = readArray(sc);
			int[] Ts = readArray(sc);
			int[] Ds = readArray(sc);

			System.out.println(solve(Tr, Dr, Ts, Ds) ? "yes" : "no");
		}

		sc.close();
	}

	static int[] readArray(Scanner sc) {
		int size = sc.nextInt();
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	static boolean solve(int[] Tr, int[] Dr, int[] Ts, int[] Ds) {
		return contains(Tr, Ts) && contains(Dr, Ds);
	}

	static boolean contains(int[] r, int[] s) {
		Set<Integer> rSet = Arrays.stream(r).boxed().collect(Collectors.toSet());
		return Arrays.stream(s).allMatch(x -> rSet.contains(x));
	}
}
