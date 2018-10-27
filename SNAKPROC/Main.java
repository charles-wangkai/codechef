import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int R = sc.nextInt();
		for (int tc = 0; tc < R; tc++) {
			sc.nextInt();
			String L = sc.next();

			System.out.println(solve(L) ? "Valid" : "Invalid");
		}

		sc.close();
	}

	static boolean solve(String L) {
		char expected = 'H';
		for (char ch : L.toCharArray()) {
			if (ch != '.' && ch != expected) {
				return false;
			}

			if (ch == 'H') {
				expected = 'T';
			} else if (ch == 'T') {
				expected = 'H';
			}
		}
		return expected == 'H';
	}
}
