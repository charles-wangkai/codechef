import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; ++tc) {
			int finish = sc.nextInt();
			int distancetoBolt = sc.nextInt();
			int tigerAccelaration = sc.nextInt();
			int boltSpeed = sc.nextInt();

			System.out.println(solve(finish, distancetoBolt, tigerAccelaration, boltSpeed));
		}

		sc.close();
	}

	static String solve(int finish, int distancetoBolt, int tigerAccelaration, int boltSpeed) {
		return ((long) finish * finish * tigerAccelaration < 2L * (distancetoBolt + finish) * boltSpeed * boltSpeed)
				? "Bolt"
				: "Tiger";
	}
}
