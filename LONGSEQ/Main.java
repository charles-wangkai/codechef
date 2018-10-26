import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String D = sc.next();

			System.out.println(solve(D) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(String D) {
		return D.chars().filter(ch -> ch == '0').count() == 1 || D.chars().filter(ch -> ch == '1').count() == 1;
	}
}
