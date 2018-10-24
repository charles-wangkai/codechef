import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int B = sc.nextInt();

			System.out.println(solve(B));
		}

		sc.close();
	}

	static int solve(int B) {
		return (B / 2) * (B / 2 - 1) / 2;
	}
}
