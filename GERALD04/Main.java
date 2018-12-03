import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			String time1 = sc.next();
			String time2 = sc.next();
			int dist = sc.nextInt();

			System.out.println(solve(time1, time2, dist));
		}

		sc.close();
	}

	static String solve(String time1, String time2, int dist) {
		int station1 = convertToMinute(time1);
		int station2 = convertToMinute(time2);

		double plan1 = station1 - station2 + dist;
		double plan2 = Math.max((dist + station1 - station2 + dist) / 2.0, station1 - station2);

		return String.format("%.1f %.1f", plan1, plan2);
	}

	static int convertToMinute(String time) {
		return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
	}
}
