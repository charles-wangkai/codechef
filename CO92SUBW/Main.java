import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int X = sc.nextInt();

			System.out.println(solve(X));
		}

		sc.close();
	}

	static int solve(int X) {
		int lowerStationId = (int) Math.floor(Math.sqrt(X * 2));
		int upperStationId = lowerStationId + 1;
		if (X < getLocation(lowerStationId)) {
			lowerStationId--;
			upperStationId--;
		} else if (X >= getLocation(upperStationId)) {
			lowerStationId++;
			upperStationId++;
		}

		return Math.min(lowerStationId + (X - getLocation(lowerStationId)),
				upperStationId + (getLocation(upperStationId) - X));
	}

	static int getLocation(int stationId) {
		return stationId * (stationId + 1) / 2;
	}
}
