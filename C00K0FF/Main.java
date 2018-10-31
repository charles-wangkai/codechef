import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			String[] difficulties = new String[N];
			for (int i = 0; i < difficulties.length; i++) {
				difficulties[i] = sc.next();
			}

			System.out.println(solve(difficulties) ? "Yes" : "No");
		}

		sc.close();
	}

	static boolean solve(String[] difficulties) {
		Map<String, Integer> difficultyToCount = new HashMap<>();
		for (String difficulty : difficulties) {
			difficultyToCount.put(difficulty, difficultyToCount.getOrDefault(difficulty, 0) + 1);
		}

		return difficultyToCount.getOrDefault("cakewalk", 0) >= 1 && difficultyToCount.getOrDefault("simple", 0) >= 1
				&& difficultyToCount.getOrDefault("easy", 0) >= 1
				&& difficultyToCount.getOrDefault("easy-medium", 0) + difficultyToCount.getOrDefault("medium", 0) >= 1
				&& difficultyToCount.getOrDefault("medium-hard", 0) + difficultyToCount.getOrDefault("hard", 0) >= 1;
	}
}
