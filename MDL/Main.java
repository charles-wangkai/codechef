import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			List<Integer> A = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				A.add(sc.nextInt());
			}

			System.out.println(solve(A));
		}

		sc.close();
	}

	static String solve(List<Integer> A) {
		while (A.size() >= 3) {
			int median = A.subList(0, 3).stream().sorted().skip(1).findFirst().get();

			for (int i = 0;; i++) {
				if (A.get(i) == median) {
					A.remove(i);

					break;
				}
			}
		}

		return A.stream().map(String::valueOf).collect(Collectors.joining(" "));
	}
}
