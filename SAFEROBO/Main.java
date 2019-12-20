import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String s = sc.next();
			int sa = sc.nextInt();
			int sb = sc.nextInt();

			System.out.println(solve(s, sa, sb) ? "safe" : "unsafe");
		}

		sc.close();
	}

	static boolean solve(String s, int sa, int sb) {
		return (s.indexOf('B') - s.indexOf('A')) % (sa + sb) != 0;
	}
}
