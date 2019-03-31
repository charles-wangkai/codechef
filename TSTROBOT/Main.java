import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			int X = sc.nextInt();
			String S = sc.next();

			System.out.println(solve(S, X));
		}

		sc.close();
	}

	static int solve(String S, int X) {
		int minPos = 0;
		int maxPos = 0;
		int pos = 0;
		for (char command : S.toCharArray()) {
			if (command == 'L') {
				pos--;
				minPos = Math.min(minPos, pos);
			} else if (command == 'R') {
				pos++;
				maxPos = Math.max(maxPos, pos);
			}
		}
		return maxPos - minPos + 1;
	}
}
