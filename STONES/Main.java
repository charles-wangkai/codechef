import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String J = sc.next();
			String S = sc.next();

			System.out.println(solve(J, S));
		}

		sc.close();
	}

	static int solve(String J, String S) {
		Set<Integer> setJ = J.chars().boxed().collect(Collectors.toSet());
		return (int) S.chars().filter(ch -> setJ.contains(ch)).count();
	}
}
