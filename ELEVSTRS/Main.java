import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			sc.nextInt();
			int V1 = sc.nextInt();
			int V2 = sc.nextInt();

			System.out.println(solve(V1, V2));
		}

		sc.close();
	}

	static String solve(int V1, int V2) {
		return (V1 * V1 * 2 > V2 * V2) ? "Stairs" : "Elevator";
	}
}
