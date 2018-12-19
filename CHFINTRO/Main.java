import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int r = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int R = sc.nextInt();

			System.out.println(solve(r, R) ? "Good boi" : "Bad boi");
		}

		sc.close();
	}

	static boolean solve(int r, int R) {
		return R >= r;
	}
}
