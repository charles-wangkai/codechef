import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 0; tc < T; tc++) {
			String s = sc.nextLine();

			System.out.println(solve(s));
		}

		sc.close();
	}

	static String solve(String s) {
		if (!(s.length() == 5 && s.charAt(2) == '-' && isCell(s.substring(0, 2)) && isCell(s.substring(3)))) {
			return "Error";
		}

		return (Math.abs((s.charAt(0) - s.charAt(3)) * (s.charAt(1) - s.charAt(4))) == 2) ? "Yes" : "No";
	}

	static boolean isCell(String a) {
		return a.charAt(0) >= 'a' && a.charAt(0) <= 'h' && a.charAt(1) >= '1' && a.charAt(1) <= '8';
	}
}
