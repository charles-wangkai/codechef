import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int X1 = sc.nextInt();
			int X2 = sc.nextInt();
			int X3 = sc.nextInt();
			int V1 = sc.nextInt();
			int V2 = sc.nextInt();

			System.out.println(solve(X1, X2, X3, V1, V2));
		}

		sc.close();
	}

	static String solve(int X1, int X2, int X3, int V1, int V2) {
		int cmp = Long.compare((long) (X3 - X1) * V2, (long) (X2 - X3) * V1);
		if (cmp < 0) {
			return "Chef";
		} else if (cmp > 0) {
			return "Kefa";
		} else {
			return "Draw";
		}
	}
}
