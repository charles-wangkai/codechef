import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N) ? "HOSTED" : "NOT HOSTED");
		}

		sc.close();
	}

	static boolean solve(int N) {
		return N == 2010 || N == 2015 || N == 2016 || N == 2017 || N == 2019;
	}
}
