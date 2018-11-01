import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int n = sc.nextInt();
			String[] records = new String[n];
			for (int i = 0; i < records.length; i++) {
				records[i] = sc.next();
			}

			System.out.println(solve(records));
		}

		sc.close();
	}

	static String solve(String[] records) {
		Map<String, Integer> teamToScore = new HashMap<>();
		for (String record : records) {
			teamToScore.put(record, teamToScore.getOrDefault(record, 0) + 1);
		}

		for (String team : teamToScore.keySet()) {
			if (teamToScore.get(team) * 2 > records.length) {
				return team;
			}
		}
		return "Draw";
	}
}
