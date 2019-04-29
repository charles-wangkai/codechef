import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String[] firstNames = new String[N];
			String[] lastNames = new String[N];
			for (int i = 0; i < N; i++) {
				firstNames[i] = sc.next();
				lastNames[i] = sc.next();
			}

			System.out.print(solve(firstNames, lastNames));
		}

		sc.close();
	}

	static String solve(String[] firstNames, String[] lastNames) {
		Map<String, Integer> firstNameToCount = new HashMap<>();
		for (String firstName : firstNames) {
			firstNameToCount.put(firstName, firstNameToCount.getOrDefault(firstName, 0) + 1);
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < firstNames.length; i++) {
			result.append(firstNames[i]);

			if (firstNameToCount.get(firstNames[i]) != 1) {
				result.append(" ").append(lastNames[i]);
			}

			result.append("\n");
		}
		return result.toString();
	}
}
