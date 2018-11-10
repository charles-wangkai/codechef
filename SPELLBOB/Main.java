import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String top = sc.next();
			String bottom = sc.next();

			System.out.println(solve(top, bottom) ? "yes" : "no");
		}

		sc.close();
	}

	static boolean solve(String top, String bottom) {
		return check(top, bottom, 0, 1, 2) || check(top, bottom, 0, 2, 1) || check(top, bottom, 1, 0, 2)
				|| check(top, bottom, 1, 2, 0) || check(top, bottom, 2, 0, 1) || check(top, bottom, 2, 1, 0);
	}

	static boolean check(String top, String bottom, int index1, int index2, int index3) {
		return (top.charAt(index1) == 'b' || bottom.charAt(index1) == 'b')
				&& (top.charAt(index2) == 'o' || bottom.charAt(index2) == 'o')
				&& (top.charAt(index3) == 'b' || bottom.charAt(index3) == 'b');
	}
}
