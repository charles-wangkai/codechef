import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int number = sc.nextInt();

			System.out.println(solve(number));
		}

		sc.close();
	}

	static int solve(int number) {
		return (int) String.valueOf(number).chars().filter(ch -> ch == '4').count();
	}
}
