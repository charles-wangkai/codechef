import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int activityNum = sc.nextInt();
			String origin = sc.next();
			sc.nextLine();
			String[] activities = new String[activityNum];
			for (int i = 0; i < activities.length; i++) {
				activities[i] = sc.nextLine();
			}

			System.out.println(solve(activities, origin));
		}

		sc.close();
	}

	static int solve(String[] activities, String origin) {
		int laddu = 0;
		for (String activity : activities) {
			String[] parts = activity.split(" ");
			if (parts[0].equals("CONTEST_WON")) {
				int rank = Integer.parseInt(parts[1]);

				laddu += 300 + Math.max(0, 20 - rank);
			} else if (parts[0].equals("TOP_CONTRIBUTOR")) {
				laddu += 300;
			} else if (parts[0].equals("BUG_FOUND")) {
				int severity = Integer.parseInt(parts[1]);

				laddu += severity;
			} else if (parts[0].equals("CONTEST_HOSTED")) {
				laddu += 50;
			}
		}
		return laddu / (origin.equals("INDIAN") ? 200 : 400);
	}
}
