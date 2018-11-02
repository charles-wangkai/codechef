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
		char prevTribe = 0;
		int prevIndex = -1;
		int resultA = 0;
		int resultB = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '.') {
				continue;
			}

			if (ch == 'A') {
				resultA++;

				if (prevTribe == 'A') {
					resultA += i - prevIndex - 1;
				}
			} else if (ch == 'B') {
				resultB++;

				if (prevTribe == 'B') {
					resultB += i - prevIndex - 1;
				}
			}

			prevTribe = ch;
			prevIndex = i;
		}

		return String.format("%d %d", resultA, resultB);
	}
}
