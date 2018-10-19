import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int p = sc.nextInt();

			System.out.println(solve(p));
		}

		sc.close();
	}

	static int solve(int p) {
		int menuNum = 0;
		for (int price = 2048; price != 0; price /= 2) {
			menuNum += p / price;
			p %= price;
		}
		return menuNum;
	}
}
