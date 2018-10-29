import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 0; tc < T; tc++) {
			String[] parts = sc.nextLine().split(" ");

			System.out.println(solve(parts));
		}

		sc.close();
	}

	static String solve(String[] parts) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < parts.length; i++) {
			if (i != 0) {
				result.append(" ");
			}

			result.append(Character.toUpperCase(parts[i].charAt(0)));
			if (i == parts.length - 1) {
				result.append(parts[i].substring(1).toLowerCase());
			} else {
				result.append(".");
			}
		}
		return result.toString();
	}
}
