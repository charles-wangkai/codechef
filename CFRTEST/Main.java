import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			int[] d = new int[n];
			for (int i = 0; i < d.length; i++) {
				d[i] = sc.nextInt();
			}

			System.out.println(solve(d));
		}

		sc.close();
	}

	static int solve(int[] d) {
		return Arrays.stream(d).boxed().collect(Collectors.toSet()).size();
	}
}
