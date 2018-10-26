import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String A = sc.next();
			String B = sc.next();

			System.out.println(solve(A, B) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(String A, String B) {
		Set<Integer> lettersA = A.chars().boxed().collect(Collectors.toSet());
		return B.chars().anyMatch(ch -> lettersA.contains(ch));
	}
}
