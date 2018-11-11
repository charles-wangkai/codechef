import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String s = sc.next();

			System.out.println(solve(s) ? "safe" : "unsafe");
		}

		sc.close();
	}

	static boolean solve(String s) {
		int prevIndex = -1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != '.') {
				if (prevIndex >= 0) {
					if (i - prevIndex - 1 < (ch - '0') + (s.charAt(prevIndex)) - '0') {
						return false;
					}
				}

				prevIndex = i;
			}
		}
		return true;
	}
}
