import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String N = sc.next();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static int solve(String N) {
		return (int) N.chars().filter(ch -> ch != '4' && ch != '7').count();
	}
}
