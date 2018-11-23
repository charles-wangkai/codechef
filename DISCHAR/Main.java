import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String A = sc.next();

			System.out.println(solve(A));
		}

		sc.close();
	}

	static int solve(String A) {
		return (int) A.chars().distinct().count();
	}
}
