import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.next();
			String gestures = sc.next();

			System.out.println(solve(gestures));
		}

		sc.close();
	}

	static String solve(String gestures) {
		if (gestures.chars().anyMatch(gesture -> gesture == 'I')) {
			return "INDIAN";
		} else if (gestures.chars().anyMatch(gesture -> gesture == 'Y')) {
			return "NOT INDIAN";
		} else {
			return "NOT SURE";
		}
	}
}
