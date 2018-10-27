import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			System.out.println(solve(a, b, c, d) ? "YES" : "NO");
		}

		sc.close();
	}

	static boolean solve(int a, int b, int c, int d) {
		List<Integer> lengths = Arrays.asList(a, b, c, d).stream().sorted().collect(Collectors.toList());
		return lengths.get(0).equals(lengths.get(1)) && lengths.get(2).equals(lengths.get(3));
	}
}
