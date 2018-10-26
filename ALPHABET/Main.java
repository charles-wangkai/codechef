import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		Set<Integer> knownLetters = S.chars().boxed().collect(Collectors.toSet());
		int N = sc.nextInt();
		for (int tc = 0; tc < N; tc++) {
			String W = sc.next();

			System.out.println(solve(knownLetters, W) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(Set<Integer> knownLetters, String W) {
		return W.chars().allMatch(ch -> knownLetters.contains(ch));
	}
}
