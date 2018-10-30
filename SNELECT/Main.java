import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String s = sc.next();

			System.out.println(solve(s));
		}

		sc.close();
	}

	static String solve(String s) {
		StringBuilder line = new StringBuilder(s);
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 's') {
				if (i > 0 && line.charAt(i - 1) == 'm') {
					line.setCharAt(i, ' ');
					line.setCharAt(i - 1, 'M');
				} else if (i + 1 < s.length() && line.charAt(i + 1) == 'm') {
					line.setCharAt(i, ' ');
					line.setCharAt(i + 1, 'M');
				}
			}
		}

		int snakeNum = (int) line.chars().filter(ch -> ch == 's').count();
		int mongooseNum = (int) line.toString().toLowerCase().chars().filter(ch -> ch == 'm').count();

		if (snakeNum > mongooseNum) {
			return "snakes";
		} else if (snakeNum < mongooseNum) {
			return "mongooses";
		} else {
			return "tie";
		}
	}
}
