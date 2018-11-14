import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int N = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(solve(A, N, K));

		sc.close();
	}

	static String solve(int A, int N, int K) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < K; i++) {
			result.add(A % (N + 1));
			A /= N + 1;
		}
		return String.join(" ", result.stream().map(String::valueOf).collect(Collectors.toList()));
	}
}
