import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String P = sc.next();

			System.out.println(solve(P));
		}

		sc.close();
	}

	static int solve(String P) {
		int result = 0;
		int jump = 1;
		int prevIndex = 0;
		for (int i = 0; i < P.length(); i++) {
			if (P.charAt(i) == '#') {
				int distance = i - prevIndex;
				if (distance > jump) {
					jump = distance;
					result++;
				}

				prevIndex = i;
			}
		}
		return result;
	}
}
