import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(solve(a, b));
		}

		sc.close();
	}

	static int solve(int a, int b) {
		int result = 0;
		int placeValue = 1;
		while (a != 0 || b != 0) {
			result += (a + b) % 10 * placeValue;

			a /= 10;
			b /= 10;
			placeValue *= 10;
		}
		return result;
	}
}
